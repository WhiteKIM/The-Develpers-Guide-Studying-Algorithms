import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class p1946 {
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.nextLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++) {
            int M = Integer.parseInt(sc.nextLine());
            ArrayList<int []> data = new ArrayList<>();
            for(int j = 0; j < M; j++) {
                int A, B;
                String[] input = sc.nextLine().split(" ");
                A = Integer.parseInt(input[0]);
                B = Integer.parseInt(input[1]);

                data.add(new int[]{A, B});
            }

            data.sort(new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    if(o1[0] < o2[0]) {
                        return -1;
                    } else if(o1[0] == o2[0]) {
                        return 0;
                    } else {
                        return 1;
                    }
                }
            });
            int count = 1;
            int before = data.get(0)[1];
            for(int j = 1; j < M; j++) {
                if(data.get(j)[1] <= before) {
                    before = data.get(j)[1];
                    count+=1;
                }
            }

            sb.append(count).append("\n");
        }

        System.out.println(sb.toString());
    }
}
