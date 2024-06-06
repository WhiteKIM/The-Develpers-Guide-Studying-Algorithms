import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class p16928 {
    private static int[] visited = new int[101];
    private static int INF = 99999999;
    public static int count = 0;
    public static void solved(int[] map) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);//start지점
        queue.add(0);//count
        visited[1] = 1;

        while (!queue.isEmpty()) {
            int x = queue.poll();
            int count1 = queue.poll();

            for(int i = 1; i <= 6; i++) {
                int nx = x + i;
                if(nx > 100) {
                    break;
                }
                if(nx==100) {
                    count = count1;
                    return;
                }
                if(nx < 100) {
                    if(map[nx]!=0) {
                        nx = map[nx];
                    }
                    if(visited[nx]==0){
                        queue.add(nx);
                        queue.add(count1+1);
                        visited[nx] = 1;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int N, M;
        int x, y;
        int[] data = new int[101];
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] input1 = input.split(" ");
        N = Integer.parseInt(input1[0]);
        M = Integer.parseInt(input1[1]);

        for(int i = 0; i < N+M; i++) {
            input = sc.nextLine();
            input1 = input.split(" ");
            x = Integer.parseInt(input1[0]);
            y = Integer.parseInt(input1[1]);
            data[x] = y;
        }

        solved(data);
        System.out.println(count+1);
    }
}
