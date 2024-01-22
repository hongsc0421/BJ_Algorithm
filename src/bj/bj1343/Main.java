package bj.bj1343;

import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        String res = "";
        String A = "AAAA", B = "BB";

        s = s.replaceAll("XXXX", A);
        res = s.replaceAll("XX", B);

        if(res.contains("X")){
            res = "-1";
        }

        System.out.println(res);
    }
}
