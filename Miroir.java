import java.util.Scanner;

public class Miroir {

    public static int mirror (int input, int indice) {
        int returnval = 0;
        int i = 0;
        while( i < 32 &&  i < indice) {
            int bit = input & 0x01;
            returnval |= bit;
            input >>= 1;
            returnval <<= 1;
            i ++;
        }
        return returnval;
    }

    private String hexToBin(String hex){
        String bin = "";
        String binFragment = "";
        int iHex;
        hex = hex.trim();
        hex = hex.replaceFirst("0x", "");

        for(int i = 0; i < hex.length(); i++){
            iHex = Integer.parseInt(""+hex.charAt(i),16);
            binFragment = Integer.toBinaryString(iHex);

            while(binFragment.length() < 4){
                binFragment = "0" + binFragment;
            }
            bin += binFragment;
        }
        return bin;
    }

    public static void main(String[] args) {
        // creer nouveau tableau

        // tant que plus petit , res ++

        System.out.println(mirror(011101, 2));
    }
}
