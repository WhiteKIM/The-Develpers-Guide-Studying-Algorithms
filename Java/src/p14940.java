import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class p14940 {
    private static int[] dx = {-1, 1, 0, 0};//x축 이동
    private static int[] dy = {0,0,-1,1};//y축 이동
    public static int[][] visited;//방문한 점 기록
    public static int[][] result;//결과값 저장
    public static int N, M;
    public static void BFS(int[][] map, int x, int y) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(x);
        queue.add(y);
        visited[x][y] = 1;

        while(!queue.isEmpty()) {
            int x1 = queue.poll();
            int y1 = queue.poll();

            for(int i = 0; i < 4; i++) {
                int nx = x1+dx[i];
                int ny = y1+dy[i];

                if(0 <= nx && nx < N && 0 <= ny && ny < M) {
                    if(map[nx][ny]==1 && visited[nx][ny]==0) {
                        result[nx][ny] = result[x1][y1]+1;//result에는 이전 값+1을 기록
                        visited[nx][ny] = 1;
                        queue.add(nx);
                        queue.add(ny);
                    }
                }
            }
        }
        // 만약 이동할 수 있는 땅이지만 이어진 길이 없어서
        // 이동할 수 없는 경우에는 -1을 저장
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                if(map[i][j]==1 && result[i][j]==0) {
                    result[i][j] = -1;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[][] map;
        Scanner sc =new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        sc.nextLine();
        boolean check = true;
        map = new int[N][M];
        visited = new int[N][M];
        result = new int[N][M];
        for(int i = 0; i < N; i++) {
            String input = sc.nextLine();
            String[] temp = input.split(" ");
            for(int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(temp[j]);
            }
        }

        for(int i = 0; i < N; i++) {
            if(check == false)//목표지점은 단 하나이므로, 그 뒤엔 반복문을 종료시킴
                break;
            for(int j =0; j < M; j++) {
                if(map[i][j]==2) {
                    BFS(map, i, j);
                    check = false;
                    break;
                }
            }
        }

        for(int i = 0; i < N; i++) {
            for(int j =0; j < M; j++) {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}
