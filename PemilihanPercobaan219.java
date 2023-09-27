import java.util.Scanner;

public class PemilihanPercobaan219 {
    public static void main(String[] args) {
        Scanner input19 = new Scanner(System.in);

        System.out.print("Nilai uas : ");
        float uas = input19.nextFloat();
        System.out.print("Nilai uts : ");
        float uts = input19.nextFloat();
        System.out.print("Nilai kuis : ");
        float kuis = input19.nextFloat();
        System.out.print("Nilai tugas : ");
        float tugas = input19.nextFloat();

        float total = (uas * 0.4f) + (uts * 0.3f) + (kuis * 0.1f) + (tugas * 0.2f);

        if (total > 80 && total <= 100 ) {
            System.out.println("Nilai anda A (Sangat Baik)");
        } else if (total > 73 && total <= 80) {
            System.out.println("Nilai anda B+ (Lebih dari Baik)");
        } else if (total > 65 && total <= 73) {
            System.out.println("Nilai anda B (Baik)");
        } else if (total > 60 && total <= 65) {
            System.out.println("Nilai anda C+ (Lebih dari Cukup)");
        } else if (total > 50 && total <= 60) {
            System.out.println("Nilai anda C (Cukup)");
        } else if (total > 39 && total <= 50) {
            System.out.println("Nilai anda D (Kurang)");
        } else {
            System.out.println("Nilai anda E (Gagal)");
        }
        
        String message = total < 65 ? "Remidi" : "Tidak remidi";
        System.out.println("Nilai akhir = " + total + " sehingga " + message);
    }
}

