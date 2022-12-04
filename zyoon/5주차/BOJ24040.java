//가로 길이 = 3a + x, 세로 길이 = 3b + y
//부피 N = (3a + x) * (3b + y) = 9ab + 3axy + 3bxy + xy,  둘레 = 3a + 3b + x + y
//장식용 띠의 개수가 3가지 색상 -> 둘레가 3의 배수!!

//1. x= y = 0 인경우 N = 9*a*b 가 되므로 N이 9의 배수인 경우
//2. x와 y가 1, 2 인 경우는 N = 3(...) + 2  가 되므로 3으로 나누었을 때 나머지가 2인 경우

import java.util.*;

public class Main {
 public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        for(int i = 0; i < t; i++) {
            int n = Integer.parseInt(sc.nextLine());
            if(n % 3 == 2 || n % 9 == 0)
                System.out.println("TAK");
            else
                System.out.println("NIE");
        }
    }
}