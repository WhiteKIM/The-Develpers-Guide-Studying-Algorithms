import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.concurrent.atomic.DoubleAccumulator;

public class p14427 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int N;
        N = Integer.parseInt(br.readLine());
        SegmentTree tree = new SegmentTree(N);
        String[] input = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        int[] data =  new int[N+1];
        for(int i = 1; i <= N; i++) {
            data[i] = Integer.parseInt(input[i-1]);
        }
        tree.init(1, 1, N, data);
        int M;
        M = Integer.parseInt(br.readLine());
        for(int i = 0; i < M; i++) {
            input = br.readLine().split(" ");
            int op = Integer.parseInt(input[0]);
            switch (op) {
                case 1 :
                    data[Integer.parseInt(input[1])] = Integer.parseInt(input[2]);
                    tree.update(1, 1,N , Integer.parseInt(input[1]), data);
                    break;
                case 2 : sb.append(tree.getMin()).append("\n");
                    break;
                default:
            }
        }
        System.out.println(sb.toString());
    }
    public static class SegmentTree {
        private int[] data;

        SegmentTree(int N) {
            data = new int[4*N];
        }

        int init(int node, int start, int end, int[] arr) {
            if(start == end)
                return data[node] = start;

            int mid = (start + end) / 2;
            int left = init(node*2, start, mid, arr);
            int right = init(node*2+1,mid+1, end, arr);
            return data[node] = minIndex(left, right, arr);

        }

        int minIndex(int x, int y, int[] arr) {
            if(arr[x] == arr[y])
                return Math.min(x, y);
            else if(arr[x] < arr[y])
                return x;
            else
                return y;
        }

        int update(int node, int start, int end, int index, int[] arr) {
            if(index < start || end < index) {
                return data[node];
            }

            if(start == end)
                return data[node] = index;

            int mid = (start+end) /2;
            int left = update(node*2, start, mid, index, arr);
            int right = update(node*2+1, mid+1, end, index, arr);

            return data[node] = minIndex(left, right, arr);
        }

        int getMin() {
            return data[1];
        }
    }
}
