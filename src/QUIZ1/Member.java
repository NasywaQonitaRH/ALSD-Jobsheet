package QUIZ1;

public class Member {
    private String memberName;
    private int age;
    private int workoutHours;
    private double membershipFee;

    public Member(String memberName, int age, int workoutHours, double membershipFee) {
        this.memberName = memberName;
        this.age = age;
        this.workoutHours = workoutHours;
        this.membershipFee = membershipFee;
    }
    public double totalCost() {
        if (workoutHours > 15) {
            return membershipFee * 0.9;
        }
        return membershipFee;
    }
    public int getAge() {
        return age;
    }

    public int getWorkoutHours() {
        return workoutHours;
    }
    public void printData() {
        System.out.println("Name: " + memberName);
        System.out.println("Age: " + age);
        System.out.println("Workout Hours: " + workoutHours);
        System.out.println("Membership Fee: $" + membershipFee);
        System.out.println("Total Cost: $" + totalCost());
        System.out.println("--------------------------");
    }
}