package DesignPattern.composit;

public class CompositeDemo {
    public static void calldemon() {
        Composite first  = new Row( 1 );

        Composite fourth = new Row( 4 );
        Composite fifth  = new Row( 5 );

        first.add(new Primitive(6));

        fourth.add(new Primitive(9));
        fifth.add(new Primitive(10));
        first.traverse();
    }
}
