package DesignPattern.chainduity;

import java.util.Random;

public class Processor {
    private static final Random RANDOM = new Random();
    private static int nextID = 1;
    private int id = nextID++;

    public boolean execute(Imag img) {
        if (RANDOM.nextInt(2) != 0) {
            System.out.println("   Processor " + id + " is busy");
            return false;
        }
        System.out.println("Processor " + id + " - " + img.process());
        return true;
    }
}
