package MIDTERM;

public class MataKuliah {
    String kodeMK;
    String namaMK;
    int sks;

    public MataKuliah(String kodeMK, String namaMK, int sks) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
    }

    public void tampil() {
        System.out.println("Kode MK : " + kodeMK);
        System.out.println("Nama MK : " + namaMK);
        System.out.println("SKS     : " + sks);
    }
}