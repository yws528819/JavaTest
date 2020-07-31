package com.yws.pattern.visitor;

public interface Visitor {
	void visit(Engineer engineer);
	
	void visit(Manager manager);
}
