package ImpicitConstruction;

public class factory implements BookFactory {
    private factory(final String title){}

    // abstract
    public static factory newFactory(final String title){
        return new factory(title);
    }
    // interface
    public interface titleFactory{
        factory newFactory();
    }
}

