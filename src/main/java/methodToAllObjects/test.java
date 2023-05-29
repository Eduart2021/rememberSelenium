package methodToAllObjects;

public class test {

    public static void main(String[] args) {
    equalsHashCode eh = new equalsHashCode("Molla","Dardha","test@test.com");
     Object obj = new String[]{"Molla", "Dardha", "test@test.com"};
        System.out.println(eh.hashCode());
        System.out.println(eh.getFirstName());
        System.out.println(eh.getLastName());
        System.out.println(eh.getEmail());
        System.out.println(eh.toString());

     office off = new office();
        System.out.println("office class "+ off.toString());
    }
}
