import java.util.Scanner;

public class PemilihanPercobaan319 {
    public static void main(String[] args) {

        double angka1, angka2, hasil;
        char operator;

        Scanner input19 = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        angka1 = input19.nextDouble();
        System.out.print("Masukkan angka kedua: ");
        angka2 = input19.nextDouble();
        System.out.print("Masukkan operator (+ - * /): ");
        operator = input19.next().charAt(0);

        switch (operator) {
            case '+':
            hasil = angka1 + angka2;
            System.out.println(angka1 + " + " + angka2 + "=" + hasil);
            break;
            case '-':
            hasil = angka1 - angka2;
            System.out.println(angka1 + " - " + angka2+"="+hasil);
            break;
            case '*':
            hasil = angka1 * angka2;
            System.out.println(angka1 +" * "+ angka2 +"="+ hasil);
            break;
            case '/':
            hasil = angka1 / angka2;
            System.out.println(angka1 +" / "+angka2+ "=" + hasil);
            break;
            }
    }
}
