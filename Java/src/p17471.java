import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 조합 + 완전 탐색
 * 조합을 이용하여 가능한 모든 조합을 가져오고, 각 경우마다 가능한 연결인지 확인
 */

public class p17471 {
    public static int[] area;
    public static int[] people;
    public static int[][] graph;

    public static int result = Integer.MAX_VALUE;
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void divide(int index, int N) {
        if(index == N) {
            if(check(graph, area, N)) {
                int sumA = 0;
                int sumB = 0;
                for(int i = 0; i < N; i++) {
                    if(area[i] == 1) {
                        sumA += people[i];
                    } else {
                        sumB += people[i];
                    }
                }
                result = Math.min(result, Math.abs(sumA - sumB));
            }
            return;
        }
        area[index] = 1;
        divide(index+1, N);

        area[index] = 2;
        divide(index+1, N);
    }

    public static boolean check(int[][] data, int[] area ,int N) {
        boolean[] visited = new boolean[N];
        Queue<Integer> queue = new LinkedList<>();

        int areaX = -1;
        int areaY = -1;

        for(int i = 0; i < area.length; i++) {
            if(area[i] == 1) {
                areaX = i;
                break;
            }
        }

        for(int i = 0; i < area.length; i++) {
            if(area[i] == 2) {
                areaY = i;
                break;
            }
        }

        if(areaX == -1 || areaY == -1)
            return false;

        visited[areaX] = true;
        queue.add(areaX);

        // A지역 확인
        while (!queue.isEmpty()) {
            int x = queue.poll();

            for(int i = 0; i < data[x].length; i++) {
                if(data[x][i] == 1) {
                    if(!visited[i] && area[i] == 1)  {
                        visited[i] = true;
                        queue.add(i);
                    }
                }
            }
        }

        // B지역 확인
        queue.add(areaY);
        visited[areaY] = true;

        while (!queue.isEmpty()) {
            int x = queue.poll();

            for(int i = 0; i < data[x].length; i++) {
                if(data[x][i] == 1) {
                    if(!visited[i] && area[i] == 2) {
                        visited[i] = true;
                        queue.add(i);
                    }
                }
            }
        }
        // 모든 지역이 포함되어야 한다.
        for(boolean check : visited) {
            if(!check)
                return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        int N;
        N = Integer.parseInt(br.readLine());
        people = new int[N];
        graph = new int[N][N];
        area = new int[N];
        String[] input = br.readLine().split(" ");

        for(int i = 0; i < input.length; i++) {
            people[i] = Integer.parseInt(input[i]);
        }

        for(int i = 0; i < N; i++) {
            input = br.readLine().split(" ");
            for(int j = 1; j < input.length; j++) {
                int x = Integer.parseInt(input[j]);
                graph[i][x-1] = 1;
                graph[x-1][i] = 1;
            }
        }
        divide(0, N);
        if(result == Integer.MAX_VALUE)
            System.out.println(-1);
        else
            System.out.println(result);
    }
}
