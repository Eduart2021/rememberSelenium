package classAndInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class immutable {

    private final long id;
    private final String[] arrayToString;
    private final Collection<String> collectionOfStrings;

    public immutable(long id, String[] arrayToString, Collection<String> collectionOfStrings) {
        this.id = id;
        this.arrayToString = Arrays.copyOf(arrayToString, arrayToString.length);
        this.collectionOfStrings = new ArrayList<>(collectionOfStrings);
    }

    long getId(){
        return this.id;
    }
    Object[] getArray(){
        return this.arrayToString;
    }
     Collection<String> getCollection(){
        return this.collectionOfStrings;
    }

}
