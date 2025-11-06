import java.util.Scanner;

public class day60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" masukkan angka a : ");
        int a = sc.nextInt();
        System.out.println("masukkan kelipatan : ");
        int k = sc.nextInt();

        for (int i = 1;i <= a;i++){
            if (i%k==0){
                System.out.println(i);
            }

        }
        System.out.println("1 sampai "+a+" dengan kelipatan "+k);
    }
}
