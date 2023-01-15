import java.util.LinkedList;
import java.util.Queue;

/**
 * 단어들을 통해서 그래프를 만들 수 있다.
 * 그리고 해당 그래프를 BFS를 하여 begin 단어부터 target 단어까지 최단 거리를 구하는 문제이다.
 * 가중치가 없는 그래프에서 최단 거리는 BFS를 통해서 구한다.
 * **/

class Solution {

    /**
     * 그래프의 한 노드를 나타내는 자료형이다.
     * 하나의 노드는 다음 단어와 begin으로부터 자신과의 거리를 데이터로 갖고 있다.
     * 즉, edge로 표현된 begin으로부터 자신과의 거리는 정말로 자기 자신의 노드가 갖고 있는 데이터이고,
     * next는 포인터 역할을 해주는 데이터이다.
     * **/
    static class Node {
        String next;
        int edge;

        public Node(String next, int edge) {
            this.next = next;
            this.edge = edge;
        }
    }

    public int solution(String begin, String target, String[] words) {
        // n은 노드의 개수이며, 이는 words에 포함된 단어의 개수에서 가져온다.
        // ans는 begin으로부터 target까지의 거리이며, 아직 측정되지 않았기에 0으로 초기화한다.
        int n = words.length, ans = 0;

        // words 내부에 target이란 단어가 있는 지 검증하는 코드이다.
        // AND 연산자로부터 파생되는 경우의 수에 따라서 여부를 확인한 코드인데, 상당하다.
        // 따로 설명이 필요한 수준.
        // for (int i=0; i<n; i++)
        //  if (words[i] != target && i == n-1) return 0;

        // linked list를 이용하여 graph를 구현한다.
        // array list를 이용하면 string이란 자료형을 다루기 어려워서 이것을 선택했을까?
        Queue<Node> q = new LinkedList<>();

        // 방문배열을 생성한다.
        // 이때 거리 데이터는 linked list에 넣어뒀기 때문에 방문 여부만 체크하면 된다.
        // 체크해야 하는 데이터를 파악하고 적절한 자료구조에 넣어줘야 한다.
        boolean[] visit = new boolean[n];
        // bfs를 하기 위해서 가장 첫번째 node 넣어준다.
        // 이때 해당 노드는 root 노드이기에 단순히 begin을 가리킨다.
        q.add(new Node(begin, 0));

        // bfs 수행 코드
        while(!q.isEmpty()) {
            // 만약에 현재 노드 다음에 있는 단어가 target이라면, 그곳까지의 거리를 나타냈던 edge를 반환한다.
            // 여기선 cur 노드를 검사한다.
            Node cur = q.poll();
            if (cur.next.equals(target)) {
                ans = cur.edge;
                break;
            }

            for (int i=0; i<n; i++) {
                // 해당 and 연산자가 매우 탁월하다.
                // isNext란 조건을 먼저 추상화하여 if문을 작성한 뒤에 해당 메서드를 구현해준다.
                // 원하는 논리부터 작성한 뒤에 세세한 것을 구현할 수 있다.
                // 여기서부터는 cur.next 노드를 검사한다.
                if (!visit[i] && isNext(cur.next, words[i])) {
                    visit[i] = true;
                    q.add(new Node(words[i], cur.edge + 1));
                }
            }
        }

        return ans;
    }

    // 현재 노드로부터 거리가 1인지 확인하는 메서드
    static boolean isNext(String cur, String n) {
        // 처음 거리는 0으로 초기화
        int cnt = 0;
        for (int i=0; i<n.length(); i++) {
            if (cur.charAt(i) != n.charAt(i)) {
                // 만약 글자가 하나 달라서 거리를 추가해야 하는 경우에
                // 거리를 먼저 추가하고, 그 거리가 1보다 크다면 next가 아니기에 false를 리턴한다.
                if (++ cnt > 1) return false;
            }
        }
        // 추가할 거리들을 다 추가했는데도 거리가 1 미만, 즉 0 또는 1이라면, next에 있는 단어이다.
        return true;
    }
}