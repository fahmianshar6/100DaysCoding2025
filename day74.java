import java.util.Scanner;

public class day74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("menu top up all game");
            System.out.println("=====================");
            System.out.println("1. dm ml");
            System.out.println("2. dm ff");
            System.out.println("3. cash pubg");
           pilih = sc.nextInt();



        switch (pilih){
            case 1 :
                System.out.println("anda memilih dm ff");
                break;

            case 2:
                System.out.println("anda memilih dm ml");

                break;

            case 3 :
                System.out.println("anda memilih cash pubg");
                
                break;

            case 4 :
                System.out.println("anda memilih keluar");
                
                break;
        }




        }while (pilih !=4);
    }
}

