import java.util.Scanner;

public class p1388 {
    public static int[] move = {-1, 1};
    private static int[][] visited;
    public static int N, M;
    public static boolean DFS(char[][] map, int x, int y) {
        if(visited[x][y]== 1)
            return false;

        if(map[x][y]=='-') {
            visited[x][y] = 1;
            for(int i = 0; i < 2; i++) {
                int ny = y + move[i];
                if(0<= ny && ny < M) {
                    if(visited[x][ny] == 0 && map[x][ny]=='-') {
                        DFS(map, x, ny);
                    }
                }
            }
        }


        if(map[x][y]=='|') {
            visited[x][y] = 1;
            for(int i = 0; i < 2; i++) {
                int nx = x + move[i];
                if(0<= nx && nx < N ) {
                    if(visited[nx][y] == 0 && map[nx][y]=='|') {
                        DFS(map, nx, y);
                    }
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String rm;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        rm = sc.nextLine();
        char[][] map = new char[N][M];
        visited = new int[N][M];
        int count = 0;
        for(int i = 0; i < N; i++) {
            char[] input = sc.nextLine().toCharArray();
            for(int j = 0; j < M; j++) {
                map[i][j] = input[j];
            }
        }

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                if(DFS(map, i, j))
                    count++;
            }
        }

        System.out.println(count);
    }
}
