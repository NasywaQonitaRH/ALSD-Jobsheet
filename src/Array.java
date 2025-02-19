import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMK = scanner.nextInt();
        scanner.nextLine(); 

        String[] courses = new String[jumlahMK];
        int[] sks = new int[jumlahMK];
        double[] nilaiAngka = new double[jumlahMK];
        String[] nilaiHuruf = new String[jumlahMK];
        double[] bobotNilai = new double[jumlahMK];

        System.out.println("\nProgram Menghitung IP Semester");
        System.out.println("=====================================");

        for (int i = 0; i < jumlahMK; i++) {
            System.out.print("Masukkan nama MK ke-" + (i + 1) + ": ");
            courses[i] = scanner.nextLine();

            System.out.print("Masukkan bobot SKS untuk " + courses[i] + ": ");
            sks[i] = scanner.nextInt();

            System.out.print("Masukkan nilai angka untuk " + courses[i] + ": ");
            nilaiAngka[i] = scanner.nextDouble();
            scanner.nextLine(); 

            nilaiHuruf[i] = convertToLetterGrade(nilaiAngka[i]);
            bobotNilai[i] = convertToGradePoints(nilaiHuruf[i]);
        }

        System.out.println("\nHasil Konversi Nilai");
        System.out.println("=====================================");
        System.out.printf("%-40s %-12s %-12s %-12s%n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        System.out.println("=====================================");

        double totalBobot = 0, totalGradePoints = 0;
        
        for (int i = 0; i < jumlahMK; i++) {
            System.out.printf("%-40s %-12.2f %-12s %-12.2f%n", courses[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);
            totalBobot += sks[i];
            totalGradePoints += bobotNilai[i] * sks[i];
        }

        double ipSemester = totalGradePoints / totalBobot;

        System.out.println("=====================================");
        System.out.printf("IP : %.2f%n", ipSemester);
    }

    public static String convertToLetterGrade(double nilai) {
        if (nilai > 80 && nilai <= 100) return "A";
        else if (nilai > 73 && nilai <= 80) return "B+";
        else if (nilai >= 65 && nilai <= 73) return "B";
        else if (nilai > 60 && nilai < 65) return "C+";
        else if (nilai > 50 && nilai <= 60) return "C";
        else if (nilai > 39 && nilai < 50) return "D";
        else return "E";
    }

    public static double convertToGradePoints(String grade) {
        switch (grade) {
            case "A": return 4.0;
            case "B+": return 3.5;
            case "B": return 3.0;
            case "C+": return 2.5;
            case "C": return 2.0;
            case "D": return 1.0;
            case "E": return 0.0;
            default: return 0.0;
        }
    }
}