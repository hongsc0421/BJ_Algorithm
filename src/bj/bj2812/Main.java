package bj.bj2812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        String str = br.readLine();
        int size = n-k;

        Stack<Character> s = new Stack<>();
        for(int i = 0; i < str.length() ; i++){
            if(!s.empty()){
                while(!s.empty() && k>0 && s.peek() < str.charAt(i)){
                    s.pop();
                    k--;
                }
            }
            s.push(str.charAt(i));
        }

//        System.out.println(s.size());
//        System.out.println(n-k);
        while(s.size() > size){
            s.pop();
        }
//        System.out.println(s.size());


        StringBuffer sb = new StringBuffer();
        while(!s.isEmpty()){
            sb.append(s.pop());
        }

        System.out.println(sb.reverse().toString());

    }
}
