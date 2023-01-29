/* Online Java Compiler and Editor */
import java.util.*;

public class Main{

    private static int soulution (char c, String str) {
        int size = str.length();
        int count = 0;
        for(int idx = 0; idx < size; idx++){
            if(c == str.charAt(idx)){
                count++;
            }
        }
        return count;
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(soulution(c,str));
    }
}