import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p3085 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static int length = 0;//최대 길이
    public static char[][] data;
    public static char[][] copy;
    public static int N;
    public static int max = 1;

    public static int calcLength(char[][] data) {
        int result = 1;
        //가로 길이 구하기
        for(int i = 0; i < N; i++) {
            int count = 1;
            for(int j = 1; j < N; j++) {
                if(data[i][j] == data[i][j-1]) {
                    count++;
                } else {
                    count = 1;
                }
                result = Math.max(result, count);
            }
        }

        // 세로 길이 구하기
        for(int i = 0; i < N; i++) {
            int count = 1;
            for(int j = 1; j < N; j++) {
                if(data[j][i] == data[j-1][i]) {
                    count++;
                } else {
                    count = 1;
                }
                result = Math.max(result, count);
            }
        }
        return result;
    }

    public static void setCopy() {
        for(int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                copy[i][j] = data[i][j];
            }
        }
    }

    public static void print(char[][] data) {
        for(char[] x : data) {
            for (char y : x) {
                System.out.print(y);
            }
            System.out.println();
        }
    }

    public static void Bomboni(char[][] data) {
        setCopy();
        // 가로 인접 부분을 교환한다.
        for(int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(j+1 < N) {
                    char temp = copy[i][j];
                    copy[i][j] = copy[i][j+1];
                    copy[i][j+1] = temp;

                    length = Math.max(calcLength(copy), length);//교환하고 길이를 계산해본다.

                    temp = copy[i][j];
                    copy[i][j] = copy[i][j+1];
                    copy[i][j+1] = temp;
                }
            }
        }

        // 세로 인접 부분을 교환한다.
        for(int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(j+1 < N) {
                    char temp = copy[j][i];
                    copy[j][i] = copy[j+1][i];
                    copy[j+1][i] = temp;

                    length = Math.max(calcLength(copy), length);//교환하고 길이를 계산해본다.

                    temp = copy[j][i];
                    copy[j][i] = copy[j+1][i];
                    copy[j+1][i] = temp;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        data = new char[N][N];
        copy = new char[N][N];
        for(int i = 0; i < N; i++) {
            data[i] = br.readLine().toCharArray();
        }
        Bomboni(data);
        System.out.println(length);
    }
}
