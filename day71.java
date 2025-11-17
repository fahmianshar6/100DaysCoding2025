import java.util.Scanner;

public class day71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tinggi = sc.nextInt();
        for (int i = 1; i <= tinggi ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
