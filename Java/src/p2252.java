import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Do it Algorithm - 자바
 */
public class p2252 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int N, M;
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        ArrayList<ArrayList<Integer>> data = new ArrayList<>();

        for(int i = 0; i <= N; i++)
        {
            data.add(new ArrayList<>());
        }

        int[] inDegree = new int[N+1];

        for(int i = 0; i < M; i++) {
            input = br.readLine().split(" ");
            int S = Integer.parseInt(input[0]);
            int E = Integer.parseInt(input[1]);
            data.get(S).add(E);
            inDegree[E]++;
        }

        // 위상 정렬 실행
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 1; i <= N; i++) {
            if(inDegree[i]==0) {
                queue.add(i);
            }
        }

        while (!queue.isEmpty()) {
            int now = queue.poll();
            System.out.print(now+" ");

            for(int next : data.get(now)) {
                inDegree[next]--;

                if(inDegree[next] == 0) {
                    queue.add(next);
                }
            }
        }
    }
}
