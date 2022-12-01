import java.io.*;

class Main {
    static int T;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            Long a = Long.parseLong(br.readLine());
            if(a % 3 == 2 || (a + 1) % 3 == 0 || a % 9 == 0)
                System.out.println("TAK");
            else
                System.out.println("NIE");
        }
    }
}
