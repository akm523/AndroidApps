package DesignPattern.abstractfactory;

public abstract class AbstractFactory {

    private static final EmberToolkit EMBER_TOOLKIT = new EmberToolkit();
    private static final EngiloToolkit ENGINOLA_TOOLKIT = new EngiloToolkit();

    // Returns a concrete factory object that is an instance of the
    // concrete factory class appropriate for the given architecture.
    static public AbstractFactory getFactory(Archi type) {
        AbstractFactory factory = null;
        switch (type) {
            case ENGINOLA:
                factory = ENGINOLA_TOOLKIT;
                break;
            case EMBER:
                factory = EMBER_TOOLKIT;
                break;
        }
        return factory;
    }

    public abstract CPU createCPU();

    public abstract MMU createMMU();
}
