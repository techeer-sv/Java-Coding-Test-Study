import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); //N 종류
		int K = sc.nextInt(); //가치합 K
		
		int[] coin = new int[N]; //동전들
        int count = 0; //필요한 최소 동전 개수
		
		for(int i = 0; i < N; i++) {
			coin[i] = sc.nextInt();
		}
        
		for(int i = N - 1; i >= 0; i--) {
			if(K >= coin[i]) {
				count += (K / coin[i]);
				K = K % coin[i];
			}
		}
        
		System.out.println(count);
        
	}
}