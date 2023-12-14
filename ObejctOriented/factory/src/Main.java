import factory.Factory;
import factory.Person;
import factory.Ware;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person("Arda Azakli");
        Person p2 = new Person("Ceren Sare");
        Person p3 = new Person("Philipp Haase");

        Person[] persons = {p1, p2, p3};

        System.out.println("Employees: ");
        for (Person p : persons){
            System.out.println(p.getName());
        }
        System.out.println("");

        Ware w1 = new Ware("MacBook", 1500.0, 800.0, 0.5);
        Ware w2 = new Ware("Razer", 2250.0, 1450.0, 5);
        Ware w3 = new Ware("Lenovo", 1000.0, 700.0, 2.5);

        Ware[] wares = {w1, w2, w3};
        for (Ware w : wares){
            System.out.println(w.getName() + " could be for " + w.getSellingPrice() + " sold.");
        }
        System.out.println("");

        Factory factory = new Factory(persons, 50000.0, wares);

        for (int i = 0; i < 3; ++i){
            factory.inventory();
            factory.sell();
        }

        factory.hire(new Person("Ege Günes"));
        factory.fire(p3);
        factory.hire(new Person("Ege Erarabaci"));
        System.out.println("");

        for (int i = 0; i < 3; ++i){
            factory.inventory();
            factory.sell();
        }
    }
}