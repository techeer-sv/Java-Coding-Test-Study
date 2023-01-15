import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int length = Integer.parseInt(st.nextToken());
        int sum = Integer.parseInt(st.nextToken());
        int[] arr = new int[length];
        int count = 0;
        
        for(int i = 0; i<length; i++){
            arr[i] = Integer.parseInt(br.readLine());
        };
        
        for(int i = length-1; i>=0; i--){
            if(sum >= arr[i]){
               count += (sum/arr[i]);
               sum = sum % arr[i];
            }
        }  
        System.out.println(count);
    }
}