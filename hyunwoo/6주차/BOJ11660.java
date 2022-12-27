import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static List<Integer>[] relation;
    static boolean[] checked;
    static int res = -1;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[][] array = new int[a+1][a+1];
        int[][] add_array = new int[a+1][a+1];

        for(int i = 1; i <= a; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j <= a; j++) {
                array[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i = 1; i <= a; i++) {
            for(int j = 1; j <= a; j++) {
                add_array[i][j] = add_array[i][j-1] + add_array[i-1][j] - add_array[i-1][j-1] + array[i][j];
            }
        }

        for(int i = 0; i < b; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int answer = add_array[x2][y2] - add_array[x1 - 1][y2] -  add_array[x2][y1 - 1] + add_array[x1-1][y1-1];
            System.out.println(answer);
        }
    }
}
