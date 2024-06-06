import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class p1920 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int N;
        N = Integer.parseInt(br.readLine());
//        List<Integer> data = new ArrayList<>();
        int[] data = new int[N];
        String[] input = br.readLine().split(" ");
        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(input[i]);
            data[i] = num;
//            data.add(num);
        }


        int M;
        M = Integer.parseInt(br.readLine());
        List<Integer> find = new ArrayList<>();
        input = br.readLine().split(" ");
        for(int i = 0; i < M; i++) {
            find.add(Integer.parseInt(input[i]));
        }

//        Collections.sort(data);

        Arrays.sort(data);
        for(int x : find) {
            if(solved(x, data))
                sb.append(1).append("\n");
            else
                sb.append(0).append("\n");
        }

        System.out.println(sb.toString());
    }

    private static boolean solved(int x, int[] data) {
        int left = 0;
        int right = data.length-1;

        while(left <= right) {
            int mid = (left+right) /2;
            if(x == data[mid]) {
                return true;
            } else if(x < data[mid]) {
                right = mid-1;
            } else if(x > data[mid]) {
                left = mid+1;
            }
        }
        return false;
    }
}
