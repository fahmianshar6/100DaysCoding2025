import java.util.Scanner;

public class day35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("masukkan nilai");
        int a = sc.nextInt();
        if (a >=70){
            System.out.println("lulus");
        }else{
            System.out.println("kamu tidak lulus");
        }
        sc.close();
    }
}
