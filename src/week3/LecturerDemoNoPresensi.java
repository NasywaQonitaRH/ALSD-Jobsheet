package week3;

import java.util.Scanner;

public class LecturerDemoNoPresensi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of lecturers: ");
        int numLecturers = sc.nextInt();
        sc.nextLine(); // Consume newline

        LecturerNoPresensi[] lecturerArray = new LecturerNoPresensi[numLecturers];

        for (int i = 0; i < numLecturers; i++) {
            System.out.println("Enter details for Lecturer " + (i + 1) + ":");
            System.out.print("ID: ");
            String id = sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Gender (M/F): ");
            char genderChar = sc.next().charAt(0);
            boolean gender = (genderChar == 'M' || genderChar == 'm');
            System.out.print("Age: ");
            int age = sc.nextInt();
            sc.nextLine(); // Consume newline

            lecturerArray[i] = new LecturerNoPresensi(id, name, gender, age);
        }

        System.out.println("\nAll Lecturer Data:");
        LecturerDataNoPresensi.showAllLecturerData(lecturerArray);

        System.out.println("\nNumber of Male Lecturers: " + 
            LecturerDataNoPresensi.countLecturerByGender(lecturerArray, true));
        System.out.println("Number of Female Lecturers: " + 
            LecturerDataNoPresensi.countLecturerByGender(lecturerArray, false));

        System.out.println("\nAverage Age of Male Lecturers: " + 
            LecturerDataNoPresensi.averageLecturerAgeByGender(lecturerArray, true));
        System.out.println("Average Age of Female Lecturers: " + 
            LecturerDataNoPresensi.averageLecturerAgeByGender(lecturerArray, false));

        LecturerDataNoPresensi.showOldestLecturerInfo(lecturerArray);
        LecturerDataNoPresensi.showYoungestLecturerInfo(lecturerArray);

        sc.close();
    }
}