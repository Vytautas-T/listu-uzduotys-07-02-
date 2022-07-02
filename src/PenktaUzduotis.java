import java.util.ArrayList;
import java.util.Scanner;

public class PenktaUzduotis {
    public static void main(String[] args) {
        ArrayList<Integer> skaitytuvas = nuskaitytiSarasa();
        ArrayList<Integer> skaiciai = new ArrayList<>();
        /** skaiciai.add(1);
         skaiciai.add(2);
         skaiciai.add(3);
         skaiciai.add(4);
         skaiciai.add(5);
         skaiciai.add(6);
         skaiciai.add(7);
         skaiciai.add(8);
         skaiciai.add(9);
         skaiciai.add(10);**/
        atsakymas(skaiciai);
    }

    public static void atsakymas(ArrayList<Integer> skaiciai) {
        if (liginiuIrNelyginiuSkaiciuDauguma(skaiciai) == 0) {
            if (neLyginiaiSkaiciaiSuma(skaiciai) > lyginiaiSkaiciaiSuma(skaiciai)) {
                System.out.println("lyginiu ir nelyginiu skaiciu yra vienodai bet nelyginiu skaiciu suma yra didesne  " + "nelyginius kaiciu suma yra - " + neLyginiaiSkaiciaiSuma(skaiciai) + "  lyginius skaiciu suma yra - " + lyginiaiSkaiciaiSuma(skaiciai));
            } else {
                System.out.println("lyginiu ir nelyginiu skaiciu yra vienodai bet lyginiu skaiciu suma yra didesne  " + "nelyginiu skaiciu suma yra - " + neLyginiaiSkaiciaiSuma(skaiciai) + "  lyginiu skaiciu suma yra - " + lyginiaiSkaiciaiSuma(skaiciai));
            }
            if (liginiuIrNelyginiuSkaiciuDauguma(skaiciai) == 1) {
                if (neLyginiaiSkaiciaiSuma(skaiciai) > lyginiaiSkaiciaiSuma(skaiciai)) {
                    System.out.println("lyginius skaiciu yra daugiau bet nelyginiu suma yra didesne  " + "nelyginiu skaiciu suma yra - " + neLyginiaiSkaiciaiSuma(skaiciai) + "  lyginiu skaiciu suma yra - " + lyginiaiSkaiciaiSuma(skaiciai));
                } else {
                    System.out.println("lyginius skaiciu yra daugiau ir lyginiu skaiciu suma yra didesne  " + "nelyginiu skaiciu suma - " + neLyginiaiSkaiciaiSuma(skaiciai) + "  lyginiu skaiciu suma - " + lyginiaiSkaiciaiSuma(skaiciai));
                }
            }
        }
    }

    public static int liginiuIrNelyginiuSkaiciuDauguma(ArrayList<Integer> skaiciai) {
        int lyginiaiSkaiciai = 0;
        int nelyginiaiSkaiciai = 0;
        for (int skaicius : skaiciai) {
            if (skaicius % 2 == 0) {
                lyginiaiSkaiciai++;
            }
            if (skaicius % 2 == 1) {
                nelyginiaiSkaiciai++;
            }
        }
        if (nelyginiaiSkaiciai == lyginiaiSkaiciai) {
            return 0;
        }
        if (nelyginiaiSkaiciai < lyginiaiSkaiciai) {
            return 1;
        } else {
            return -1;
        }
    }

    public static int lyginiaiSkaiciaiSuma(ArrayList<Integer> skaiciai) {
        int lyginiaiSkaiciai = 0;
        for (int skaicius : skaiciai) {
            if (skaicius % 2 == 0) {
                lyginiaiSkaiciai += skaicius;
            }
        }
        return lyginiaiSkaiciai;
    }

    public static int neLyginiaiSkaiciaiSuma(ArrayList<Integer> skaiciai) {
        int neLyginiaiSkaiciai = 0;
        for (int skaicius : skaiciai) {
            if (skaicius % 2 == 1) {
                neLyginiaiSkaiciai += skaicius;
            }
        }
        return neLyginiaiSkaiciai;
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
}