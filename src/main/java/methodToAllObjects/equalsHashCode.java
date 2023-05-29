package methodToAllObjects;

import java.lang.reflect.Array;

public class equalsHashCode {
    /**
     * o protect yourself from surprises, whenever possible try to use final fields while implementing equals() and hashCod
     * e(). It will guarantee that behavior of those methods will not be affected by the field changes
     */
    private final String firstName;
    private final String lastName;
    private final String email;

    public equalsHashCode(
            final String firstName,
            final String lastName,
            final String email
            ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getEmail(){
        return email;
    }
    @Override
    public boolean equals(Object obj){
        //check if null
        if(obj == null){
            return false;
        }
        //if pointing to this instance
        if (this == obj){
            return true;
        }
        // check if all field equals
        final equalsHashCode other = (equalsHashCode) obj;
        if(email == null){
            if(other.email != null){
                return false;
            }
        }else if(!email.equals(other.email)) {
            return false;
        }
        if(firstName == null){
            if(other.firstName != null){
                return false;
            }
        }else if(!firstName.equals(other.firstName)) {
            return false;
        }
        if(lastName == null){
            return other.lastName == null;
        }else return lastName.equals(other.lastName);
    }
    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result + ((email == null)? 0 : email.hashCode());
        result = prime * result + ((firstName == null)? 0 : firstName.hashCode());
        result = prime * result + ((lastName == null)? 0 : lastName.hashCode());

        return result;
    }
    @Override
    public String toString(){
        return String.format("%s[email=%s, first name=%s, last name=%s]",
                getClass().getSimpleName(), email, firstName,lastName);
    }
}
