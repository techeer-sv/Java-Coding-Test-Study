import java.util.Scanner;
import java.io.IOException;

public class Main {

public static void main(String args[]) throws IOException	{
		
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		for(int test_case = 0; test_case < T; test_case++) {
			
			int[] arr = new int[100];
			int max=0;
			int res=0;
			String input=sc.nextLine();
			int x=0;
			for(String in : input.split(" ")) {
				if(Integer.parseInt(in)!=0) {
					arr[x]= Integer.parseInt(in);
					x++;
				}
				
			}
			
			for(int i=0; i<x-1; i++) {
				for(int j=i+1; j<x; j++) {
					res=gcd(arr[i],arr[j]);
					if(max<res) {
						max=res;
					}
				}
			}
			
			
			System.out.println(max);
		}
	}
	
	public static int gcd(int v1, int v2) {
		int x, y;
		if(v1>v2) {
			x=v1;
			y=v2;
			
		}else {
			x=v2;
			y=v1;
		}
		
		while(y>0) {
			int tmp=y;
			y=x%y;
			x=tmp;
		}
		return x;
	}

}