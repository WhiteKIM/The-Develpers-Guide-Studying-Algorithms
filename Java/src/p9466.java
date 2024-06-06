import java.util.ArrayList;
import java.util.Scanner;

public class p9466 {
    public static int[] visited;
    public static int[] finished;
    public static int cycle = 0;
    public static void DFS(int[] data, int x) {
        visited[x] = 1;
        int node = data[x];
        if(visited[node]==0) {
            DFS(data, node);
        }
        else {
            if(finished[node]==0) {
                for(int i = node; i != x; i = data[i]) {
                    cycle++;
                }
                cycle++;
            }
        }
        finished[x] = 1;
    }

    public static void main(String[] args) {
        int T;
        Scanner sc = new Scanner(System.in);
        T = Integer.parseInt(sc.nextLine());
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < T; i++) {
            int N;
            cycle = 0;
            int[] Data;
            String input;
            String[] split;
            N = Integer.parseInt(sc.nextLine());
            Data = new int[N+1];
            visited = new int[N+1];
            finished = new int[N+1];
            input = sc.nextLine();
            split = input.split(" ");
            for(int j =1; j <= N; j++) {
                Data[j] = Integer.parseInt(split[j-1]);
            }

            for(int k = 1; k <= N; k++){
                if(visited[k]==0)
                    DFS(Data, k);
            }
            result.add(N - cycle);

        }
        for(int i : result)
            System.out.println(i);
    }
}
