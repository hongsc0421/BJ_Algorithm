package bj1863;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token;
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        int x, y, count=0;

        for(int i=0;i<n;i++){
            token = new StringTokenizer(br.readLine());
            x = Integer.parseInt(token.nextToken());
            y = Integer.parseInt(token.nextToken());

            while(!stack.empty() && stack.peek() > y){
                count++;
                stack.pop();
            }
            if(!stack.empty() && stack.peek() == y){
                continue;
            }
            stack.push(y);
        }

        while(!stack.empty() && stack.peek() > 0){
            count++;
            stack.pop();
        }

        System.out.println(count);
        //System.out.println(stack);

    }
}
