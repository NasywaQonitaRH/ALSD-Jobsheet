package CaseStudy2;

public class AntrianKendaraan {
    private NodeKendaraan head, tail;

    public void tambahKendaraanBaru(Kendaraan k) {
        NodeKendaraan baru = new NodeKendaraan(k);
        if (head == null) {
            head = tail = baru;
        } else {
            tail.next = baru;
            tail = baru;
        }
    }

    public Kendaraan layaniKendaraan() {
        if (head == null) return null;
        Kendaraan k = head.data;
        head = head.next;
        if (head == null) tail = null;
        return k;
    }

    public boolean kosong() {
        return head == null;
    }

    public int hitungAntrian() {
        int count = 0;
        NodeKendaraan current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void tampilkanAntrian() {
        if (kosong()) {
            System.out.println("Antrian kosong.");
            return;
        }

        NodeKendaraan current = head;
        int nomor = 1;
        while (current != null) {
            System.out.println("\nKendaraan ke-" + nomor++);
            current.data.tampilkanInformasi();
            current = current.next;
        }
    }
}
