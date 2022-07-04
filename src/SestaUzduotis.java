import java.util.ArrayList;

public class SestaUzduotis {
    public static void main(String[] args) {
        ArrayList<Boolean> loginiai = new ArrayList<>();
        loginiai.add(true);
        loginiai.add(false);
        loginiai.add(true);
        loginiai.add(false);
        loginiai.add(true);
        loginiai.add(false);
        loginiai.add(true);
        loginiai.add(false);

        String atsakymas = zodziu(dvejetainis(loginiai));
        System.out.println(atsakymas);

    }
    public static ArrayList<Integer> dvejetainis(ArrayList<Boolean> loginiai) {
        ArrayList<Integer> dvinariai = new ArrayList<>();
        for (boolean login : loginiai) {
            if (login == false){
                dvinariai.add(0);
            }else {
                dvinariai.add(1);
            }
        }
        return dvinariai;
    }
    public static String zodziu (ArrayList<Integer> skaiciu){
        String zodziu = new String();
        for (int i = 0; i < skaiciu.size(); i++) {
            zodziu += skaiciu.get(i).toString();

        }
        return zodziu;
    }
}
