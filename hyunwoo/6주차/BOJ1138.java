import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] array = new int[n];
        for(int i=0; i<n; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }
        ArrayList<Integer> answer = new ArrayList<Integer> ();
        for(int i=n-1; i>=0; i--) {
            answer.add(array[i],i+1);
        }
        for(int i=0; i<n; i++) {
            System.out.print(answer.get(i));
            System.out.print(" ");
        }
    }
}
