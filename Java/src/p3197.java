import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class p3197 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static int[] dx = {-1, 1, 0, 0};
    private static int[] dy = {0, 0, -1, 1};
    public static char[][] map;
    public static int N;
    public static int M;

    public static Queue<int[]> meltQueue = new LinkedList<>();//얼음을 녹일 수 있는 좌표
    public static Queue<int[]> swanQueue = new LinkedList<>();
    public static int[][] swan = new int[2][2];

    // 테스트
    public static void printMap() {
        for(char[] x : map) {
            for(char y : x) {
                System.out.print(y);
            }
            System.out.println();
        }
    }

    // 얼음을 녹이자~
    public static void melting() {
        int size = meltQueue.size();// for문에 넣지 마세요
       for(int i = 0; i < size; i++) {
            int[] temp = meltQueue.poll();
            int x = temp[0];
            int y = temp[1];
            for(int j = 0; j < 4; j++) {
                int nx = x + dx[j];
                int ny = y + dy[j];
                if(0 <= nx && nx < N && 0 <= ny && ny < M) {
                    if(map[nx][ny]=='X') {
                        map[nx][ny] = '.';
                        int[] temp1 = {nx, ny};
                        meltQueue.add(temp1);
                    }
                }
            }
        }
    }
    // 날짜를 하루씩 바꿔가면서 어떤 날짜에 만날 수 있는지 판별해보자
    public static boolean isMeeting(Queue<int[]> queue) {
        boolean[][] visited = new boolean[N][M];

        while(!swanQueue.isEmpty()) {
            int[] pop = swanQueue.poll();
            int x = pop[0];
            int y = pop[1];
            if(x==swan[1][0] && y==swan[1][1])
                return true;

            for(int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(0 <= nx && nx < N && 0 <= ny && ny < M && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    if(map[nx][ny]!='X') {//이번턴에 지나갈 수 있다.
                        int[] temp = {nx, ny};
                        swanQueue.add(temp);
                    }
                    if (map[nx][ny]=='X') {//이번턴에는 못 지나간다.
                        int[] temp = {nx, ny};
                        queue.add(temp);
                    }
                }
            }
        }
        swanQueue = queue;
        return false;
    }

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new char[N][M];
        boolean[][] visited = new boolean[N][M];

        for(int i = 0; i < N; i++) {
            map[i] = br.readLine().toCharArray();
        }

        int index = 0;

        for(int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if(map[i][j]=='L') {
                    swan[index++] = new int[]{i, j};
                }
                if(map[i][j]!='X') {
                    meltQueue.add(new int[]{i, j});
                }
            }
        }

        swanQueue.add(new int[]{swan[0][0], swan[0][1]});
        int day = 0;

//        while (true) {
//            Queue<int[]> queue = new LinkedList<>();
//            if(isMeeting(queue))
//                break;
//            melting();
//            day+=1;
//        }
        boolean check = false;
        while (true) {
            Queue<int[]> queue = new LinkedList<>();
            System.out.println("call 1");
            while(!swanQueue.isEmpty()) {
                int[] pop = swanQueue.poll();
                int x = pop[0];
                int y = pop[1];
                if(x==swan[1][0] && y==swan[1][1])
                    check = true;

                for(int i = 0; i < 4; i++) {
                    int nx = x + dx[i];
                    int ny = y + dy[i];

                    if(0 <= nx && nx < N && 0 <= ny && ny < M && !visited[nx][ny]) {
                        visited[nx][ny] = true;
                        if(map[nx][ny]!='X') {//이번턴에 지나갈 수 있다.
                            int[] temp = {nx, ny};
                            swanQueue.add(temp);
                        }
                        if (map[nx][ny]=='X') {//이번턴에는 못 지나간다.
                            int[] temp = {nx, ny};
                            queue.add(temp);
                        }
                    }
                }
            }
            if(check) {
                break;
            }
            swanQueue = queue;
            int size = meltQueue.size();// for문에 넣지 마세요
            System.out.println("call 2");
            for(int i = 0; i < size; i++) {
                System.out.println();
                int[] temp = meltQueue.poll();
                int x = temp[0];
                int y = temp[1];
                for(int j = 0; j < 4; j++) {
                    int nx = x + dx[j];
                    int ny = y + dy[j];
                    if(0 <= nx && nx < N && 0 <= ny && ny < M) {
                        if(map[nx][ny]=='X') {
                            map[nx][ny] = '.';
                            int[] temp1 = {nx, ny};
                            meltQueue.add(temp1);
                        }
                    }
                }
            }
            day+=1;
        }

        System.out.println(day);
    }
}
