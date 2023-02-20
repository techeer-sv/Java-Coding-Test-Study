import java.util.*;

public class Main{
    public static int arr[];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        arr = new int[n+1];
        
        for(int i=2; i<=n; i++){
            arr[i] = i;
        } //n까지 수를 넣은 배열
        
        get_prime();

        int total = 0;
        int min = n;
        
        for(int i=m; i<=n; i++){
            if(arr[i] != 0){
                if( min > i ) min = i;
                total += i;
            }
        }
        if(total==0){
            System.out.println(-1);
        }else{
        System.out.println(total + "\n" + min);
        }
    }   
    
    public static void get_prime(){
        arr[0]=0;
        arr[1]=0;

        for(int i=2; i<=Math.sqrt(arr.length); i++){// n의 제곱근;Math.sqrt(n)까지만 수행
            if(arr[i]==0){
                continue;
            } //소수가 아니면(==배수면) 넘어감
            for(int j=i+i; j<arr.length; j=j+i){
                arr[j]=0;
            } //배수 지우기
        }
    }
}
