package Week5;

import java.util.Scanner;

class StudentGrades {
    int utsScores[];
    int uasScores[];

    public StudentGrades(int uts[], int uas[]) {
        this.utsScores = uts;
        this.uasScores = uas;
    }

    public int findMax(int arr[], int left, int right) {
        if (left == right) {
            return arr[left];
        }
        int mid = (left + right) / 2;
        int leftMax = findMax(arr, left, mid);
        int rightMax = findMax(arr, mid + 1, right);
        return Math.max(leftMax, rightMax);
    }

    public int findMin(int arr[], int left, int right) {
        if (left == right) {
            return arr[left];
        }
        int mid = (left + right) / 2;
        int leftMin = findMin(arr, left, mid);
        int rightMin = findMin(arr, mid + 1, right);
        return Math.min(leftMin, rightMin);
    }

    public double calculateAverage() {
        int sum = 0;
        for (int score : uasScores) {
            sum += score;
        }
        return (double) sum / uasScores.length;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int utsScores[] = {78, 85, 90, 76, 92, 80, 80, 88};
        int uasScores[] = {82, 88, 87, 79, 95, 83, 83, 86};

        StudentGrades grades = new StudentGrades(utsScores, uasScores);

        int highestUTS = grades.findMax(utsScores, 0, utsScores.length - 1);
        int lowestUTS = grades.findMin(utsScores, 0, utsScores.length - 1);

        double averageUAS = grades.calculateAverage();

        System.out.println("Highest Midterm Score (UTS): " + highestUTS);
        System.out.println("Lowest Midterm Score (UTS): " + lowestUTS);
        System.out.println("Average Final Score (UAS): " + averageUAS);
        
        input.close();
    }
}