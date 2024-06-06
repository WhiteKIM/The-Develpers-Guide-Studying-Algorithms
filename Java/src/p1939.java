import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class p1939 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static int N;
    public static int M;
    public static boolean[] visited;
    public static int from;
    public static int to;
    public static long result;

    public static boolean bfs(Graph data, long weight) {
        Queue<Node> queue = new LinkedList<>();
        visited = new boolean[N+1];
        queue.add(new Node(from, from, 0));//초기 시작노드

        while (!queue.isEmpty()) {
            Node x = queue.poll();

            if(x.getTo() == to) {
                return true;
            }

            for(Node node : data.getEdge(x.getTo())) {
                if(node.getWeight() >= weight && !visited[node.getTo()]) {//방문한 적이 없고, 현재 중량이 허용치인지
                    visited[node.getTo()] = true;
                    queue.add(node);
                }
            }
        }
        return false;
    }

    /**
     *
     * @param min
     * @param max
     * @param graph
     * 다리를 건널 수 있는 최대 중량을 찾아낸다.
     * 이분 탐색을 통해서 현재 중량이 다리를 건널 수 있는지 판단
     */
    public static void binarySearch(long min, long max, Graph graph) {
        while (min <= max) {
            long mid = (max+min)/2;

            if(bfs(graph, mid)) {
                min = mid + 1;
                result = mid;
            } else {
                max = mid - 1;
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) throws IOException {
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        Graph graph = new Graph(N+1);
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;

        for(int i = 0; i < M; i++) {
            input = br.readLine().split(" ");
            int from = Integer.parseInt(input[0]);
            int to = Integer.parseInt(input[1]);
            long weight = Long.parseLong(input[2]);
            graph.addEdge(from, to, weight);
            max = Math.max(max, weight);
            min = Math.min(min, weight);
        }

        input = br.readLine().split(" ");
        from = Integer.parseInt(input[0]);
        to = Integer.parseInt(input[1]);
        binarySearch(min, max, graph);
    }

    static class Node {
        private int from;
        private int to;
        private long weight;

        public Node(int from, int to, long weight) {
            this.from = from;
            this.to = to;
            this.weight = weight;
        }

        public int getFrom() {
            return from;
        }

        public int getTo() {
            return to;
        }

        public long getWeight() {
            return weight;
        }
    }

    static class Graph {
        private int size;
        private ArrayList<ArrayList<Node>> graph;

        public Graph(int size) {
            this.size = size;
            this.graph = new ArrayList<>();

            for(int i = 0; i <= size; i++) {
                graph.add(new ArrayList<>());
            }
        }

        public void addEdge(int from, int to, long weight) {
            Node node1 = new Node(from, to, weight);
            Node node2 = new Node(to, from, weight);
            graph.get(from).add(node1);
            graph.get(to).add(node2);
        }

        public ArrayList<Node> getEdge(int vertex) {
            return graph.get(vertex);
        }
    }
}
