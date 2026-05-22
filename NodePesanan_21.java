public class NodePesanan_21{
// Menyimpan data pesanan
    Pesanan_21 data;
// Pointer ke node berikutnya
    NodePesanan_21 next;
// Pointer ke node sebelumnya
    NodePesanan_21 prev;
// Konstruktor node pesanan
    public NodePesanan_21 (NodePesanan_21 prev, Pesanan_21 data, NodePesanan_21 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}