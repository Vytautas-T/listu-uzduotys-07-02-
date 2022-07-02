import java.util.ArrayList;
import java.util.Scanner;

public class KetvirtaUzduotis {
    public static void main(String[] args) {
        Scanner skaitytuvas = new Scanner(System.in);
        System.out.println("Iveskite kiek zodziu bus ilgesniu uz duota skaiciu x ");
        int x = skaitytuvas.nextInt();
        ArrayList<String> zodziai = new ArrayList<>();
        zodziai.add("masina");
        zodziai.add("garazas");
        zodziai.add("namas");
        zodziai.add("kelias");
        zodziai.add("sunkvezimis");
        zodziai.add("123456789");
        System.out.println(zodziuIlgioSkaicius(zodziuIlgis(zodziai),x));

    }
   /** public static ArrayList<String> nuskaitytiSarasa() {
        Scanner skaitytuvas = new Scanner(System.in);
        ArrayList<String> zodis = new ArrayList<>();
        System.out.println("Iveskite kiek bus sarase zodi");
        int n = skaitytuvas.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("iveskite " + i + " saraso zodis");
            zodis.add(skaitytuvas.toString());
        }
        return zodis;
    }**/
    public static ArrayList<Integer> zodziuIlgis (ArrayList<String> zodziai) {
        ArrayList<Integer> zodziuIlggiai = new ArrayList<>();
        int zodzioIlgis = 0;
        for (String zodis : zodziai) {
            zodzioIlgis = zodis.length();
            zodziuIlggiai.add(zodzioIlgis);
        }
        return zodziuIlggiai;
    }

    public static int zodziuIlgioSkaicius(ArrayList<Integer> n, int x) {
        int didesniSkaiciai = 0;
        for (Integer aDouble : n) {
            if (aDouble > x) {
                didesniSkaiciai++;
            }
        }
        if (didesniSkaiciai == 0) {
            System.out.println("nera ilgesniu zodziu uz " + x);
        }
        return didesniSkaiciai;
    }
}
