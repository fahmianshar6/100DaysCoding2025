import java.util.Scanner;

public class day50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("masukkan angka");
        int a = sc.nextInt();
        String hasil = (a %2==1)? "ganjil" : "genap";

        System.out.println("angka "+a+" adalah :"+hasil);
    }
}
