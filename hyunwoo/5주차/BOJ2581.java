import java.util.*;
import java.io.*;

class Main {
    static int N, M;
    static ArrayList<Integer> number;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        M = Integer.parseInt(br.readLine());
        N = Integer.parseInt(br.readLine());
        number = new ArrayList<Integer>();
        if(M == 1)
            M++;
        for(int i = M; i <= N; i++){
            number.add(i);
        }
        for(int j = 0; j < number.size(); j++){
            for(int k = 2; k <= N; k++){
                if(number.get(j) % k == 0 && number.get(j) != k){
                    number.remove(j);
                    j--;
                    break;
                }
            }
        }
        if(number.isEmpty())
            System.out.println(-1);
        else {
            int answer = 0;
            for(int k = 0; k < number.size(); k++){
                answer += number.get(k);
            }
            System.out.println(answer);
            System.out.println(number.get(0));
        }
    }
}
