package factory;

public class Person {

    // Attribute
    private String name;

    // Constructor
    public Person(String name){
        // this represents the attribute of the class
        // name which is on the right side, is parameter which is in the method
        this.name = name;
    }

    // Getter & Setter
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
}
