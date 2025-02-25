public class StudentMainMod {
    public static void main(String[] args) {
        StudentMod student1 = new StudentMod();
        student1.studentID = "244107020097";
        student1.name = "Tiara";
        student1.className = "TI-II";
        student1.gpa = 3.8;

        student1.print();

        student1.changeClass("TI-2I");
        student1.updateGPA(3.9);

        student1.print();

        StudentMod student2 = new StudentMod("244107020040", "Rizky", "TI-II", 3.5);
        student2.updateGPA(3.3);
        student2.print();

        StudentMod studentNasywa = new StudentMod("244107020099", "Nasywa", "TI-2B", 3.7);
        studentNasywa.print();
    }
}