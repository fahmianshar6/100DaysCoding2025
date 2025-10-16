import java.util.Scanner;

public class day39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("list chip higs domino di fa store tekan 1");
        System.out.println("beli 1b tekan 2");
        System.out.println("beli 500m tekan 3");
        System.out.println("beli 300m tekan 4");
        int pilih = sc.nextInt();

        if (pilih == 1){
            System.out.println("1b 55k");
            System.out.println("500m 28k");
            System.out.println("300m 20k");
        } else if (pilih == 2) {
            System.out.println("anda membeli chip 1b seharga 55k");
        } else if (pilih == 3) {
            System.out.println("anda membeli chip 500m seharga 28k");
        } else if (pilih == 4) {
            System.out.println("anda membeli chip 300m seharga 20k");
        }else {
            System.out.println("404 ERROR NOT FOUND");
        }


    }
}
