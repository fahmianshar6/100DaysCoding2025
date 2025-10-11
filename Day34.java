public class Day34 {
    public static void main(String[] args) {
        int x = 30;
        int y = 20;
        int z = 10;
        boolean hasil = ((x * y) < (y + z)) && (x != z);
        System.out.println("Apakah (x * y) < (y + z) dan x tidak sama dengan z ? "+ hasil);
    }
}
