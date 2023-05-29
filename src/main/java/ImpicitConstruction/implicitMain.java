package ImpicitConstruction;

public class implicitMain {
    /** Access permission
     * public : package, subclass, everyone els
     * protected : package, subclass
     * <no modifier> : package
     * private : inside the class only
     */
    private boolean booleanMode;
    private byte byteMode;
    private short shortMode;
    private int intMode;
    private long longMode;
    private char charMode;
    private double doubleMode;
    private Object objectMode;

    public implicitMain(){
        System.out.println("boolean "+booleanMode);
        System.out.println("byte "+byteMode);
        System.out.println("short "+shortMode);
        System.out.println("int "+intMode);
        System.out.println("long "+longMode);
        System.out.println("char "+charMode);
        System.out.println("double "+doubleMode);
        System.out.println("Object "+objectMode);
    }

    /**
     * inside the class only
     * static {//code}
     */
    static {
        // code here
    }
}
