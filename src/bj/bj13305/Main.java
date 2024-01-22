package bj.bj13305;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] distance = new int[n-1];
        int[] cost = new int[n];


        for(int i=0;i<n-1;i++){
            distance[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            cost[i] = sc.nextInt();
        }

        int min_cost = 9999999;
        int result = 0;

        for(int i=0;i<n-1;i++){
            if(cost[i] < min_cost){
                min_cost = cost[i];
            }
            result += min_cost * distance[i];
        }

        System.out.println(result);
    }
}
