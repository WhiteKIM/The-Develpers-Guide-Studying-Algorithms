import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Do it Algorithm - java
 */
public class p1717 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static int[] parent;
    public static int find(int x) {
        if(x == parent[x])
            return x;
        else {
            return parent[x] = find(parent[x]);
        }
    }

    public static void union(int x, int y) {
        // 대표 노드를 찾아서 연결
        x = find(x);
        y = find(y);

        if(x != y)
            parent[y] = x;
    }

    public static boolean checkSame(int x, int y) {
        x = find(x);
        y = find(y);

        if(x == y)
            return true;
        return false;
    }

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int N;
        int M;
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        parent = new int[N+1];
        for(int i = 1; i <= N; i++) {
            parent[i] = i;
        }
        for(int i = 0; i < M; i++) {
            input = br.readLine().split(" ");
            int op = Integer.parseInt(input[0]);
            int x = Integer.parseInt(input[1]);
            int y = Integer.parseInt(input[2]);

            if(op == 0) {
                union(x, y);
            } else {
                if(checkSame(x, y)) {
                    sb.append("YES").append("\n");
                } else {
                    sb.append("NO").append("\n");
                }
            }
        }
        System.out.println(sb.toString());
    }
}
