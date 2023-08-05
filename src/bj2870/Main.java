package bj2870;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.*;

public class Main {
    static ArrayList<BigInteger> result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        result = new ArrayList<>();

        for(int i=0;i<n;i++){
            String str = br.readLine();
            calc(str);
        }
        Collections.sort(result);

        for(BigInteger res:result){
            System.out.println(res);
        }
    }
    public static void calc(String str){
        String temp = "";
        for(int i=0;i<str.length();i++){
            char k = str.charAt(i);
            if(k == '0' || k == '1' || k == '2' || k == '3' || k == '4' || k == '5' || k == '6' || k == '7' || k == '8' || k == '9'){
                temp += k;
            }
            else{
                if(temp != ""){
                    result.add(new BigInteger(temp));
                    temp = "";
                }
            }
        }
        if(temp != ""){
            result.add(new BigInteger(temp));
        }

    }
}
