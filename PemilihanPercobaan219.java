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
        
        String message = total < 65 ? "Remidi" : "Tidak remidi";
        System.out.println("Nilai akhir = " + total + " sehingga " + message);
    }
} 
