import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class p18352 {
    public static int result[];
    public static ArrayList<Integer>[] map;
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void bfs(ArrayList<Integer>[] map, int x, int k) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(x);
        result[x] = 0;

        while (!queue.isEmpty()) {
            int num1 = queue.poll();//탐색할 도시 도시1

            if(result[num1] > k)
                break;

            if(map[num1] == null)
                continue;

            for(int i : map[num1]) {
                if(result[i] == -1) {
                    result[i] = result[num1]+1;
                    queue.add(i);
                }
            }
        }
    }

    public static void main(String[] args) throws Exception{
        int N, M, K, X;
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());

        map = new ArrayList[N+1];
        result = new int[N+1];
        boolean check = false;

        for(int i = 0; i < result.length; i++)
            result[i] = -1;

        for(int i = 0; i < M; i++) {
            int x, y;
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            if(map[x]==null)
                map[x] = new ArrayList<>();
            map[x].add(y);
        }

        bfs(map, X, K);
        for(int i = 1; i < result.length; i++) {
            if(result[i] == K) {
                check =true;
                System.out.println(i);
            }
        }
        if(!check)
            System.out.println(-1);
    }
}
