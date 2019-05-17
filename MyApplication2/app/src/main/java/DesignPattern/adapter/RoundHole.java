package DesignPattern.adapter;

import android.util.Log;

public class RoundHole {
    private final int radius;

    public RoundHole(int radius) {
        this.radius = radius;
        Log.i("Outcome","RoundHole: max SquarePeg is " + radius * Math.sqrt(2));
    }

    public int getRadius() {
        return radius;
    }
}
