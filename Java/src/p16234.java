import java.lang.reflect.Array;
import java.util.*;

public class p16234 {
    private static int[] dx = {1,-1,0,0};
    private static int[] dy = {0,0,1,-1};
    public static int[][] visited;

    //주위에 인구이동이 일어날 수 있는 점들이 있는지?
    public static boolean isPossible(int[][] Map ,int x, int y,int N ,int L, int R) {
        for(int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(0 <= nx && nx < N && 0 <= ny && ny < N) {
                if((L <= Math.abs(Map[x][y]-Map[nx][ny])) && (Math.abs(Map[x][y]-Map[nx][ny]) <= R)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void peopleMove(int[][] Map,int x, int y, int N, int L, int R) {
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> queue1 = new LinkedList<>();//인구이동이 일어난 점들을 저장
        queue.add(x);//x
        queue.add(y);//y

        queue1.add(x);//x
        queue1.add(y);//y
        visited[x][y] = 1;
        int sum = 0;
        int count = 0;

        while (!queue.isEmpty()) {
            x = queue.poll();
            y = queue.poll();

            count = count + 1;
            sum = sum + Map[x][y];
            for(int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(0 <= nx && nx < N && 0 <= ny && ny < N && visited[nx][ny]==0) {
                    if((L <= Math.abs(Map[x][y]-Map[nx][ny])) && (Math.abs(Map[x][y]-Map[nx][ny]) <= R)) {
                        queue.add(nx);
                        queue.add(ny);
                        visited[nx][ny] = 1;
                        queue1.add(nx);//x
                        queue1.add(ny);//y
                    }
                }
            }
        }
        //평균값으로 인구이동시키기
        int ave = sum/count;//평균값
        while(!queue1.isEmpty()) {
            int x1, y1;
            x1 = queue1.poll();
            y1 = queue1.poll();

            Map[x1][y1] = ave;
        }
    }

    public static void main(String[] args) {
        int N, L, R;
        String rmnewLine;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        L = sc.nextInt();
        R = sc.nextInt();
        rmnewLine = sc.nextLine();//개행문자 제거
        int[][] Map = new int[N][N];
        visited = new int[N][N];
        int count = 0;

        for(int i = 0; i < N; i++) {
            String input = sc.nextLine();
            String[] data = input.split(" ");
            for(int j = 0; j < N; j++) {
                Map[i][j] = Integer.parseInt(data[j]);
            }
        }
        boolean check = true;
        while (check) {
            check = false;

            for(int i = 0; i < N; i++) {
                for(int j = 0; j < N; j++) {
                    if(visited[i][j] == 0 && isPossible(Map, i, j, N, L, R)) {
                        peopleMove(Map, i, j, N, L, R);
                        check = true;
                    }
                }
            }
            if(check)
                count++;//함수를 몇번 반복했는지?

            //이동이 일어난 후에도 다시 인구 이동이 일어날 수 있다.
            for(int i = 0; i < N; i++) {
                Arrays.fill(visited[i], 0);
            }
        }
        System.out.println(count);
    }
}
