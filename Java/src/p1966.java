import java.util.*;

public class p1966 {
    public static void main(String[] args) {
        int T;
        Scanner sc = new Scanner(System.in);
        T = Integer.parseInt(sc.nextLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < T; i++) {
            String[] input = sc.nextLine().split(" ");
            String[] priority = sc.nextLine().split(" ");

            int page = Integer.parseInt(input[0]);
            int index = Integer.parseInt(input[1]);
            Queue<Node> queue = new LinkedList<>();
            for(int j = 0; j < priority.length; j++) {
                queue.add(new Node(Integer.parseInt(priority[j]), j));
            }

            int count = 1;

            while (!queue.isEmpty()) {
                Node max = Collections.max(queue);
                Node n = queue.poll();

                if(max == n) {
                    if(n.index == index) {
                        sb.append(count).append("\n");
                        break;
                    }
                    count+=1;
                } else {
                    queue.add(n);
                }
            }
        }

        System.out.println(sb.toString());
    }

    public static class Node implements Comparable<Node> {
        int value;
        int index;

        public Node(int value, int node) {
            this.value = value;
            this.index = node;
        }

        @Override
        public int compareTo(Node o) {
            if(this.value > o.value) {
                return 1;
            } else if (this.value < o.value) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}
