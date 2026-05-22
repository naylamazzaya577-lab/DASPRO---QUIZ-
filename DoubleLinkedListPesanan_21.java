public class DoubleLinkedListPesanan_21 {
    NodePesanan_21 head;
    NodePesanan_21 tail;
// Mengecek linked list kosong atau tidak
    public boolean isEmpty() {
        return head == null;
    }
// Menambahkan pesanan di belakang linked list
    public void addLast(Pesanan_21 data) {
        NodePesanan_21 newNode =
            new NodePesanan_21(tail, data, null);
// Jika linked list kosong
     if (isEmpty()) {
            head = tail = newNode;
        }
// Jika sudah ada isi
    else {
    tail.next = newNode;
    newNode.prev = tail;
    tail = newNode;
        }
    }
// Sorting manual berdasarkan nama pesanan menggunakan Bubble Sort
    public void sortNamaPesanan() {
        if (head == null) {
            return;
        }
    boolean tukar;
        do {
            tukar = false;
    NodePesanan_21 current = head;
        while (current.next != null) {
// Membandingkan nama pesanan
    if (current.data.namaPesanan.compareToIgnoreCase( current.next.data.namaPesanan) > 0) {
// Tukar data pesanan
    Pesanan_21 temp = current.data;
        current.data = current.next.data;
        current.next.data = temp;
            tukar = true;
                }
        current = current.next;
            }
        } while (tukar);
    }
// Menampilkan laporan pesanan
    public void print() {
        if (isEmpty()) {
            System.out.println("Belum ada pesanan");
        }
        else {
// Sorting sebelum ditampilkan
        sortNamaPesanan();
    NodePesanan_21 current = head;
    int total = 0;

        System.out.println("Kode\tNama Pesanan\tHarga");

    while (current != null) {
        System.out.println(
             current.data.kodePesanan + "\t"
             + current.data.namaPesanan + "\t\t"
             + current.data.harga
                );
// Menjumlah total pendapatan
     total += current.data.harga;
     current = current.next;
            }
    System.out.println("==============================");
    System.out.println("Total Pendapatan : " + total);
        }
    }

    // QUIZ 
// Method mencari pesanan berdasarkan nama makanan
public void cariPesanan(String keyword) {
    // Jika linked list kosong
    if (isEmpty()) {
        System.out.println("Belum ada pesanan");
        return;
    }
    NodePesanan_21 current = head;
    boolean ditemukan = false;
    System.out.println("Hasil Pencarian Pesanan:");
    System.out.println("Kode\tNama Pesanan\tHarga");

    // Sequential Search
    while (current != null) {

        // Mengecek apakah nama pesanan mengandung keyword
        if (current.data.namaPesanan.toLowerCase()
                .contains(keyword.toLowerCase())) {

            System.out.println(
                    current.data.kodePesanan + "\t"
                    + current.data.namaPesanan + "\t\t"
                    + current.data.harga
            );

            ditemukan = true;
        }
        current = current.next;
    }
    // Jika tidak ditemukan
    if (!ditemukan) {
        System.out.println("Tidak ditemukan");
    }
}
}