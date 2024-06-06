import java.util.Arrays;
import java.util.Scanner;

public class p2579 {
    public static int[] data;
    public static int[] result;
    public static int N;
    public static int stairUp(int[] data) {
        result[0] = 0;
        result[1] = data[1];

        if(N==1)
            return result[N];
        result[2] = data[1]+data[2];
        if(N==2)
            return result[2];

        for(int i = 3; i <= N; i++) {
            result[i] = Math.max(result[i-2]+data[i], data[i]+result[i-3]+data[i-1]);
        }

        return result[N];
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        N = Integer.parseInt(sc.nextLine());

        data = new int[N+1];
        result = new int[N+1];
        for(int i = 0; i < N; i++) {
            data[i+1] = Integer.parseInt(sc.nextLine());
        }
        System.out.println(stairUp(data));
    }
}
