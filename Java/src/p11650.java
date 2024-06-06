import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class p11650 {
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.nextLine());
        List<Node> nodeList = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            String[] input = sc.nextLine().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);
            nodeList.add(new Node(x, y));
        }

        nodeList.sort(new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                if(o1.x != o2.x) {
                    return o1.x - o2.x;
                } else {
                    return o1.y - o2.y;
                }
            }
        });

        for(Node n : nodeList) {
            System.out.println(n.toString());
        }
    }

    public static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return x +" " + y;
        }
    }
}
