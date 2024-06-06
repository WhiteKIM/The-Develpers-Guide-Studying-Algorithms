import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class p9017 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int T;
        T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < T; i++) {
            int[] data;
            int N = Integer.parseInt(br.readLine());
            data = new int[N];
            ArrayList<Integer> []  point = new ArrayList[N];

            String[] input = br.readLine().split(" ");
            for(int j = 0; j < input.length; j++) {
                int num = Integer.parseInt(input[j]);
                data[num]+= 1;
            }

            for(int j = 0; j < N; j++) {
                point[j] = new ArrayList<>();
            }

            int score = 1;
            for(int j = 0; j < N; j++) {
                int num = Integer.parseInt(input[j]);
                if(data[num] >= 6) {
                    point[num].add(score++);
                }
            }

            int min = 99999999;
            int rank = 0;
            for(int j = 1; j < N; j++) {
                if(data[j] >= 6) {
                    int sum = 0;
                    for(int k = 0; k < 4; k++) {
                        sum += point[j].get(k);
                    }
                    if(min > sum) {
                        min = sum;
                        rank = j;
                    } else if(min == sum) {
                        if(point[rank].get(4) > point[j].get(4)) {
                            rank = j;
                        }
                    }
                }
            }

            sb.append(rank).append("\n");
        }
        System.out.println(sb.toString());
    }
}
