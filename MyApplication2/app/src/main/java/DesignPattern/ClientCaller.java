package DesignPattern;

import DesignPattern.objectpool.DummyObject;
import DesignPattern.objectpool.ObjectPool;
import android.util.Log;

public class ClientCaller {
    public static void usePatterns(){
        ObjectPool.getInstance().setMaxPoolSize(5);
        ObjectPool.getInstance().acquireReusable(new DummyObject());
        DummyObject dob = ObjectPool.getInstance().releaseReusable();
        dob.mssgPrint();
        Log.i("Outcome", "Object pool active");
    }

}
