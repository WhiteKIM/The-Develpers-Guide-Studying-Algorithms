import java.util.Scanner;

public class p2750 {
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int[] data = new int[N];
        for(int i = 0; i < N; i++) {
            data[i] = sc.nextInt();
        }

        for(int i = 0; i < N; i++) {
            for(int j = i; j < N; j++) {
                if(data[i] > data[j]) {
                    int temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }

        for(int x : data) {
            System.out.println(x);
        }
    }
}
