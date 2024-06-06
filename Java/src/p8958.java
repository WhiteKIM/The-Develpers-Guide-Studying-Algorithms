import java.util.Scanner;

public class p8958 {
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < N; i++) {
            char[] input = sc.nextLine().toCharArray();

            int point = 1;
            int pointResult = 0;
            for(int j = 0; j < input.length; j++) {
                if(input[j]=='O') {
                    pointResult+= point;
                    point+=1;
                } else {
                    point = 1;
                }
            }
            sb.append(pointResult).append("\n");
        }
        System.out.println(sb.toString());
    }
}
