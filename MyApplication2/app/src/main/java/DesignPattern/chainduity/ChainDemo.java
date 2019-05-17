package DesignPattern.chainduity;

public class ChainDemo {
    public static void callDemo() {
        Imag[] inputImages = {new IR(), new IR(), new Ls(), new IR(), new Ls(), new Ls()};
        Processor[] processors = {new Processor(), new Processor(), new Processor()};
        for (int i=0, j; i < inputImages.length; i++) {
            System.out.println("Operation #" + (i + 1) + ":");
            j = 0;
            while (!processors[j].execute(inputImages[i])) {
                j = (j + 1) % processors.length;
            }
            System.out.println();
        }
    }
}
