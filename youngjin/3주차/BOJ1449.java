import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
 
public class Main {
    public static void main(String[] args) throws IOException {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
        int tape = 0;
        
        int[] arr = new int[x];
		st = new StringTokenizer(br.readLine());
        
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken()); 
		}
        Arrays.sort(arr);
        br.close();
       
        double tapeRange = arr[0] - 0.5 + y;
        tape++;
        
        for(int i =0 ; i<arr.length; i++){
            if(tapeRange < arr[i] + 0.5 ){
                tapeRange = arr[i] - 0.5 + y;
                tape++;
            }
        }
        System.out.println(tape);
    }
}