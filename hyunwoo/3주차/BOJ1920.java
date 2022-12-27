import java.util.*;
import java.io.*;

public class Main{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);
        
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] B = new int[M];
        for(int i = 0; i < M; i++){
            int num = Integer.parseInt(st.nextToken());
            search(A, N, num);
        }
        
    };
    public static void search(int[] arr, int length, int num){
        int start = 0;
        int end = length - 1;
        int temp = end/2;
        while(true){
            if(arr[temp] == num){
                System.out.println(1);
                break;
            }
            else if(arr[temp] < num)
                start = temp + 1;
            else
                end = temp - 1;
            temp = (start + end) / 2;
            if(end < start){
                System.out.println(0);
                break;
            }
        }
    }
}