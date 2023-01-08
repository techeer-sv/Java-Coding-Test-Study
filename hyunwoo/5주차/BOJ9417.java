import java.util.*;
import java.io.*;

class Main {
    static int N; // 테스트의 개수
    static int[][] number;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        number = new int[N][];
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            number[i] = new int[st.countTokens()];
            for(int j = 0; j < number[i].length; j++)
                number[i][j] = Integer.parseInt(st.nextToken());
        }
        for(int i = 0; i < N; i++) { 
            int max = 0;
            for(int j = 0; j < number[i].length - 1; j++){
                for(int k = j + 1; k < number[i].length; k++){
                    int temp = gcd(number[i][j], number[i][k]);
                    if(max < temp)
                        max = temp;
                }
            }
            System.out.println(max);
        }
    }

    public static int gcd(int a, int b){
        if(b == 0)
            return a;
        if(a == 1 || b == 1)
            return 1;
        if(a > b)
            return gcd(b, a%b);
        else
            return gcd(a, b%a);
    }
}
