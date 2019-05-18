package DesignPattern;

import DesignPattern.abstractfactory.AbstractFactory;
import DesignPattern.abstractfactory.Archi;
import DesignPattern.abstractfactory.CPU;
import DesignPattern.adapter.AdapterDemoSquarePeg;
import DesignPattern.adapter.AdapterPatternDemo;
import DesignPattern.builder.PizzaDemo;
import DesignPattern.chainduity.ChainDemo;
import DesignPattern.composit.CompositeDemo;
import DesignPattern.decorator.DecoratorDemo;
import DesignPattern.factorymethod.Factory;
import DesignPattern.objectpool.DummyObject;
import DesignPattern.objectpool.ObjectPool;
import DesignPattern.observer.ObservserDemo;
import DesignPattern.prototype.Prototype;
import DesignPattern.visitor.VisitorDemo;
import android.util.Log;

public class ClientCaller {
    public static void usePatterns(){
        ObjectPool.getInstance().setMaxPoolSize(5);
        ObjectPool.getInstance().acquireReusable(new DummyObject());
        DummyObject dob = ObjectPool.getInstance().releaseReusable();
        dob.mssgPrint();
        Log.i("Outcome", "Object pool active");

        Factory.use("factory.gif");
        Prototype proto = new Prototype();
        Log.i("Outcome", proto.getPrototype("tom").toString());

        AbstractFactory factory = AbstractFactory.getFactory(Archi.EMBER);
        CPU cpu = factory.createCPU();

        PizzaDemo.buildPizza();

        AdapterDemoSquarePeg.adapterCall();
        ObservserDemo.observerTest();
        ChainDemo.callDemo();
        CompositeDemo.calldemon();
        AdapterPatternDemo.callAdapter();
        DecoratorDemo.callDecorator();
        VisitorDemo.callVisitor();
    }

}
