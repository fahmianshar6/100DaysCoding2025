import java.util.Scanner;
public class day46 {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);

        System.out.println("Menu minuman: ");
        System.out.println("1. Kopi Hitam");
        System.out.println("2. Kopi Susu");
        System.out.println("3. Cappucino");
        System.out.println("4. Milo");
        System.out.print("Pilih menu di diatas (1-4):");
        
        int minuman= w.nextInt();

        switch (minuman) {
            case 1:
                System.out.println("Anda memilih Kopi Hitam");
                System.out.println("Seharga: Rp 6.000");
                break;
            case 2:
                System.out.println("Anda memilih Kopi Susu");
                System.out.println("Seharga: Rp 8.000");
                break;
            case 3:
                System.out.println("Anda memilih Cappucino");
                System.out.println("Seharga: Rp 8.000");
                break;
            case 4:
                System.out.println("Anda Memilih Milo");
                System.out.println("Seharga: Rp 12.000");
                break;
            default:
                System.out.println("Minuman atau pilihan yang anda pilih tidak ada. Mohon ulangi lagi!");
                break;
        }
    }
}
