import java.util.Scanner;
public class Day44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai Anda: ");
        int nilai = sc.nextInt();
        char predikat;

        if (nilai >= 85) {
            predikat = 'A';
        } else if (nilai >= 70) {
            predikat = 'B';
        } else if (nilai >= 55) {
            predikat = 'C';
        } else if (nilai >= 40) {
            predikat = 'D';
        } else {
            predikat = 'E';
        }
        System.out.println("Predikat: " + predikat);
    }
}