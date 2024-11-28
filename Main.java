import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

// Kelas ini adalah kelas utama untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            // Username dan password yang sudah ditentukan
            String validUsername = "admin";
            String validPassword = "admin123";

            // Membuat objek Login
            Login login = new Login(validUsername, validPassword);

            // Proses login
            if (!login.authenticate(scanner)) {
                System.out.println("Login gagal. Program dihentikan.");
                return;
            }

            // Menampilkan pesan selamat datang
            System.out.println("Selamat Datang di Sigmart");
            System.out.println("Tanggal dan Waktu: " + getCurrentDateTime());
            System.out.println("+----------------------------------------------------+");

            // Input No Faktur
            System.out.print("Masukkan No Faktur: ");
            String noFaktur = scanner.nextLine(); // Pastikan mengambil input sebagai string

            // Input Kode Barang
            System.out.print("Masukkan Kode Barang: ");
            String kodeBarang = scanner.nextLine();

            // Input Nama Barang
            System.out.print("Masukkan Nama Barang: ");
            String namaBarang = scanner.nextLine();

            // Input Harga Barang
            System.out.print("Masukkan Harga Barang: Rp ");
            double hargaBarang = scanner.nextDouble();

            // Input Jumlah Beli
            System.out.print("Masukkan Jumlah Beli: ");
            int jumlahBeli = scanner.nextInt();

            // Validasi input jumlah beli (Exception Handling)
            if (jumlahBeli <= 0) {
                throw new IllegalArgumentException("Jumlah beli harus lebih dari 0.");
            }

            // Membuat objek Faktur (Inheritance)
            Faktur faktur = new Faktur(noFaktur, kodeBarang, namaBarang, hargaBarang, jumlahBeli);

            // Menampilkan detail pembelian barang
            System.out.println("+---------Detail Pembelian Barang---------+");
            faktur.printFaktur();
            System.out.println("Kasir: Farhan Aufa");
            System.out.println("+----------------------------------------------------+");

        } catch (IllegalArgumentException e) {
            // Menangani exception jika jumlah beli tidak valid (Exception Handling)
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            // Menangani exception lain yang tidak terduga (Exception Handling)
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }

    // Method untuk mendapatkan tanggal dan waktu saat ini
    private static String getCurrentDateTime() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss"); // Format tanggal dan waktu
        Date date = new Date(); // Membuat objek Date yang berisi tanggal dan waktu saat ini
        return formatter.format(date); // Mengembalikan tanggal dan waktu dalam format yang ditentukan
    }
}
