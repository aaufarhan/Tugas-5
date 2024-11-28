// Kelas ini merepresentasikan faktur yang berisi informasi pembelian
// Kelas Faktur mewarisi dari kelas Barang (Inheritance)
public class Faktur extends Barang {
    private String noFaktur; // Menyimpan nilai No Faktur
    private int jumlahBeli;  // Menyimpan jumlah barang yang dibeli

    // Konstruktor Faktur memanggil konstruktor Barang dengan keyword 'super' (Inheritance)
    public Faktur(String noFaktur, String kodeBarang, String namaBarang, double hargaBarang, int jumlahBeli) {
        super(kodeBarang, namaBarang, hargaBarang); // Memanggil konstruktor kelas dasar Barang
        this.noFaktur = noFaktur;
        this.jumlahBeli = jumlahBeli;
    }

    // Method untuk menghitung total harga barang berdasarkan harga satuan dan jumlah beli
    public double hitungTotal() {
        return getHargaBarang() * jumlahBeli; // Menghitung total harga
    }

    // Method untuk menampilkan informasi faktur
    public void printFaktur() {
        System.out.println("+---------Detail Pembelian Barang---------+");
        System.out.println("No Faktur: " + noFaktur); // Menampilkan No Faktur
        System.out.println("Kode Barang: " + getKodeBarang()); // Menampilkan Kode Barang
        System.out.println("Nama Barang: " + getNamaBarang()); // Menampilkan Nama Barang
        System.out.println("Harga Barang: Rp " + getHargaBarang()); // Menampilkan Harga Barang
        System.out.println("Jumlah Beli: " + jumlahBeli); // Menampilkan Jumlah Beli
        System.out.println("Total: Rp " + hitungTotal()); // Menampilkan total harga barang
    }

    // Method untuk mengubah nilai Jumlah Beli
    public void setJumlahBeli(int jumlahBeli) {
        this.jumlahBeli = jumlahBeli;
    }

    // Method untuk mengubah nilai No Faktur
    public void setNoFaktur(String noFaktur) {
        this.noFaktur = noFaktur;
    }
}
