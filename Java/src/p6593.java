import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class p6593 {
    public static int[] dz = {1,-1, 0 ,0, 0, 0};
    public static int[] dx = {0,0, -1, 1, 0, 0};
    public static int[] dy = {0,0,0,0,-1, 1};
    public static int count = 0;
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static boolean solved(int L, int R, int C, int x, int y, int z, char[][][] map) {
        Queue<int[]> queue = new LinkedList<>();
        boolean[][][] visited = new boolean[L][R][C];
        int[] num = {x, y, z, count};
        visited[z][x][y] = true;
        queue.add(num);

        while (!queue.isEmpty()) {
            int[] num1 = queue.poll();
            int x1 = num1[0];
            int y1 = num1[1];
            int z1 = num1[2];
            int count1 = num1[3];

            if(map[z1][x1][y1] == 'E') {
                count = count1;
                return true;
            }

            for(int i = 0; i < 6; i++) {
                int nx = x1 + dx[i];
                int ny = y1 + dy[i];
                int nz = z1 + dz[i];

                if(0<= nx && nx < R && 0 <= ny && ny < C && 0 <= nz && nz < L) {
                    if(!visited[nz][nx][ny] && map[nz][nx][ny]=='.') {
                        visited[nz][nx][ny] = true;
                        int[] num2 = {nx, ny, nz, count1+1};
                        queue.add(num2);
                    } else if(!visited[nz][nx][ny] && map[nz][nx][ny]=='E') {
                        visited[nz][nx][ny] = true;
                        int[] num2 = {nx, ny, nz, count1+1};
                        queue.add(num2);
                    }
                }
            }
        }

        return false;
    }

    public static void main(String[] args) throws IOException {
        while (true) {
            int L, R, C;
            String[] input = br.readLine().split(" ");
            L = Integer.parseInt(input[0]);
            R = Integer.parseInt(input[1]);
            C = Integer.parseInt(input[2]);

            if(L == 0 || R == 0 || C == 0) {
                break;
            }

            char[][][] data = new char[L][R][C];
            for(int i = 0; i < L; i++) {
                for(int j = 0; j < R; j++) {
                    data[i][j] = br.readLine().toCharArray();
                }
                br.readLine();//빈 줄 입력됨
            }
            boolean check = false;
            boolean run = false;
            count = 0;
            for(int i = 0; i < L; i++) {
                for(int j = 0; j < R; j++) {
                    for(int k = 0; k < C; k++) {
                        if(data[i][j][k]=='S') {
                            check = solved(L, R, C, j, k, i, data);
                            run = true;
                        }
                    }
                    if(run)
                        break;
                }
                if(run)
                    break;
            }

            if(check) {
                System.out.println("Escaped in "+count+" minute(s).");
            } else {
                System.out.println("Trapped!");
            }

        }
    }
}


// 데이터 출력 테스트
//            for(char[][] m1 : data) {
//                for (char[] m2 : m1) {
//                    for(char m3 : m2) {
//                        System.out.print(m3+" ");
//                    }
//                    System.out.println();
//                }
//                System.out.println("==================");
//            }