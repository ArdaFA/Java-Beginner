public class Teacher {

    // Attributes
    String name;
    String mobileNu;
    String branch;

    // Constructor
    Teacher(String name, String mobileNu, String branch){
        this.name = name;
        this.mobileNu = mobileNu;
        this.branch = branch;
    }

    void printInfos(){
        System.out.println("-----Teacher Infos-----");
        System.out.println("Name: " + this.name);
        System.out.println("Mobile Number: " + this.mobileNu);
        System.out.println("Branch: " + this.branch);
        System.out.println("-----------------------");
    }
}
