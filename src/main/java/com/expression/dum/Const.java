package com.expression.dum;

public class Const extends Expression{
    private int n;
    public Const(int x){
        n = x;
    }
    public int getValue(){
        return n;
    }
    public void accept(Visitor visitor){
        visitor.visit(this);
    }
    
}
