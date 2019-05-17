package DesignPattern.observer;

import android.util.Log;

public class Surveillance extends CheckList implements AlarmListener{
    public void alarm() {
        Log.i("Outcome","Surveillance - by the numbers:");
        byTheNumbers();
    }

    protected void isolate() {
        Log.i("Outcome","   train the cameras");
    }
}
