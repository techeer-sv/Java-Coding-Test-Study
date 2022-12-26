import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] array = new int[n];
        for(int i=0; i<n; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(array);
        int answer = array[n-1];
        for(int i=n-1; i >= 0; i--) {
            if(array[i] * (n-i) > answer)
                answer = array[i] * (n-i);
        }
        System.out.print(answer);
    }
}
