package com.expression.dum;

public class ConstCounter implements Visitor {
    int count = 0;

    public void visit(Const c){
        count++;
    }

    public void visit(Add add){
        add.getLeft().accept(this);
        add.getRight().accept(this);
    }

    public int getCount(){
        return count;
    }

    public static void main(String[] args) {
        Add add = new Add(new Const(1), new Const(2));
        ConstCounter counter = new ConstCounter();
        add.accept(counter);
        System.out.println(counter.getCount());
    }
}
