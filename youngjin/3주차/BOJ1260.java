import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main{
    static boolean visited[];
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int node = Integer.parseInt(st.nextToken());
		int edge = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());
        
        //인접노드 arraylist initialize
        ArrayList<Integer>[] arr = new ArrayList[node+1];
        for(int i = 1; i<= node; i++){
             arr[i] = new ArrayList<Integer>();
        }

        
        for(int i = 0; i<edge; i++){
            st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());
            arr[first].add(second);
            arr[second].add(first);
        }
        //sort
        for(int i=1; i<=node; i++){
            Collections.sort(arr[i]);
        }
        //function 부르기
        visited = new boolean[node+1];
        DFS(start, arr);
        System.out.println();
        visited = new boolean[node+1];
        BFS(start, arr);
        System.out.println();
    }
    public static void DFS(int startNode, ArrayList<Integer>[] A){
        System.out.print(startNode + " ");
        visited[startNode] = true;
        for(int i : A[startNode]){
            if(!visited[i]){
                DFS(i, A);
            }
        }
    }
    public static void BFS(int startNode, ArrayList<Integer>[] A){
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(startNode);
        visited[startNode] = true;
        
        while(!q.isEmpty()){
            int curr = q.poll();
            System.out.print(curr + " ");
            for(int i : A[curr]){
                 if(!visited[i]){
                     visited[i] = true;
                     q.add(i);
                 }
            }
        }
    }
        
 }