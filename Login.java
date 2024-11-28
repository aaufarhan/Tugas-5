import java.util.Random;
import java.util.Scanner;

// Kelas ini menangani proses login
public class Login {
    private String validUsername; // Menyimpan username yang valid
    private String validPassword; // Menyimpan password yang valid

    // Konstruktor untuk menginisialisasi username dan password
    public Login(String validUsername, String validPassword) {
        this.validUsername = validUsername;
        this.validPassword = validPassword;
    }

    // Method untuk menangani login
    public boolean authenticate(Scanner scanner) {
        System.out.println("Login");
        System.out.println("+-----------------------------------------------------+");
        System.out.print("Username: ");
        String username = scanner.nextLine(); // Mengambil input berupa String untuk Username

        System.out.print("Password: ");
        String password = scanner.nextLine(); // Mengambil input berupa String untuk Password

        // Validasi username dan password
        if (!username.equals(validUsername) || !password.equals(validPassword)) {
            System.out.println("Username atau password salah, silakan coba lagi.");
            return false; // Mengembalikan false jika login gagal
        }

        // Jika username dan password benar, lakukan validasi captcha acak
        while (true) {
            String captcha = generateCaptcha(6); // Membuat captcha acak dengan panjang 6 karakter
            System.out.println("Captcha: " + captcha);

            // Mengambil input captcha dari user
            System.out.print("Masukkan Captcha: ");
            String userCaptcha = scanner.nextLine(); // Mengambil input jawaban captcha dari user

            // Validasi captcha
            if (!userCaptcha.equals(captcha)) {
                System.out.println("Captcha salah, captcha baru dihasilkan.");
            } else {
                // Login berhasil
                System.out.println("Login berhasil!");
                System.out.println("+-----------------------------------------------------+");
                return true; // Mengembalikan true jika login berhasil
            }
        }
    }

    // Method untuk mengubah username yang valid
    public void setValidUsername(String validUsername) {
        this.validUsername = validUsername;
    }

    // Method untuk mengubah password yang valid
    public void setValidPassword(String validPassword) {
        this.validPassword = validPassword;
    }

    // Method untuk menghasilkan captcha acak
    private String generateCaptcha(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"; // Kumpulan karakter yang akan digunakan dalam captcha
        Random random = new Random();
        StringBuilder captcha = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(chars.length()); // Mengambil karakter acak dari string chars
            captcha.append(chars.charAt(index)); // Menambahkan karakter ke dalam captcha
        }

        return captcha.toString(); // Mengembalikan captcha dalam bentuk String
    }
}
