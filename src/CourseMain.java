public class CourseMain {
    public static void main(String[] args) {
        Course course1 = new Course();
        course1.courseID = "CS101";
        course1.name = "Data Structures";
        course1.credit = 3;
        course1.hour = 4;

        course1.print();

        course1.changeCredit(4);
        course1.addHour(2);
        course1.reduceHour(3);

        course1.print();

        System.out.println("-------------------------");

        Course course2 = new Course("CS102", "Algorithms", 3, 5);

        course2.print();

        course2.addHour(1);
        course2.reduceHour(2);
        course2.changeCredit(5);

        course2.print();
    }
}