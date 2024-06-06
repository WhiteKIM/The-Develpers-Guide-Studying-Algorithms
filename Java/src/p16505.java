import java.util.Scanner;

public class p16505 {
    public static char result[][];
    public static void star(int N, int x, int y) {
        if(N==0) {
            result[x][y] = '*';
            return;
        }
        star(N-1, x, y);
        star(N-1, x+(int)Math.pow(2, N-1), y);
        star(N-1, x, y+(int)Math.pow(2, N-1));
    }
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();

        result = new char[(int)Math.pow(2,N)][(int)Math.pow(2,N)];

        for(int x = 0; x < (int)Math.pow(2,N); x++)
            for(int y = 0; y < (int)Math.pow(2,N); y++)
                result[x][y] = ' ';

        star(N, 0, 0);

        StringBuilder sb = new StringBuilder();

        for(int x = 0; x < (int)Math.pow(2,N); x++) {
            for (int y = 0; y < (int)Math.pow(2,N) - x; y++) {// 출력되는 문자열을 보면 0번째줄은 4개 1번째는 3개씩 줄어드는 것이 보이므로
                sb.append(result[x][y]);
            }
            sb.append("\n");
        }
        System.out.println(sb.toString().substring(0, sb.length()-1));
    }
}
