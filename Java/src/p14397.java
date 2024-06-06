import java.util.Scanner;

public class p14397 {
    // 홀수용
    private static int[] dx1 = {-1, -1, 0, 0, 1, 1};
    private static int[] dy1 = {0, 1, -1, 1, 0, 1};
    //짝수용
    private static int[] dx2 = {-1, -1, 0, 0, 1, 1};
    private static int[] dy2 = {-1, 0, -1, 1, -1, 0};

    public static int N, M;

    public static int findWater(char[][] map, int x, int y) {
        int count = 0;
        if(x%2==0) {
            for(int i = 0; i < 6; i++) {
                int nx = x+dx2[i];
                int ny = y+dy2[i];

                if(0<= nx && nx < N && 0 <= ny && ny < M) {
                    if(map[nx][ny]=='.') {
                        count++;
                    }
                }
            }
        } else {
            for(int i = 0; i < 6; i++) {
                int nx = x+dx1[i];
                int ny = y+dy1[i];

                if(0<= nx && nx < N && 0 <= ny && ny < M) {
                    if(map[nx][ny]=='.') {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        sc.nextLine();//개행문자 버림
        char[][] map = new char[N][M];
        int sum = 0;
        for(int i = 0; i < N; i++) {
            char[] input = sc.nextLine().toCharArray();
            for(int j = 0; j < M; j++) {
                map[i][j] = input[j];
            }
        }

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                if(map[i][j]=='#') {
                    sum += findWater(map, i, j);
                }
            }
        }
        System.out.println(sum);
    }
}
