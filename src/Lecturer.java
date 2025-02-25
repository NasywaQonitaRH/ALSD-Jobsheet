public class Lecturer {
    String lecturerID;
    String name;
    boolean status;
    int startYear;
    String expertiseField;

    public Lecturer() {
    }

    public Lecturer(String lecturerID, String name, boolean status, int startYear, String expertiseField) {
        this.lecturerID = lecturerID;
        this.name = name;
        this.status = status;
        this.startYear = startYear;
        this.expertiseField = expertiseField;
    }

    public void print() {
        System.out.println("Lecturer ID: " + lecturerID);
        System.out.println("Name: " + name);
        System.out.println("Status: " + (status ? "Active" : "Inactive"));
        System.out.println("Start Year: " + startYear);
        System.out.println("Expertise Field: " + expertiseField);
    }

    public void setStatus(boolean status) {
        this.status = status;
        System.out.println("Lecturer status updated to: " + (status ? "Active" : "Inactive"));
    }

    public int calculateTenure(int yearNow) {
        return yearNow - startYear;
    }

    public void changeExpertiseField(String newField) {
        this.expertiseField = newField;
        System.out.println("Expertise field changed to: " + newField);
    }
}