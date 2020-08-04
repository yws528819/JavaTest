package com.yws.ext;

import java.util.concurrent.ExecutionException;

public class Singleton {

    /**
     * instance为何要有volatile 修饰：
     *
     * 这个问题就涉及到了编译原理，所谓编译，就是把源代码“翻译”成目标代码——大多数是指机器代码——的过程。
     * 针对Java，它的目标代码不是本地机器代码，而是虚拟机代码。编译原理里面有一个很重要的内容是编译器优化。
     * 所谓编译器优化是指，在不改变原来语义的情况下，通过调整语句顺序，来让程序运行的更快。这个过程成为reorder。
     *
     * JVM实现可以自由的进行编译器优化。而我们创建变量的步骤：
     *
     * 1、申请一块内存，调用构造方法进行初始化。
     * 2、分配一个指针指向这块内存。
     *
     * 而这两个操作，JVM并没有规定谁在前谁在后，
     * 那么就存在这种情况：线程A开始创建SingletonClass的实例，此时线程B调用了getInstance()方法，首先判断instance是否为null。
     * 按照我们上面所说的内存模型，A已经把instance指向了那块内存，只是还没有调用构造方法，因此B检测到instance不为null，于是直接把instance返回了——问题出现了，
     * 尽管instance不为null，但它并没有构造完成，就像一套房子已经给了你钥匙，但你并不能住进去，因为里面还没有收拾。此
     * 时，如果B在A将instance构造完成之前就是用了这个实例，程序就会出现错误了。
     *
     * 在JDK 5之后，Java使用了新的内存模型。
     * volatile关键字有了明确的语义——在JDK1.5之前，volatile是个关键字，但是并没有明确的规定其用途——被volatile修饰的写变量不能和之前的读写代码调整，读变量不能和之后的读写代码调整！
     * 因此，只要我们简单的把instance加上volatile关键字就可以了。
     */
    private volatile static Singleton singleton = null;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        for (int i = 1; i < 200 ; i++) {

            new Thread(() -> {
                Singleton singleton = Singleton.getInstance();
            }, "A" + i).start();
        }
    }
}


