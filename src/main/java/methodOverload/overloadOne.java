package methodOverload;

public class overloadOne {

    // promitive data-type
    static void overLoad(int number){
        System.out.println("overload int "+ number);
    }
    static void overLoad(byte number){
        System.out.println("overload int "+ number);
    }
    static void overLoad(short number){
        System.out.println("overload short "+ number);
    }
    static void overLoad(double number){
        System.out.println("overload double "+ number);
    }
    static void overLoad(float number){
        System.out.println("overload short "+ number);
    }
    static void overLoad(long number){
        System.out.println("overload short "+ number);
    }
    static void overLoad(boolean isWhat){
        System.out.println("overload boolean "+ isWhat);
    }
    static void overLoad(char isChar){
        System.out.println("overload char "+ isChar);
    }

    // Non-Primitive data-type
    static void overLoad(String name){
        System.out.println("overload String "+ name);
    }
    static void overLoad(int[] arrayType){
        System.out.println("overload String "+ arrayType);
    }

    public static void main(String[] args) {
        overLoad(22);
        overLoad("E diele");
        overLoad(2.20f);
        overLoad(true);
    }

}
