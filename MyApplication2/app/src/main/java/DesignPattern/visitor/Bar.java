package DesignPattern.visitor;

public class Bar implements Element {
    public void   accept( Visitor v ) {
        v.visit( this );
    }

    public String getBAR() {
        return "BAR";
    }
}
