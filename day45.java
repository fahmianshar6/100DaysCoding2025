import java.util.Scanner;

public class day45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("list chip hdi");
        System.out.println("1: 1b 55k");
        System.out.println("2:800m 45k");
        System.out.println("3:500m 28k");
        System.out.println("4:200m 12k");
        System.out.println("silahkan pilih");
        int pilih = sc.nextInt();
        switch (pilih){
            case 1:
                System.out.println("anda membeli chip 1b");
                break;
            case 2:
                System.out.println("anda membeli chip 800m");
                break;
            case 3:
                System.out.println("anda membeli chip 500m");
                break;
            case 4:
                System.out.println("anda membeli chip 200m");
                break;
            default:
                System.out.println("tidak ada dalam list");
                break;
        }

    }
}
