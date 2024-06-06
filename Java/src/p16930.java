import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class p16930 {
    public static int move;
    public static int sx;
    public static int sy;
    public static int dx;
    public static int dy;
    public static int N, M;

    public static int[] move_x = {-1, 1, 0, 0};
    private static int[] move_y = {0, 0, -1, 1};
    public static int[][] result;

    public static void BFS(char[][] map) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(sx-1);
        queue.add(sy-1);

        while(!queue.isEmpty()) {
            int x, y;
            x = queue.poll();
            y = queue.poll();

            // 한번에 움직일 수 있는 조건을 고려해야 한다.
            // 벽 뚫기를 어떻게 막을까
            // move와 move_x,y를 도는 반복문 위치를 바꿔볼까?
            // i를 왜 1부터 시작하고 있었을까?
            // 내 시간
            for(int i = 0; i < 4; i++) {
                for(int j = 1; j <= move; j++) {
                    int nx = x + (move_x[i]*j);
                    int ny = y + (move_y[i]*j);

                    if(0<=nx && nx < N && 0 <= ny && ny < M && map[nx][ny]=='.') {
                        if(result[nx][ny] == 0) {
                            result[nx][ny] = result[x][y] + 1;
                            queue.add(nx);
                            queue.add(ny);
                        }
                        else if(result[nx][ny] == result[x][y]+1){
                            continue;
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        char[][] map;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        move = sc.nextInt();
        sc.nextLine();
        map = new char[N][M];
        result = new int[N][M];

        for(int i = 0; i < N; i++) {
            char[] input = sc.nextLine().toCharArray();
            for(int j = 0; j < M; j++) {
                map[i][j] = input[j];
            }
        }
        sx = sc.nextInt();
        sy = sc.nextInt();
        dx = sc.nextInt();
        dy = sc.nextInt();

        BFS(map);

        if(result[dx-1][dy-1]!=0)
            System.out.println(result[dx-1][dy-1]);
        else
            System.out.println(-1);
    }
}
