import java.util.*;

//테이프를 최소한 사용해서 물이 새는 곳을 막아라
//테이프끼리 0.5만큼 겹쳐야 물 안 샌다.
public class Main {

    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //물이 새는 곳 개수
		int L = sc.nextInt(); // 테이프 길이
		
		int min = 0;
		
		double[] arr = new double[n]; //물 새는 곳 배열
 
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

        //물 새는 곳 위치 정렬
        Arrays.sort(arr);
		
        //물이 샌 곳에 테이프를 붙였을 떄, 테이프가 영향 미치는 범위
        double taperange = (arr[0] - 0.5 + L);
        min++;

        //해당 범위 넘어 가는 부분에는 새로 테이프 붙이기
        for(int i = 1; i < arr.length; i++) {
            if (taperange < (arr[i] + 0.5)){
                taperange = (arr[i] - 0.5 + L);
                min ++;
            }
        }

        System.out.println(min);

	}
}
