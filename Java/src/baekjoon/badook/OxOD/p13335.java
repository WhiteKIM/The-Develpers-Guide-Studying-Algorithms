package baekjoon.badook.OxOD;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

public class p13335 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int N, W, L;
        N = Integer.parseInt(input[0]);
        W = Integer.parseInt(input[1]);
        L = Integer.parseInt(input[2]);

        input = sc.nextLine().split(" ");
        int index = 0;
        int time = 0;
        int weight = 0;
        LinkedList<int[]> queue = new LinkedList<>();
        LinkedList<Integer> truck = new LinkedList<>();

        for(String str : input)
            truck.add(Integer.parseInt(str));

        while (true) {
            time++;
            if(!queue.isEmpty()) {
                while (time - queue.peekFirst()[1] == W) {//다리를 빠져나갔는지 판별
                    int[] arr = queue.pollFirst();
                    weight -= arr[0];
                    if(queue.isEmpty())
                        break;
                }
            }

            if(!truck.isEmpty()) {//트럭이 다리에 올라갈 수 있는지 판별
                int truck_weight = truck.peekFirst();
                if(weight + truck_weight <= L && queue.size() < W) {
                    queue.add(new int[]{truck.pollFirst(), time});
                    weight += truck_weight;
                }
            }

            if(queue.isEmpty()) {
                break;
            }
        }

        System.out.println(time);
    }
}
