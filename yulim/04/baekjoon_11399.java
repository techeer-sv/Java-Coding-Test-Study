import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, min = 0, n = sc.nextInt(), p[] = new int[n+1];
		for (i = 1; i <= n; i++) p[i] = sc.nextInt();
		Arrays.sort(p);
		for (i = 1; i <= n; i++) {
			p[i] = p[i - 1] + p[i];
			min += p[i];
		}
		System.out.println(min);
		sc.close();
	}
}