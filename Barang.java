// Kelas ini merepresentasikan barang yang akan dibeli
public class Barang {
    private String kodeBarang;
    private String namaBarang;
    private double hargaBarang;

    // Konstruktor untuk menginisialisasi Barang
    public Barang(String kodeBarang, String namaBarang, double hargaBarang) {
        this.kodeBarang = kodeBarang; // Menyimpan nilai kode barang
        this.namaBarang = namaBarang; // Menyimpan nilai nama barang
        this.hargaBarang = hargaBarang; // Menyimpan harga barang
    }

    // Method untuk mendapatkan nilai Kode Barang dalam bentuk String
    public String getKodeBarang() {
        return kodeBarang;
    }

    // Method untuk mendapatkan nilai Nama Barang dalam bentuk String
    public String getNamaBarang() {
        return namaBarang;
    }

    // Method untuk mendapatkan nilai Harga Barang dalam bentuk double
    public double getHargaBarang() {
        return hargaBarang;
    }

    // Method untuk mengubah nilai Kode Barang
    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    // Method untuk mengubah nilai Nama Barang
    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    // Method untuk mengubah nilai Harga Barang
    public void setHargaBarang(double hargaBarang) {
        this.hargaBarang = hargaBarang;
    }
}
