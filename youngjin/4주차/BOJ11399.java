import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.stream.*;


public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int person = Integer.parseInt(br.readLine());
        int[] arr = new int[person];
        int sum = 0;
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < person; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        int[] time = new int[person];
        
        for(int i = 0; i < person; i++){
            sum += arr[i];
            time[i] = sum;
        }
        
        sum = IntStream.of(time).sum();
        
        System.out.println(sum);
    }
}