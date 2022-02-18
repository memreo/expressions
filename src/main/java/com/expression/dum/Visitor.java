package com.expression.dum;

public interface Visitor {
    public void visit(Const c);
    public void visit(Add add);
}
