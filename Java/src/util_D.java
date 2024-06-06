import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class util_D {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        int[][] data = new int[N][N];
        for(int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            for(int j = 0; j < N; j++) {
                data[i][j] = Integer.parseInt(input[j]);
            }
        }

        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
            String[] input = br.readLine().split(" ");
            if(Integer.parseInt(input[0])==1) {
                moveElement(data, Integer.parseInt(input[1]));
            } else {
                rotateArray(data, N);
            }
        }

        for(int[] x : data) {
            for (int y : x) {
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }

    private static void rotateArray(int[][] data, int N) {
        int[][] newData = new int[N][N];
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                newData[i][j] = data[j][(N-i+1)%N];
            }
        }

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                data[i][j] = newData[i][j];
            }
        }
    }

    private static void moveElement(int[][] data, int index) {
        int replace = data[index][data.length-1];
        for(int i = data.length-1; i > 0; i--) {
            data[index][i] = data[index][i-1];
        }
        data[index][0] = replace;
    }
}
