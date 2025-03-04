package week3;

import java.util.Scanner;

public class LecturerDemo22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of lecturers: ");
        int numLecturers = sc.nextInt();
        sc.nextLine();

        Lecturer22[] lecturerArray = new Lecturer22[numLecturers];

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
            sc.nextLine(); 

            lecturerArray[i] = new Lecturer22(id, name, gender, age);
        }

        System.out.println("\nAll Lecturer Data:");
        LecturerData22.showAllLecturerData(lecturerArray);

        System.out.println("\nNumber of Male Lecturers: " + 
            LecturerData22.countLecturerByGender(lecturerArray, true));
        System.out.println("Number of Female Lecturers: " + 
            LecturerData22.countLecturerByGender(lecturerArray, false));

        System.out.println("\nAverage Age of Male Lecturers: " + 
            LecturerData22.averageLecturerAgeByGender(lecturerArray, true));
        System.out.println("Average Age of Female Lecturers: " + 
            LecturerData22.averageLecturerAgeByGender(lecturerArray, false));

        LecturerData22.showOldestLecturerInfo(lecturerArray);
        LecturerData22.showYoungestLecturerInfo(lecturerArray);

        sc.close();
    }
}