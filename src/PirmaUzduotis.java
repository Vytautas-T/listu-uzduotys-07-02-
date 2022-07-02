import java.util.ArrayList;
import java.util.Scanner;

public class PirmaUzduotis {
    public static void main(String[] args) {
        ArrayList<Integer> prekiuKainos = nuskaitytiSarasa();
        Scanner skaitytuvas = new Scanner(System.in);
        System.out.println("Irasykite ieskoma skaiciu");
        int x = skaitytuvas.nextInt();
        System.out.println(skaiciuPatikrinimas(prekiuKainos, x));


    }

    public static ArrayList<Integer> nuskaitytiSarasa() {
        Scanner skaitytuvas = new Scanner(System.in);
        ArrayList<Integer> skaiciai = new ArrayList<Integer>();
        System.out.println("Iveskite kiek sarase bus skaiciu");
        int n = skaitytuvas.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Iveskite " + i + " saraso elimenta");
            skaiciai.add(skaitytuvas.nextInt());
        }
        return skaiciai;
    }

    public static int skaiciuPatikrinimas(ArrayList<Integer> n, int x) {
        int didesniSkaiciai = 0;

        for (Integer aDouble : n) {
            if (aDouble > x) {
                didesniSkaiciai++;
            }
        }
        if (didesniSkaiciai == 0) {
            System.out.println("nera didesniu skaiciu uz " + x);
        }
        return didesniSkaiciai;
    }
}
