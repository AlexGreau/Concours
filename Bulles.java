import java.util.ArrayList;
import java.util.Scanner;

public class Bulles {


    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<Integer>();
        ArrayList<Integer> tab = new ArrayList<Integer>();
        int decalCount = 0;

        final Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        final Scanner sc2 = new Scanner (s);
        // recup data
        while (sc2.hasNextInt()){
            data.add(sc2.nextInt());
        }
        tab.add(data.get(0));

        for (int i = 1 ; i < data.size(); i ++ ){
            int j = 0;
            while (j < tab.size()  && (tab.get(j) > data.get(i)) ){
                decalCount ++;
                j ++;
            }
            if (j > tab.size()){
                tab.add(data.get(i));
            }
            else {
                tab.add(j,data.get(i));
            }
        }

        System.out.println(decalCount);






    }
}
