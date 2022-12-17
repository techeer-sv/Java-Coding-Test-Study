import java.util.*;
 
public class Main {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
 
		int sum = Integer.MAX_VALUE;	// 초기 상태 여부 확인을 위한 값으로 설정 
		StringTokenizer subtraction = new StringTokenizer(sc.nextLine(), "-");
 
		while (subtraction.hasMoreTokens()) {
			int temp = 0;
 
			// 뺄셈으로 나뉜 토큰을 덧셈으로 분리함
			StringTokenizer addition = new StringTokenizer(subtraction.nextToken(), "+");
			
			// 덧셈으로 나뉜 토큰들을 모두 더하기 
			while (addition.hasMoreTokens()) {
				temp += Integer.parseInt(addition.nextToken());
			}
			
			// 첫 번째 토큰인 경우 temp값이 첫 번째 수가 됨
			if (sum == Integer.MAX_VALUE) {
				sum = temp;
			} else {
				sum -= temp;
			}
		}
		System.out.println(sum);
	}
 
}