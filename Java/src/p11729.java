import java.util.Scanner;

public class p11729 {
    public static StringBuilder sb = new StringBuilder();
    public static int count = 1;
    public static void hanoi(int block, int from, int by, int to) {
        if(block == 1) {
            sb.append(from).append(" ").append(to).append("\n");
            return;
        }
        else {
            hanoi(block -1, from, to, by);
            sb.append(from).append(" ").append(to).append("\n");
            count++;
            hanoi(block - 1, by, from, to);
            count++;
        }
    }
    public static void main(String[] args) {
        int block;
        Scanner sc = new Scanner(System.in);
        block = Integer.parseInt(sc.nextLine());
        hanoi(block, 1, 2, 3);
        System.out.println(count);
        System.out.println(sb.toString());
    }
}
