public class Main {
    public static void main(String[] args) {

        // Teacher Object
        Teacher teacher = new Teacher("Martin", "+1234", "HST");
        Teacher teacher2 = new Teacher("Fekete", "+1234", "AUD");
        Teacher teacher3 = new Teacher("Hans", "+1234", "FW");

        // Course Object
        Course history = new Course("Greek History", "101", "HST", teacher);
        Course algorithm = new Course("Data Structures", "101" , "AUD", teacher2);
        Course bwl = new Course("Financial Economics", "101", "FW", teacher3);

        // Students
        Student arda = new Student("Arda Fikret", "5307733", "3. Semester", history, algorithm, bwl);

        arda.addBulkExamNote(100, 50, 99);
        history.printTeacherInfo();
        arda.printExamNotes();

        arda.isPassed();

    }
}