import java.util.Scanner;

public class day12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukkan nama:");
        String nama = sc.nextLine();

        System.out.print("masukkan alamat:");
        String alamat = sc.nextLine();

        System.out.print("masukkan umur:");
        byte umur = sc.nextByte();
         sc.nextLine();
        System.out.print(" tgl:");
        String tgl = sc.nextLine();
        System.out.println();

        System.out.println("=========== bio data saya ==============");
        System.out.println(nama);
        System.out.println(alamat);
        System.out.println(umur);
        System.out.println(tgl);
    }
}
