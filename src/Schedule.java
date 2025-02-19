import java.util.Scanner;

public class Schedule {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of courses: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        String[] courseName = new String[n];
        int[] creditHours = new int[n];
        int[] semester = new int[n];
        String[] lectureDay = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Course " + (i + 1) + " Name: ");
            courseName[i] = scanner.nextLine();

            System.out.print("Enter Credit Hours (SKS): ");
            creditHours[i] = scanner.nextInt();

            System.out.print("Enter Semester: ");
            semester[i] = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Enter Lecture Day: ");
            lectureDay[i] = scanner.nextLine();
        }

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Display All Courses");
            System.out.println("2. Display Courses by Day");
            System.out.println("3. Display Courses by Semester");
            System.out.println("4. Search Course by Name");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println("\nCourse Schedule:");
                    for (int i = 0; i < n; i++) {
                        System.out.println(courseName[i] + " - SKS: " + creditHours[i] +
                                " - Semester: " + semester[i] + " - Day: " + lectureDay[i]);
                    }
                    break;
                case 2:
                    System.out.print("Enter Lecture Day: ");
                    String day = scanner.nextLine();
                    System.out.println("\nCourses on " + day + ":");
                    for (int i = 0; i < n; i++) {
                        if (lectureDay[i].equalsIgnoreCase(day)) {
                            System.out.println(courseName[i] + " - SKS: " + creditHours[i] +
                                    " - Semester: " + semester[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter Semester: ");
                    int sem = scanner.nextInt();
                    System.out.println("\nCourses in Semester " + sem + ":");
                    for (int i = 0; i < n; i++) {
                        if (semester[i] == sem) {
                            System.out.println(courseName[i] + " - SKS: " + creditHours[i] +
                                    " - Day: " + lectureDay[i]);
                        }
                    }
                    break;
                case 4:
                    System.out.print("Enter Course Name to Search: ");
                    String search = scanner.nextLine();
                    boolean found = false;
                    for (int i = 0; i < n; i++) {
                        if (courseName[i].equalsIgnoreCase(search)) {
                            System.out.println("\nCourse Found: " + courseName[i] +
                                    " - SKS: " + creditHours[i] + " - Semester: " + semester[i] +
                                    " - Day: " + lectureDay[i]);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Course not found!");
                    }
                    break;
            }
        } while (choice != 5);

        scanner.close();
    }
}