package MIDTERM;

public class Penilaian {
    Mahasiswa mahasiswa;
    MataKuliah mataKuliah;
    double tugas, uts, uas, nilaiAkhir;

    public Penilaian(Mahasiswa mhs, MataKuliah mk, double tugas, double uts, double uas) {
        this.mahasiswa = mhs;
        this.mataKuliah = mk;
        this.tugas = tugas;
        this.uts = uts;
        this.uas = uas;
        this.nilaiAkhir = (tugas * 0.3) + (uts * 0.3) + (uas * 0.4);
    }

    public void tampil() {
        System.out.println("NIM         : " + mahasiswa.NIM);
        System.out.println("Name        : " + mahasiswa.nama);
        System.out.println("Course      : " + mataKuliah.namaMK);
        System.out.println("Assignment  : " + tugas);
        System.out.println("Mid Exam    : " + uts);
        System.out.println("Final Exam  : " + uas);
        System.out.println("Final Score : " + nilaiAkhir);
    }
}