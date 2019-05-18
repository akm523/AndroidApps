package DesignPattern.visitor;

public class VisitorDemo {
    public static void callVisitor() {
        Element[] list = {new Foo(), new Bar()};
        UpVisitor up = new UpVisitor();
        DownVisitor down = new DownVisitor();
        for (Element element : list) {
            element.accept(up);
        }
        for (Element element : list) {
            element.accept(down);
        }
    }
}
