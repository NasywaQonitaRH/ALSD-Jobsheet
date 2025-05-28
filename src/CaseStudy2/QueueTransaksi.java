package CaseStudy2;

public class QueueTransaksi {
    TransaksiPengisian[] queue;
    int front, rear, size;

    public QueueTransaksi(int kapasitas) {
        queue = new TransaksiPengisian[kapasitas];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(TransaksiPengisian t) {
        if (size == queue.length) {
            System.out.println("Queue transaksi penuh!");
            return;
        }
        rear = (rear + 1) % queue.length;
        queue[rear] = t;
        size++;
    }

    public void tampilkanTransaksi() {
        if (size == 0) {
            System.out.println("Belum ada transaksi.");
            return;
        }
        System.out.println("\n=== Riwayat Transaksi ===");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % queue.length;
            queue[index].tampilkanTransaksi();
            System.out.println("-------------------------");
        }
    }
}
