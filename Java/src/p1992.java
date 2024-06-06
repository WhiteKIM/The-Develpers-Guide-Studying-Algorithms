import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1992 {
    public static int N;
    public static int[][] map;
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringBuilder sb = new StringBuilder();

    public static boolean check(int x, int y, int N) {
        int standard = map[x][y];

        for(int i = x; i < x+N; i++) {
            for (int j = y; j < y+N; j++) {
                if(standard != map[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void solved(int x, int y, int N) {
        if(check(x, y, N)) {//압축 가능여부
            sb.append(map[x][y]);
            return;
        }

        sb.append("(");
        // 4분할
        solved(x, y, N/2);//상단 좌측
        solved(x, y+N/2, N/2);//상단 우측
        solved(x+N/2, y, N/2);//하단 좌측
        solved(x+N/2, y+N/2, N/2);//하단 우측
        sb.append(")");
    }

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        for (int i = 0; i < N; i++) {
            char[] input = br.readLine().toCharArray();
            for(int j = 0; j < N; j++) {
                map[i][j] = Character.getNumericValue(input[j]);
            }
        }

        solved(0,0,N);
        System.out.println(sb.toString());
    }
}
