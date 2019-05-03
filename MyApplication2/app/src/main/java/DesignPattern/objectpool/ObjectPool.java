package DesignPattern.objectpool;

public class ObjectPool {
    DummyObject []objs;
    private static ObjectPool instanc=null;
    public static ObjectPool getInstance(){
        if(instanc==null) {
            instanc =new ObjectPool();
            return instanc;
        }
        else return instanc;
    }

    public DummyObject releaseReusable(){
        DummyObject dob = objs[0];
        objs[0] = null;
        return dob;
    }

    public DummyObject acquireReusable(DummyObject dob){
        objs[0] = dob;
        return dob;
    }
    public void setMaxPoolSize(int size){
        objs = new DummyObject[size];
        objs[0] = new DummyObject();

    }

}
