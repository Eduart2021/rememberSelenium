package classAndInterface;

public interface simpleInterface {
    // are all public and abstract by default

    String  CONSTANT = "Final Constant";

    enum InnerEnum{
        E1,E2;
    }

    public abstract void perform1();
    abstract void perform2();
    void performAction();


}
