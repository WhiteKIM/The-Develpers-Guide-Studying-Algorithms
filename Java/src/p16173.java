import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class p16173 {
    public static int[][] map;
    public static int[][] visited;
    public static int N;

    public static boolean BFS(int[][] map) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        queue.add(0);
        visited[0][0] = 1;
        while(!queue.isEmpty()) {
            int x = queue.poll();
            int y = queue.poll();

            if(x == N-1 && y == N-1) {
                return true;
            }

            for(int i = 0; i < 2; i++) {
                int nx = 0;
                int ny = 0;

                if(i==0) {
                    nx  = x + (1*map[x][y]);
                    ny = y;
                }
                if(i==1){
                    nx = x;
                    ny = y + (1*map[x][y]);
                }

                if(0<= nx && nx < N && 0<=ny && ny < N) {
                    if(visited[nx][ny]==0) {
                        queue.add(nx);
                        queue.add(ny);
                        visited[nx][ny] = 1;
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.nextLine());
        map = new int[N][N];
        visited = new int[N][N];

        for(int i = 0; i < N; i++) {
            String input = sc.nextLine();
            String[] temp = input.split(" ");
            for(int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(temp[j]);
            }
        }
        if(BFS(map))
            System.out.println("HaruHaru");
        else
            System.out.println("Hing");
    }
}
