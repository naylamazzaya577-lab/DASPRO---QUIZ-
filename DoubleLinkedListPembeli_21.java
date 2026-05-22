public class DoubleLinkedListPembeli_21 {

    NodePembeli_21 head;
    NodePembeli_21 tail;
// Mengecek apakah linked list kosong
    public boolean isEmpty() {

        return head == null;
    }
// Method untuk menambah data di belakang antrean
    public void addLast(Pembeli_21 data) {
// Membuat node baru
    NodePembeli_21 newNode =
        new NodePembeli_21(tail, data, null);

// Jika linked list kosong maka head dan tail menjadi node baru
     if (isEmpty()) {
            head = tail = newNode;
        }
// Jika linked list sudah berisi data
    else {
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        }
    }
// Method untuk menampilkan antrean
    public void print() {
        // Jika kosong
        if (isEmpty()) {
            System.out.println("Antrean masih kosong");
        }
        // Jika ada isi
        else {

            NodePembeli_21 current = head;

            System.out.println("No\tNama\t\tNo HP");

    // Traversal linked list dari head sampai tail
        while (current != null) {
            System.out.println(
                 current.data.nomorAntrian + "\t"
                 + current.data.namaPembeli + "\t\t"
                 + current.data.noHp
                );
            current = current.next;
            }
        }
    }
    
// Method untuk menghapus antrean paling depan
public Pembeli_21 removeFirst() {
    // Jika antrean kosong
    if (isEmpty()) {
        System.out.println("Antrean kosong");
        return null;
    }
// Menyimpan data head karena data ini akan dikembalikan
    Pembeli_21 data = head.data;
// Jika hanya ada 1 data
    if (head == tail) {
        head = tail = null;
    }
// Jika data lebih dari 1
    else {
        head = head.next;
        head.prev = null;
    }
// Mengembalikan data pembel yang dipanggil
    return data;
}
}
