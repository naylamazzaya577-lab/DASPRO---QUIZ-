public class NodePembeli_21 {
 // Menyimpan data pembeli
    Pembeli_21 data;
 // Pointer ke node berikutnya
    NodePembeli_21 next;
 // Pointer ke node sebelumnya
    NodePembeli_21 prev;
 // Konstruktor node pembeli
    public NodePembeli_21 (NodePembeli_21 prev, Pembeli_21 data, NodePembeli_21 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}