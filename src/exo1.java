import java.util.Scanner;

import static sun.misc.Version.println;

public class exo1 {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        StringBuffer buf = new StringBuffer();
        buf.append('W');
        for (int i = 0; i < n; i ++ ){
            buf.append('o');
        }
        buf.append('w');
        System.out.println(buf);
    }
}
