package DesignPattern.observer;

import android.util.Log;

public class CheckList {
    public void byTheNumbers() {
        localize();
        isolate();
        identify();
    }

    protected void localize() {
        Log.i("Outcome","   establish a perimeter");
    }

    protected void isolate() {
        Log.i("Outcome","   isolate the grid");
    }

    protected void identify() {
        Log.i("Outcome","   identify the source");
    }
}
