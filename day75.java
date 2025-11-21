import java.util.Scanner;

public class day75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("masukkan text");
        String a = sc.nextLine();

        System.out.println("panjang text  :"+a.length());
        System.out.println("huruf kecil   :"+a.toUpperCase());
        System.out.println("huruf kapital :"+a.toLowerCase());
    }
}
