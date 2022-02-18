package com.expression.dum;

public class Add extends Expression {
    private Expression left, right;

    public Add(Expression l, Expression r){
        left = l;
        right = r;

    }

    public Expression getLeft(){
        return left;
    }
    public Expression getRight(){
        return right;
    }

    public void accept(Visitor visitor){
        visitor.visit(this);
    }
}
