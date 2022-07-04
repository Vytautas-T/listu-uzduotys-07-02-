import java.util.ArrayList;
import java.util.Scanner;

public class SeptinaUzduotis {
    public static void main(String[] args) {
        Scanner skaitytuvas = new Scanner(System.in);
        int x = skaitytuvas.nextInt();
        skaitmenys(x);
    }
    public static void skaitmenys(int x){
        ArrayList<Integer> skaitmenys = new ArrayList<>();
        while (x / 10 > 0) {
            System.out.println( x % 10);
            x = x % 10;
            skaitmenys.add(x);
        }
    }
}
