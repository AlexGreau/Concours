import java.util.Scanner;

public class GNY07A {

    public static String cut(String s, int n){
        StringBuilder builder =new StringBuilder(s);
        builder.deleteCharAt(n-1);
        String res = builder.toString();

        return res;
    }
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        // premier chiffre est le nombre de donnees attendues
        final int count = sc.nextInt();
        int [] indices = new int [count] ;
        String [] strs = new String [count];
        String[] tempstr = new String [2];
        String temp;
        temp = sc.nextLine();
        for (int i = 0; i < count; i++){
            temp = sc.nextLine();
            tempstr = temp.split(" ");
            indices [i] = Integer.parseInt(tempstr [0]);
            strs [i] = tempstr [1];
        }

        for (int i = 0; i < count; i++){
            System.out.println(i+1 + " " + cut(strs[i],indices[i]));
        }
    }
}
