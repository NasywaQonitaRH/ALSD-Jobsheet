public class LecturerMain {
    public static void main(String[] args) {
        Lecturer lecturer1 = new Lecturer();
        lecturer1.lecturerID = "L001";
        lecturer1.name = "Dr. Andi";
        lecturer1.status = true;
        lecturer1.startYear = 2010;
        lecturer1.expertiseField = "Machine Learning";

        lecturer1.print();

        lecturer1.setStatus(false);
        lecturer1.changeExpertiseField("Artificial Intelligence");

        lecturer1.print();

        System.out.println("-------------------------");

        Lecturer lecturer2 = new Lecturer("L002", "Prof. Budi", true, 2015, "Cyber Security");

        lecturer2.print();

        lecturer2.changeExpertiseField("Data Science");
        int tenure = lecturer2.calculateTenure(2025);
        System.out.println("Years of Service: " + tenure);

        lecturer2.print();
    }
}