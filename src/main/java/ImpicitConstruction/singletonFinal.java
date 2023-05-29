package ImpicitConstruction;

public class singletonFinal {

    /**
     * it will create only one instance
     * the creation will be final
     */
    private static final singletonFinal instance = new singletonFinal();
    private singletonFinal(){}
    public static singletonFinal getInstance(){
        return instance;
    }
}
