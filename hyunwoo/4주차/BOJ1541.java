import java.util.*;
import java.io.*;

class Main {
    static int N;
    static int answer;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), "+:-", true);
        ArrayList<Integer> num = new ArrayList<>(Arrays.asList());
        ArrayList<String> sign = new ArrayList<>(Arrays.asList());

        answer += Integer.parseInt(st.nextToken());
        while(st.hasMoreTokens()){
            sign.add(st.nextToken());
            num.add(Integer.parseInt(st.nextToken()));
        }
        for(int i = 0; i < num.size(); i++){
            if(sign.get(i).equals("-")){
                answer -= num.get(i);
                int j = i+1;
                for(; j < num.size(); j++){
                    if(sign.get(j).equals("+")){
                        answer -= num.get(j);
                    }
                    else
                        break;
                }
                i = j-1;
            }
            else{
                answer += num.get(i);
            }
        }
        System.out.println(answer);
    }
}
