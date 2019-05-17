package DesignPattern.observer;

import android.util.Log;

public class Lighting implements AlarmListener{
    public void alarm() {
        Log.i("Outcome","lights up");
    }
}
