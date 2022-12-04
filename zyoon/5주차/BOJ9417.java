//테스트 케이스만큼 반복 ; 한 줄 - 한 테스트 케이스
//한 줄에 적힌 모든 수를 쌍으로 조합해서 그중에 가장 큰 최대공약수찾자
    //1. 모든 수 쌍 만들기
    //2. 최대공약수 찾기 - 각 쌍마다
    //3. 각각 최대공약수 비교후 가장 큰 값 출력

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine()); // 테스트 케이스 개수 **sc.nextInt();
            
        for (int i = 0; i < n; i++) {
            arr.clear();
            String[] strArr = sc.nextLine().split(" "); //split하여 String 배열에 넣기
            for(int j=0; j<strArr.length; j++) {
                arr.add(Integer.parseInt(strArr[j])); //비교를 위해 int형으로 변환하고 arrayList에 add시켜준다.
            }
            System.out.println(max(arr)+"");        
        }

    }
    
    public static int max(ArrayList<Integer> arr) { //최대값 찾기
        int max = 1;
        for (int i = 1; i <= arr.size(); i++) {
            for (int j = i; j < arr.size(); j++) { //1
                int temp = gcd(arr.get(i - 1), arr.get(j)); //2
                if (max < temp) //3
                    max = temp;
            }
        }
        return max;
    }
    
    public static int gcd(int a, int b) { //2. 최대공약수 찾기
        if (b == 0)
        return a;
        else
        return gcd(b, a % b); // 재귀 함수
    }
    
}