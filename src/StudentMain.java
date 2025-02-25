public class StudentMain {
    public static void main(String[] args) {
        Student22 student1 = new Student22("244107020097", "Tiara", "TI-1I", 3.8);

        System.out.println("=== Initial Student Information ===");
        student1.print();

        student1.changeClass("TI-2I");

        student1.updateGPA(3.9);

        System.out.println("\n=== Updated Student Information ===");
        student1.print();
    }
}
