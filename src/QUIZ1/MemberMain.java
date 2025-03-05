package QUIZ1;

import java.util.Scanner;

public class MemberMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of members: ");
        int n = scanner.nextInt();
        Member[] members = new Member[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for member " + (i + 1) + ":");
            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            System.out.print("Workout Hours: ");
            int workoutHours = scanner.nextInt();
            System.out.print("Membership Fee: ");
            double membershipFee = scanner.nextDouble();

            members[i] = new Member(name, age, workoutHours, membershipFee);
        }

        int totalWorkoutHoursAbove40 = 0;
        int countAged35to40 = 0;

        System.out.println("\nMember Details:");
        for (Member member : members) {
            member.printData();
            if (member.getAge() > 40) {
                totalWorkoutHoursAbove40 += member.getWorkoutHours();
            }
            if (member.getAge() >= 35 && member.getAge() <= 40) {
                countAged35to40++;
            }
        }

        System.out.println("Total workout hours of members above 40 years old: " + totalWorkoutHoursAbove40);
        System.out.println("Number of members aged between 35 and 40: " + countAged35to40);
        
        scanner.close();
    }
}