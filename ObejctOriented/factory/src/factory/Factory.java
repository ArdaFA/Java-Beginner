package factory;

public class Factory {

    // Attributes
    // all employees
    private Person[] employees;
    private double capital;
    private Ware[] products;
    private int[] stock; // Indicates how often a product is available

    // Constructor
    public Factory(Person[] employees, double capital, Ware[] products){
        this.employees = employees;
        this.capital = capital;
        this.products = products;
        this.stock = new int[products.length];;
    }

    public void hire(Person person){

        // create a new array with one more Person
        Person[] tmp = new Person[employees.length + 1];

        //Fill new array with old entries
        for (int i = 0; i < employees.length; i++){
            tmp[i] = employees[i];
        }

        // Fill the new employee
        tmp[employees.length] = person;

        // set the new one
        this.employees = tmp;
    }

    public void fire(Person person){

        // check if the person exists
        boolean exists = false;
        for (int i = 0; i < employees.length; i++){
            if (employees[i].getName().equals(person.getName())){
                exists =true;
                break; // DO NOT FORGET TO STOP THE LOOP
            }
        }

        // if person do not exist we can stop
        if(!exists){
            System.out.println("The Person don't exist that you try to fire!");
            return;
        }

        // create a new array with 1 less person
        Person[] tmp = new Person[employees.length-1];

        int index = 0;
        for (int i = 0 ; i < employees.length; i++){
            if(employees[i].equals(person)){
                System.out.println(person.getName() + " has been fired!");
                continue;
            }
            tmp[index] = employees[i];
            index++;
        }


    }

    public void inventory(){
        // Checks the stock of each product, which should exist at least 10 times
        for (int i = 0; i < stock.length; ++i){
            if(stock[i] < 10){
                System.out.println("the product " + products[i].getName() + " is not available enough");
                produce(i, 1);
            }
        }

    }

    public void produce(int productIndex, int hours){
        // Calculate how much of good "i" can be produced (rounded down).
        int produced = (int) (employees.length * hours * products[productIndex].getProductionSpeed());

        // Inventory and Capital
        // add the number of produced product to stock
        stock[productIndex] += produced;
        //
        capital -= produced * products[productIndex].getProductionPrice();

    }

    public void sell(){
        // sells all the products. At least 20% has to be sold.
        // over 20% is randomised

        // to reach all the products and sell them we need a loop
        for (int i = 0 ; i < products.length; i ++){
            // how many units has been sold?
            double unit =  Math.random();

            // At least 20% has to be sold.
            if(unit <= 0.2){
                unit = 0.2;
            }

            int sold = (int) (unit * stock[i]);
            // reduce the number in stock
            stock[i] -= sold;

            // increase the capital
            capital += (products[i].getSellingPrice() * sold);
            System.out.println("Product " + products[i].getName() + " has been " + unit + " unit sold!");
            System.out.println("Capital is now: " + capital);
        }
    }

}
