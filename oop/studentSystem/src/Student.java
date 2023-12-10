public class Student {

    // Attributes
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNu;
    String classes;
    double average;
    boolean isPassed;

    // Constructor
    Student(String name, String stuNu,String classes, Course c1, Course c2, Course c3){
        this.name = name;
        this.stuNu = stuNu;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0;
        this.isPassed = false;
    }

    void addBulkExamNote(int note1, int note2, int note3){
        if(note1 >= 0 && note1 <= 100){
            this.c1.note = note1;
        }
        if(note2 >= 0 && note2 <= 100){
            this.c2.note = note2;
        }
        if(note3 >= 0 && note3 <= 100){
            this.c3.note = note3;
        }
        else System.out.println("");
    }

    void printExamNotes(){
        System.out.println(this.c1.name + " result: " + this.c1.note);
        System.out.println(this.c2.name + " result: " + this.c2.note);
        System.out.println(this.c3.name + " result: " + this.c3.note);
    }

    double average(){
        int total = this.c1.note + this.c2.note + this.c3.note;
        this.average = total/3;
        return this.average;
    }

    void isPassed(){
        if (this.average() > 60){
            System.out.println("Successfully passed! Note: " + this.average());
            this.isPassed = true;
        }
        else {
            System.out.println("Failed!");
        }
    }
}
