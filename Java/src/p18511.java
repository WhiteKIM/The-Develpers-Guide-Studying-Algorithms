import java.util.Scanner;

public class p18511 {
    public static int output;
    public static void makeMaxNum(int data[], int max, int num) {
        if(num > output && num <= 100000000) {
            output = num;
        }

        if(num > max)
            return;

        for(int i = 0; i < data.length; i++){
            if((num * 10 + data[i]) <= max)
                makeMaxNum(data, max,(num * 10 + data[i]));
        }
    }
    public static void main(String[] args) {
        int N, K;
        int data[];

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();

        data = new int[K];

        for(int i = 0; i < K; i++) {
            data[i] = sc.nextInt();
        }

        makeMaxNum(data, N, 0);
        System.out.println(output);
    }
}
