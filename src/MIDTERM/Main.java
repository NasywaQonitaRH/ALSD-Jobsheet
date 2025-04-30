package MIDTERM;

import java.util.Scanner;

public class Main {
    static Mahasiswa[] mhsList = new Mahasiswa[3];
    static MataKuliah[] mkList = new MataKuliah[3];
    static Penilaian[] nilaiList = new Penilaian[5];

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        inputData();

        int pilih;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Display Students");
            System.out.println("2. Display Courses");
            System.out.println("3. Display Assessments");
            System.out.println("4. Sort by Final Score (Descending)");
            System.out.println("5. Search by NIM");
            System.out.println("6. Report Per Course");
            System.out.println("0. Exit");
            System.out.print("Choose menu: ");
            pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 1 -> tampilMahasiswa();
                case 2 -> tampilMataKuliah();
                case 3 -> tampilPenilaian();
                case 4 -> SortNilai();
                case 5 -> cariNIM(input);
                case 6 -> laporanPerMataKuliah(input);
            }
        } while (pilih != 0);
    }

    static void tampilMahasiswa() {
        for (Mahasiswa m : mhsList) {
            m.tampil();
            System.out.println();
        }
    }

    static void tampilMataKuliah() {
        for (MataKuliah mk : mkList) {
            mk.tampil();
            System.out.println();
        }
    }

    static void tampilPenilaian() {
        for (Penilaian p : nilaiList) {
            p.tampil();
            System.out.println();
        }
    }

    static void SortNilai() {
        for (int i = 0; i < nilaiList.length - 1; i++) {
            for (int j = 0; j < nilaiList.length - i - 1; j++) {
                if (nilaiList[j].nilaiAkhir < nilaiList[j + 1].nilaiAkhir) {
                    Penilaian temp = nilaiList[j];
                    nilaiList[j] = nilaiList[j + 1];
                    nilaiList[j + 1] = temp;
                }
            }
        }
        System.out.println("\nSorted Final Scores (Descending):");
        int no = 1;
        for (Penilaian p : nilaiList) {
            System.out.println(no++ + ". " + p.mahasiswa.nama + " - " + p.mataKuliah.namaMK + " - Final Score: " + p.nilaiAkhir);
        }
    }

    static void cariNIM(Scanner input) {
        System.out.print("Enter NIM: ");
        String nim = input.nextLine();
        boolean found = false;
        for (Penilaian p : nilaiList) {
            if (p.mahasiswa.NIM.equals(nim)) {
                if (!found) {
                    System.out.println("\nResults:");
                    System.out.println("NIM: " + p.mahasiswa.NIM);
                    System.out.println("Name: " + p.mahasiswa.nama);
                    found = true;
                }
                System.out.println("\nCourse: " + p.mataKuliah.namaMK);
                System.out.println("Assignment: " + p.tugas);
                System.out.println("UTS: " + p.uts);
                System.out.println("UAS: " + p.uas);
                System.out.println("Final Score: " + p.nilaiAkhir);
            }
        }
        if (!found) {
            System.out.println("No data found for NIM: " + nim);
        }
    }

    static void laporanPerMataKuliah(Scanner input) {
        System.out.print("Enter course name: ");
        String courseName = input.nextLine();
        double total = 0;
        int count = 0;
        int above80 = 0;
        int below70 = 0;

        for (Penilaian p : nilaiList) {
            if (p.mataKuliah.namaMK.equalsIgnoreCase(courseName)) {
                total += p.nilaiAkhir;
                count++;
                if (p.nilaiAkhir >= 80) above80++;
                if (p.nilaiAkhir < 70) below70++;
            }
        }

        if (count == 0) {
            System.out.println("No data found for course: " + courseName);
            return;
        }

        double avg = total / count;
        System.out.println("\nSubject: " + courseName);
        System.out.printf("Average Final Grade : %.2f\n", avg);
        System.out.println("Student Score >= 80 : " + above80);
        System.out.println("Student Score < 70  : " + below70);
    }

    static void inputData() {
        mhsList[0] = new Mahasiswa("22001", "Ali Rahman", "Teknik Informatika");
        mhsList[1] = new Mahasiswa("22002", "Budi Santoso", "Teknik Informatika");
        mhsList[2] = new Mahasiswa("22003", "Citra Dewi", "Teknik Informatika");

        mkList[0] = new MataKuliah("MK001", "Struktur Data", 3);
        mkList[1] = new MataKuliah("MK002", "Basis Data", 3);
        mkList[2] = new MataKuliah("MK003", "Desain Web", 3);

        nilaiList[0] = new Penilaian(mhsList[0], mkList[0], 80, 85, 90); 
        nilaiList[1] = new Penilaian(mhsList[0], mkList[1], 60, 75, 70); 
        nilaiList[2] = new Penilaian(mhsList[1], mkList[0], 75, 70, 80); 
        nilaiList[3] = new Penilaian(mhsList[2], mkList[1], 85, 95, 90); 
        nilaiList[4] = new Penilaian(mhsList[2], mkList[2], 80, 90, 65); 
    }
}