package bj1758;

import java.util.*;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int[] tip = new int[n];

       for(int i=0;i<n;i++){
           tip[i] = sc.nextInt();
       }
       sc.close();

       Arrays.sort(tip);

       long result = 0;
       for(int i=n-1;i>=0;i--){
           if(tip[i] - (n-i-1) > 0){
               result += tip[i] - (n-i-1);
           }
       }

       System.out.println(result);


    }
}
