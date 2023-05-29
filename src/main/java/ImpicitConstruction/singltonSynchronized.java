package ImpicitConstruction;

public class singltonSynchronized {
        /**
         * Singleton
         * one instance only from this class will be created
         *
         * it might create many instance if it is called from many threads
         */
        private static singltonSynchronized instance;
        private singltonSynchronized(){
        }
        public static synchronized singltonSynchronized getInstance(){
            if(instance == null){
                instance = new singltonSynchronized();
            }
            return instance;
        }
}
