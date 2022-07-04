import java.util.ArrayList;
import java.util.Scanner;

public class TreciaUzduotis {
    public static void main(String[] args) {
        ArrayList<Integer> listas = nuskaitytiSarasa();
        palygintiSuPirmuSTeigemukaiciu(listas);
        neigemuSkaiciuSuma(listas);
    }
    public static ArrayList<Integer> nuskaitytiSarasa(){
        Scanner skaitytuvas = new Scanner(System.in);
        ArrayList<Integer> skaicius = new ArrayList<>();
        System.out.println("Iveskite kiek bus sarase skaicius");
        int n = skaitytuvas.nextInt();

        for (int i= 0; i < n; i++) {
            System.out.println("iveskite " + i + " saraso skaiciu");
            skaicius.add(skaitytuvas.nextInt());
        }
        return skaicius;
    }
    public static void palygintiSuPirmuSTeigemukaiciu(ArrayList<Integer> n){
        int teigemuSkaiciusSuma = 0;
        for (Integer eDouble : n){
            if (0 < eDouble){
                teigemuSkaiciusSuma++;
            }
        }
        if (teigemuSkaiciusSuma == 0){
            System.out.println("didesniu skaiciu nera");
        }
        System.out.println("teigemu skaiciu suma yra " + teigemuSkaiciusSuma);;
    }
    public static void neigemuSkaiciuSuma(ArrayList<Integer>n){
        int neigemuSaiciuSuma = 0;
        for (Integer eDouble : n){
            if (0 > eDouble) {
                neigemuSaiciuSuma++;

            }
        }
        System.out.println("neigemu skaiciu suma yra " + neigemuSaiciuSuma);
    }
}
