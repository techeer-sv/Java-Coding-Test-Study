import java.util.*;

//A[n]에 주어진 M개의 수(X)들이 있는지 찾기
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        //-----A[] 만들기------
		int n = sc.nextInt();

		int[] A = new int[n];
		for(int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}
	
		Arrays.sort(A);

        //-----M개 수들이 A안에 존재하는지------
		
		int m = sc.nextInt();
		
        //m개의 X개 받아서 확인하기
		for(int i = 0; i < m; i++) { 
			int answer = 0;
            int start = 0, end = n - 1; //A[]에서 시작, 끝 인덱스
            int x = sc.nextInt(); 
            while (start <= end) {
                int mid = (start + end) / 2; 
                if (A[mid] == x) {
                    answer = 1;
                    break;
                }
                if (A[mid] > x) {
                    end = mid - 1; 
                } else start = mid + 1;
            }
            System.out.println(answer);
	    }
	}
}
