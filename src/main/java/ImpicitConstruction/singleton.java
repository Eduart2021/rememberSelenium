package ImpicitConstruction;

public class singleton {
    /**
     * Singleton
     * one instance only from this class will be created
     *
     * it might create many instance if it is called from many threads
     */
    private static singleton instance;
    private singleton(){
    }
    public static singleton getInstance(){
        if(instance == null){
            instance = new singleton();
        }
        return instance;
    }
}

