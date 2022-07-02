import java.util.ArrayList;
import java.util.Scanner;

public class TreciaUzduotis {
    public static void main(String[] args) {
        ArrayList<Integer> listas = nuskaitytiSarasa();
        palygintiSuPirmuSkaiciu(listas);
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
    public static void palygintiSuPirmuSkaiciu(ArrayList<Integer> n){
        int teigemuSkaiciusSuma = 0;
        int neigemiSaiciuSuma = 0;
        for (Integer eDouble : n){
            if (0 < eDouble){
                teigemuSkaiciusSuma++;
            }
            if (0 > eDouble) {
                neigemiSaiciuSuma++;
            }
        }
        if (teigemuSkaiciusSuma == 0){
            System.out.println("didesniu skaiciu nera");
        }
        System.out.println("neigemu skaiciu suma yra " + neigemiSaiciuSuma);
        System.out.println("teigemu skaiciu suma yra " + teigemuSkaiciusSuma);;
    }
}
