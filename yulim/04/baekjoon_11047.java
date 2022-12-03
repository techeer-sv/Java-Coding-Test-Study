import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, m = 0, n = sc.nextInt(), k = sc.nextInt();
		int a[] = new int[n + 1];
		for (i = 1; i <= n; i++) a[i] = sc.nextInt();
		for(i=n;i>0;i--){
			m+=k/a[i];
            k%=a[i];
		}
		System.out.println(m);
        sc.close();
	}
}