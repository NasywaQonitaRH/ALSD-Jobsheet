public class Course {
    private String courseID;
    private String name;
    private int credit;
    private int totalHour;

    public Course(String courseID, String name, int credit, int totalHour) {
        this.courseID = courseID;
        this.name = name;
        this.credit = credit;
        this.totalHour = totalHour;
    }

    public Course() {
        this("CS101", "Introduction to CS", 3, 45);
    }

    public void print() {
        System.out.println("Course ID: " + courseID);
        System.out.println("Name: " + name);
        System.out.println("Credit: " + credit);
        System.out.println("Total Weekly Hours: " + totalHour);
    }

    public void changeCredit(int newCredit) {
        this.credit = newCredit;
        System.out.println("Credit changed to: " + newCredit);
    }

    public void addHour(int hour) {
        this.totalHour += hour;
        System.out.println("Total hours increased by " + hour + " to " + totalHour);
    }

    public void reduceHour(int hour) {
        if (this.totalHour - hour >= 0) {
            this.totalHour -= hour;
            System.out.println("Total hours reduced by " + hour + " to " + totalHour);
        } else {
            System.out.println("Reduction not possible. Not enough hours remaining.");
        }
    }
}