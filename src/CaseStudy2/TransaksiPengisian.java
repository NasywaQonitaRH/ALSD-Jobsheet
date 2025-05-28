package CaseStudy2;
import java.util.Scanner;


public class TransaksiPengisian {
    Kendaraan kendaraan;
    BBM bbm;
    double liter;
    double totalBayar;
    

    public TransaksiPengisian(Kendaraan kendaraan, BBM bbm, double liter) {
        this.kendaraan = kendaraan;
        this.bbm = bbm;
        this.liter = liter;
        this.totalBayar = bbm.hargaPerLiter * liter;
        
        }

        public void tampilkanTransaksi() {
        kendaraan.tampilkanInformasi();
        System.out.println("BBM        : " + bbm.namaBBM);
        System.out.println("Liter      : " + liter);
        System.out.println("Total Bayar: Rp" + totalBayar);
    }

}