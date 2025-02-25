public class StudentMainMod {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.studentID = "244107020097";
        student1.name = "Tiara";
        student1.className = "TI-II";
        student1.gpa = 3.8;

        student1.print();

        student1.changeClass("TI-2I");
        student1.updateGPA(3.9);

        student1.print();

        Student student2 = new Student("244107020040", "Rizky", "TI-II", 3.5);
        
        student2.updateGPA(3.3);

        student2.print();
    }
}