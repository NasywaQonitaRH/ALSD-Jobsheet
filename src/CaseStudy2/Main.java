package CaseStudy2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        AntrianKendaraan antrian = new AntrianKendaraan();
        QueueTransaksi transaksiQueue = new QueueTransaksi(100);
        BBM[] jenisBBM = {
            new BBM("Pertalite", 10000),
            new BBM("Pertamax", 13500),
            new BBM("Dexlite", 14000)
        };

        int pilihan;
        do {
            System.out.println("\n=== MENU SPBU ===");
            System.out.println("1. Tambah Kendaraan ke Antrian");
            System.out.println("2. Lihat Antrian Kendaraan");
            System.out.println("3. Jumlah Kendaraan dalam Antrian");
            System.out.println("4. Layani Kendaraan dan Catat Transaksi");
            System.out.println("5. Tampilkan Riwayat Transaksi");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Plat Nomor : ");
                    String plat = input.nextLine();
                    System.out.print("Masukkan Tipe : ");
                    String tipe = input.nextLine();
                    System.out.print("Masukkan Merk : ");
                    String merk = input.nextLine();
                    antrian.tambahKendaraanBaru(new Kendaraan(plat, tipe, merk));
                    System.out.println("Kendaraan berhasil ditambahkan ke antrian.");
                    break;

                case 2:
                    antrian.tampilkanAntrian();
                    break;

                case 3:
                    System.out.println("Jumlah kendaraan dalam antrian: " + antrian.hitungAntrian());
                    break;

                case 4:
                    if (antrian.kosong()) {
                        System.out.println("Tidak ada kendaraan dalam antrian.");
                        break;
                    }
                    Kendaraan dilayani = antrian.layaniKendaraan();
                    System.out.println("Melayani kendaraan:");
                    dilayani.tampilkanInformasi();

                    System.out.println("Pilih jenis BBM:");
                    for (int i = 0; i < jenisBBM.length; i++) {
                        System.out.println((i + 1) + ". " + jenisBBM[i].namaBBM + " - Rp" + jenisBBM[i].hargaPerLiter);
                    }
                    int pilihBBM = input.nextInt();
                    System.out.print("Masukkan jumlah liter: ");
                    double liter = input.nextDouble();

                    TransaksiPengisian transaksi = new TransaksiPengisian(dilayani, jenisBBM[pilihBBM - 1], liter);
                    transaksiQueue.enqueue(transaksi);
                    System.out.println("Transaksi berhasil dicatat.");
                    break;

                case 5:
                    transaksiQueue.tampilkanTransaksi();
                    break;

                case 0:
                    System.out.println("Keluar dari program. Terima kasih.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 0);

        input.close();
    }
}
