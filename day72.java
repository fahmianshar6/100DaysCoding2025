import java.util.Scanner;

public class day72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("masukkan tinggi segitiga");
        int a = sc.nextInt();
        for (int i = a; i >= 1 ; i--) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
