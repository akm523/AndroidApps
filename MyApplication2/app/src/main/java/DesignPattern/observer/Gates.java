package DesignPattern.observer;

import android.util.Log;

public class Gates implements AlarmListener{
    public void alarm() {
        Log.i("Outcome","gates close");
    }
}
