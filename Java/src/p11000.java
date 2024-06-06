import java.util.*;

public class p11000 {
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.nextLine());
        PriorityQueue<Long> room = new PriorityQueue<>();
        Node[] nodes = new Node[N];

        for(int i = 0; i < N; i++) {
            String[] input = sc.nextLine().split(" ");
            long A = Long.parseLong(input[0]);
            long B = Long.parseLong(input[1]);
            nodes[i] = new Node(A, B);
        }

        Arrays.sort(nodes);

        room.add(nodes[0].end);
        for(int i = 1; i < N; i++) {
            if(room.peek() > nodes[i].start) {
                room.add(nodes[i].end);
            } else {
                room.poll();
                room.add(nodes[i].end);
            }
        }
        System.out.println(room.size());
    }

    public static class Node implements Comparable<Node>{
        long start;
        long end;

        public Node(long start, long end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "start=" + start +
                    ", end=" + end +
                    '}';
        }

        @Override
        public int compareTo(Node node) {
            if(this.start < node.start) {
                return -1;
            } else if(this.start == node.start) {
                if(this.end < node.end) {
                    return -1;
                } else if(this.end== node.end) {
                    return 0;
                } else {
                    return 1;
                }
            } else {
                return 1;
            }
        }
    }
}
