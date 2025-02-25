public class CourseMain {
    public static void main(String[] args) {
        Course defaultCourse = new Course();
        Course customCourse = new Course("CS102", "Data Structures", 4, 60);

        defaultCourse.print();
        customCourse.print();

        customCourse.changeCredit(5);
        customCourse.addHour(5);
        customCourse.reduceHour(10);
    }
}
