package methodToAllObjects;

import java.util.Arrays;

public class office {
    private equalsHashCode[] persons;
    public office(equalsHashCode ... persons){
        this.persons = Arrays.copyOf(persons, persons.length);
    }
    @Override
    public String toString(){
        return String.format("%s{persons=%s}",
                getClass().getSimpleName(),
                Arrays.toString(persons));
    }
    public equalsHashCode[] getPerson(){
        return persons;
    }

}
