import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class p1927 {
    public static void main(String[] args) {
        int T;
        Scanner sc = new Scanner(System.in);

        T = Integer.parseInt(sc.nextLine());
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0; i < T; i++) {
            int num = Integer.parseInt(sc.nextLine());
            if(heap.isEmpty() && num == 0) {
                result.add(0);
            } else if(num == 0) {
              result.add(heap.poll());
            } else {
                heap.add(num);
            }
        }

        for(Integer i : result) {
            System.out.println(i);
        }
    }
}
