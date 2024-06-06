import java.util.*;

public class p1715 {
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        PriorityQueue<Integer> data = new PriorityQueue<>();
        for(int i = 0; i < N; i++) {
            data.add(sc.nextInt());
        }

        data.stream().sorted(Comparator.naturalOrder());
        int sum = 0;
        while (data.size() > 1 ){
            int left = data.poll();
            int right = data.poll();

            sum += left + right;
            data.add(left + right);
        }

        System.out.println(sum);
    }
}
