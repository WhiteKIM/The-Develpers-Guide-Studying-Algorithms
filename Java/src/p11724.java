import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class p11724 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static boolean[] visited;
    public static ArrayList<Integer>[] data;
    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        visited = new boolean[N+1];
        data = new ArrayList[N+1];

        for(int i = 1; i <= N; i++) {
            data[i] = new ArrayList<>();
        }

        for(int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());

            data[from].add(to);
            data[to].add(from);
        }

        int count = 0;
        for(int i = 1; i <= N; i++) {
            if(!visited[i]) {
                count++;
                DFS(i);
            }
        }
        System.out.println(count);
    }

    private static void DFS(int V) {
        if(visited[V]) {
            return;
        }

        visited[V] = true;
        for(int x : data[V]) {
            if(!visited[x])
                DFS(x);
        }
    }
}
