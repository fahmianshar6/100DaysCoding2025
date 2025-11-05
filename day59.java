import java.util.Scanner;

public class day59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("masukkan nilai a");
        int a = sc.nextInt();
        System.out.println("angka ganjil");
        for (int i = 0; i <= a ; i++) {
            if (i%2==1){
                System.out.print(i+" ");
            }
        }

        System.out.println();
        System.out.println("angka genap");
        for (int l = 0; l <= a ; l++) {
           if (l%2==0){
               System.out.print(l+" ");
           }
        }
    }
}
