public class Course {
    String courseID;
    String name;
    int credit;
    int hour;

    public Course() {
    }

    public Course(String courseID, String name, int credit, int hour) {
        this.courseID = courseID;
        this.name = name;
        this.credit = credit;
        this.hour = hour;
    }

    public void print() {
        System.out.println("Course ID: " + courseID);
        System.out.println("Name: " + name);
        System.out.println("Credit: " + credit);
        System.out.println("Hours: " + hour);
    }

    public void changeCredit(int newCredit) {
        this.credit = newCredit;
        System.out.println("Credit changed to: " + newCredit);
    }

    public void addHour(int hour) {
        this.hour += hour;
        System.out.println("Added " + hour + " extra hours. Total: " + this.hour);
    }

    public void reduceHour(int hour) {
        if (this.hour - hour >= 0) {
            this.hour -= hour;
            System.out.println("Reduced " + hour + " hours. Total: " + this.hour);
        } else {
            System.out.println("Error: Not enough hours to reduce!");
        }
    }
}