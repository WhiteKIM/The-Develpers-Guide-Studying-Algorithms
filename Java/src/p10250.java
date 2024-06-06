import java.util.Scanner;

public class p10250 {
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.nextLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++) {
            String[] input = sc.nextLine().split(" ");
            int floor = Integer.parseInt(input[0]);
            int room = Integer.parseInt(input[1]);
            int target = Integer.parseInt(input[2]);

            int x = target%floor;
            int y = (target/floor) + 1;

            if(target % floor == 0) {
                x = floor;
                y = target/floor;
            }
            sb.append(x*100+y).append("\n");
        }
        System.out.println(sb.toString());
    }
}
