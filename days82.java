import java.util.Scanner;

public class days82 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] angka = new int[5];

        System.out.println("input 5 angka :");
        for (int i = 0; i < angka.length; i++) {
            System.out.println("input ke :"+(i+1));
            angka [i] = sc.nextInt();

        }

        for (int i = 0; i < angka.length; i++) {
            System.out.println("isi array :"+angka[i]);
        }
    }
}
