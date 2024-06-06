import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class p19637 {
    public static String[] medal;
    public static int[] medal_baseline;
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static int whatisyourMedal(int[] baseLine, int num) {
        int start = 0;
        int end = baseLine.length - 1;

        while(start <= end) {
            int mid = (start + end) / 2;

            if(baseLine[mid] < num) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return end+1;
    }

    public static void main(String[] args) throws IOException {
        int N, M;
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);

        medal = new String[N];
        medal_baseline = new int[N];
        for(int i = 0; i < N; i++) {
            input = br.readLine().split(" ");
            medal[i] = input[0];
            medal_baseline[i] = Integer.parseInt(input[1]);
        }
        for(int i = 0; i < M; i++) {
            int num = Integer.parseInt(br.readLine());
            int index = whatisyourMedal(medal_baseline, num);
            sb.append(medal[index]).append("\n");
        }
        System.out.println(sb.toString());
    }
}
