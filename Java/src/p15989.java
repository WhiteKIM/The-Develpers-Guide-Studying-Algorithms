import java.util.Scanner;

public class p15989 {
    public static int count(int N) {
        int[] data = new int[N+1];

        if(N >= 1)
            data[1] = 1;

        if(N>= 2)
            data[2] = 2;

        if(N>=3)
            data[3] = 3;

        for(int i = 4; i < N+1; i++) {
            data[i] = data[i-3]+(i/2)+1;
        }
        return data[N];
    }

    public static void main(String[] args) {
        int T;
        Scanner sc = new Scanner(System.in);
        StringBuilder sb =new StringBuilder();
        T = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < T; i++) {
            int num = Integer.parseInt(sc.nextLine());
            sb.append(count(num)).append("\n");
        }
        System.out.println(sb.toString());
    }
}
