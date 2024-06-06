import java.util.Scanner;

public class p1189 {

    public static boolean[][] visited;
    public static int[][] resultMap;
    public static int[] nx = {-1, 1, 0, 0};
    public static int[] ny = {0, 0, -1, 1};
    public static int K;
    public static int N;
    public static int M;
    public static int result = 0;
    public static void dfs(int x, int y, int count, char[][] map) {

        if(count == K) {
            if (x == 0 && y == M - 1) {
                result+=1;
            }
        }

        for(int i = 0; i < 4; i++) {
            int dx = x + nx[i];
            int dy = y + ny[i];

            if(0<= dx && dx < N && 0 <= dy && dy < M && !visited[dx][dy]) {
                if(map[dx][dy]=='.') {
                    visited[dx][dy] = true;
                    dfs(dx, dy, count+1, map);
                    visited[dx][dy] = false;
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        K = Integer.parseInt(input[2]);
        char[][] map = new char[N][M];
        resultMap = new int[N][M];
        for(int i = 0; i < N; i++) {
            map[i] = sc.nextLine().toCharArray();
        }
        visited = new boolean[N][M];
        visited[N-1][0] = true;
        dfs(N-1, 0, 1, map);
        System.out.println(result);
    }
}
