import java.util.Scanner;   
public class RoyalDelish_21 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
    DoubleLinkedListPembeli_21 antrian =
        new DoubleLinkedListPembeli_21();
    DoubleLinkedListPesanan_21 daftarPesanan =
        new DoubleLinkedListPesanan_21();

    int pilih;
    int nomorAntrian = 0;
        do {

 // Tampilan menu utama sesuai modul
    System.out.println("1. Tambah Antrian");
    System.out.println("2. Cetak Antrian");
    System.out.println("3. Hapus Antrian dan Pesan");
    System.out.println("4. Laporan Pesanan");
    System.out.println("5. Cari Pesanan");
    System.out.println("6. Keluar");
    System.out.print("Pilih menu : ");
        pilih = sc.nextInt();
        sc.nextLine();
// Percabangan menu
    switch (pilih) {
        case 1:
// Input data pembeli
    System.out.println("============");
    System.out.println("Tambah Antrian");
    System.out.println("============");

    System.out.print("Nama Pembeli : ");
    String nama = sc.nextLine();

    System.out.print("No HP        : ");
    String hp = sc.nextLine();
// Nomor antrean otomatis bertambah
    nomorAntrian++;
// Membuat object pembeli sesuai konstruktor terbaru
    Pembeli_21 pb =
        new Pembeli_21(nomorAntrian, nama, hp);
// Menambahkan data ke linked list antrean
    antrian.addLast(pb);
    System.out.println( "Antrian berhasil ditambahkan dengan nomor: " + nomorAntrian );
    break;

        case 2:
// Tampilan cetak antrean

System.out.println("=======================");
System.out.println("Daftar Antrian Pembeli");
System.out.println("=======================");
//Menampilkan seluruh antrean
antrian.print();
break;

    case 3:
System.out.println("========================");
System.out.println("Hapus Antrian dan Pesan");
System.out.println("========================");
// Mengambil antrean paling depan
     Pembeli_21 pembeliDilayani =antrian.removeFirst();
// Jika antrean tidak kosong
    if (pembeliDilayani != null) {
        System.out.println("Pembeli dipanggil:");
        System.out.println("No Antrian : "
                + pembeliDilayani.nomorAntrian);

        System.out.println("Nama       : "
                + pembeliDilayani.namaPembeli);

        System.out.println("No HP      : "
                + pembeliDilayani.noHp);

        System.out.println();
// Input pesanan
        System.out.print("Kode Pesanan : ");
        int kode = sc.nextInt();
        sc.nextLine();

        System.out.print("Nama Pesanan : ");
        String namaPesan = sc.nextLine();

        System.out.print("Harga        : ");
        int harga = sc.nextInt();
//  Membuat object pesanan
        Pesanan_21 ps =
                new Pesanan_21(
                        kode,
                        namaPesan,
                        harga
                );
        daftarPesanan.addLast(ps);
    System.out.println(
        pembeliDilayani.namaPembeli
        + " telah memesan "
        + namaPesan
);
    }
    break;
       case 4:
    System.out.println("======================================");
    System.out.println("LAPORAN PESANAN URUT NAMA PESANAN");
    System.out.println("======================================");
// Menampilkan seluruh pesanan yang sudah diurutkan
    daftarPesanan.print();
    break;

    case 5:
    System.out.println("======================");
    System.out.println("Cari Pesanan");
    System.out.println("======================");

    System.out.print("Masukkan nama pesanan : ");
    String cari = sc.nextLine();

    daftarPesanan.cariPesanan(cari);

    break;

        case 6:
// Keluar program
    System.out.println("Program selesai");
     break;
        default:
// Jika input menu salah
        System.out.println("Menu tidak tersedia");
            }
        System.out.println();

        } while (pilih != 6);
    }
}