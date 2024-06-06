import java.util.ArrayList;
import java.util.Scanner;

public class p20922 {
    private static ArrayList<Integer> result = new ArrayList<>();
    private static int index = 0;
    private static int maxnum = 0;
    private static int max = 0;
    public static int[] visited;

    public static void overlap(int[] data, int N, int K) {
        visited = new int[maxnum+1];
        int left = 0;
        int right = 0;

        while(left<=right) {
            if(right < N && visited[data[right]] < K) {
                visited[data[right]] = visited[data[right]] + 1;
                right++;
            } else if(visited[data[right]] == K) {
                visited[data[left]]--;
                left++;
            }
            max = Math.max(max, right - left);
            if(right == N)
                return;
        }
    }

    public static void main(String[] args) {
        int N, K;
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        N = Integer.parseInt(input[0]);
        K = Integer.parseInt(input[1]);
        int[] data = new int[N];
        input = sc.nextLine().split(" ");
        maxnum = 0;
        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(input[i]);
            data[i] = num;
            maxnum = Math.max(maxnum, num);
        }
        overlap(data, N, K);
        System.out.println(max);
    }
}
