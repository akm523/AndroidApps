package DesignPattern.Singletone;

public class SingleTone {
private static SingleTone instance=null;
public SingleTone getObject(){
    if(instance==null)
    return new SingleTone();
    else return instance;
}
}
