package DesignPattern.visitor;

public class DownVisitor implements Visitor{
    public void visit(Foo foo) {
        System.out.println("do Down on " + foo.getFOO());
    }

    public void visit(Bar bar) {
        System.out.println("do Down on " + bar.getBAR());
    }
}
