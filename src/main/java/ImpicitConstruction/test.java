package ImpicitConstruction;

public class test {

    public static void main(String[] args) {
        final implicitMain im = new implicitMain();
        System.out.println("From factory "+ new factory.titleFactory() {
            @Override
            public factory newFactory() {
                return null;
            }
        });
        System.out.println("Book factory "+ BookFactory.age());
        System.out.println("from sync singleton :"+singltonSynchronized.getInstance());
        System.out.println("from final singleton :"+singletonFinal.getInstance());
        System.out.println("from singleton :"+singleton.getInstance());

    }
}
