import java.util.Scanner;

public class PemilihanPercobaan119modifikasi {
    public static void main(String[] args) {

        Scanner input19 = new Scanner(System.in);
        System.out.print("Masukan Angka: ");

        int angka = input19.nextInt();
        String hasil = (angka % 2 == 0) ? "Bilangan Genap" : "Bilangan Ganjil";
        System.out.println("angka " + angka + " " + hasil);
    }
}
