public class LecturerMain {
    public static void main(String[] args) {
        Lecturer defaultLecturer = new Lecturer();
        Lecturer customLecturer = new Lecturer("L002", "Prof. Johnson", false, "2015", "Software Engineering");

        defaultLecturer.print();
        customLecturer.print();

        customLecturer.changeActivityStatus(true);
    }
}