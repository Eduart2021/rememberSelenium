package classAndInterface;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class test {

    public static void main(String[] args) {
    String[] sample = {"one","two"};
    ArrayList<String> entry2 = new ArrayList<>();
    entry2.add("four");
    entry2.add("three");

    immutable imm = new immutable(23,sample,entry2);
        System.out.println(imm.getId());
        System.out.println(Arrays.toString(imm.getArray()));
        System.out.println(imm.getCollection());
    }
}
