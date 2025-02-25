public class Lecturer {
    private String lecturerID;
    private String name;
    private boolean isActive;
    private String startYear;
    private String expertiseField;

    public Lecturer(String lecturerID, String name, boolean isActive, String startYear, String expertiseField) {
        this.lecturerID = lecturerID;
        this.name = name;
        this.isActive = isActive;
        this.startYear = startYear;
        this.expertiseField = expertiseField;
    }

    public Lecturer() {
        this("L001", "Dr. Smith", true, "2010", "Computer Science");
    }

    public void print() {
        System.out.println("Lecturer ID: " + lecturerID);
        System.out.println("Name: " + name);
        System.out.println("Active: " + (isActive ? "Yes" : "No"));
        System.out.println("Start Year: " + startYear);
        System.out.println("Expertise Field: " + expertiseField);
    }

    public void changeActivityStatus(boolean status) {
        this.isActive = status;
        System.out.println("Activity status changed to: " + (status ? "Active" : "Inactive"));
    }
}