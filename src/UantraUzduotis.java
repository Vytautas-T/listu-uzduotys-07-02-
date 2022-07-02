import java.util.ArrayList;
import java.util.Scanner;

public class UantraUzduotis {
    public static void main(String[] args) {
        ArrayList<Double> listas = nuskaitytiSarasa();
        System.out.println(palygintiSuPirmuSkaiciu(listas));
    }
    public static ArrayList<Double> nuskaitytiSarasa(){
        Scanner skaitytuvas = new Scanner(System.in);
        ArrayList<Double> skaicius = new ArrayList<>();
        System.out.println("Iveskite kiek bus sarase skaicius");
        int n = skaitytuvas.nextInt();

        for (int i= 0; i < n; i++) {
            System.out.println("iveskite " + i + " saraso skaiciu");
            skaicius.add(skaitytuvas.nextDouble());
        }
        return skaicius;
    }
    public static double palygintiSuPirmuSkaiciu(ArrayList<Double> n){
        int didesnisSkaicius = 0;
        for (Double eDouble : n){
            if (n.get(1) < eDouble){
                didesnisSkaicius++;
            }
        }
        if (didesnisSkaicius == 0){
            System.out.println("didesniu skaiciu nera");
        }
        return didesnisSkaicius;
    }
}

