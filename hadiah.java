import java.util.Scanner;

public class hadiah {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Masukkan usia: ");
    int usia = scanner.nextInt();

    scanner.nextLine();

    System.out.print("Masukkan jenis kelamin (L/P): ");
    String jenisKelamin = scanner.nextLine().toUpperCase();

    // Memilih hadiah berdasarkan usia
    String hadiahUsia;
    if (usia < 5) {
      hadiahUsia = "Mainan edukasi";
    } else if (usia < 10) {
      hadiahUsia = "Boneka/mobil-mobilan";
    } else if (usia < 15) {
      hadiahUsia = "Permainan board game/alat olahraga";
    } else {
      hadiahUsia = "Gadget/buku/pakaian";
    }

    // Memilih hadiah tambahan berdasarkan jenis kelamin (switch-case)
    String hadiahJenisKelamin = "";
    switch (jenisKelamin) {
      case "L":
        if (usia < 10) {
          hadiahJenisKelamin = "Bola/pistol mainan";
        } else {
          hadiahJenisKelamin = "Sepatu/jam tangan/dompet";
        }
        break;
      case "P":
        if (usia < 10) {
          hadiahJenisKelamin = "Boneka/set alat masak mainan";
        } else {
          hadiahJenisKelamin = "Tas/sepatu/perhiasan";
        }
        break;
      default:
        System.out.println("Jenis kelamin tidak valid");

        scanner.close();
    }

    // Menampilkan hasil
    System.out.println("Hadiah berdasarkan usia: " + hadiahUsia);
    System.out.println("Hadiah tambahan berdasarkan jenis kelamin: " + hadiahJenisKelamin);
    System.out.println("Saran hadiah: " + hadiahUsia + " " + hadiahJenisKelamin);

    scanner.close();
  }
}
