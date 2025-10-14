import java.util.Scanner;

public class day37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("masukkan bilangan");
        int a = sc.nextInt();
        if (a %2==0){
            System.out.println("genap");
        } else if (a%2==1) {
            System.out.println("ganjil");
        }
        sc.close();
    }
}
