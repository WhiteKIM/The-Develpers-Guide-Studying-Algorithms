import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class p9934 {
    private static StringBuilder sb = new StringBuilder();
    public static int N;
    public static ArrayList<Node> tree;
    public static void printTree(int[] data, int start, int end, int depth) {
        if(depth >= N) {
            return;
        }

        if(start == end) {
            tree.add(new Node(data[start], depth));
            return;
        }

        int mid  = (start+end) /2;
        tree.add(new Node(data[mid], depth));

        printTree(data, start, mid-1, depth+1);
        printTree(data, mid+1, end, depth+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.nextLine());
        int[] data = new int[(int) Math.pow(2, N)];
        String[] input = sc.nextLine().split(" ");
        for(int i = 0; i < input.length; i++) {
            data[i] = Integer.parseInt(input[i]);
        }
        tree = new ArrayList<>();
        printTree(data, 0, data.length - 1, 0);

        tree.sort(new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                return o1.getDepth() - o2.getDepth();
            }
        });

        int depth = 0;
        for(Node n : tree) {
            if(n.getDepth() == depth) {
                System.out.print(n.getData()+" ");
            } else if (n.getDepth() > depth) {
                System.out.println();
                System.out.print(n.getData()+" ");
                depth = n.getDepth();
            }
        }
    }

    static public class Node {
        int data;
        int depth;

        public Node(int data, int depth) {
            this.data = data;
            this.depth = depth;
        }

        public int getData() {
            return data;
        }

        public int getDepth() {
            return depth;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", depth=" + depth +
                    '}';
        }
    }
}
