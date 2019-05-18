package DesignPattern.visitor;

public class UpVisitor implements Visitor{
    public void visit(Foo foo) {
        System.out.println("do Up on " + foo.getFOO());
    }

    public void visit(Bar bar) {
        System.out.println("do Up on " + bar.getBAR());
    }

}
