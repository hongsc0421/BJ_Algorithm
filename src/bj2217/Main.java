package bj2217;

import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];


        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int result = arr[n-1];
        int temp;

        for(int i=0;i<n;i++){
            temp = arr[i] * (n-i);
            if(temp > result){
                result = temp;
            }
        }

        System.out.println(result);

    }
}
