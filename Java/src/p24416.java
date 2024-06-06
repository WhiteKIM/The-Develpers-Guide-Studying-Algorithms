import java.util.ArrayList;
import java.util.Scanner;

public class p24416 {
    private static ArrayList<Integer> arrayList;
    public static int dpCount = 0;

    public static int recurFibo(int N) {
        if(N==1 || N == 2) {
            return 1;
        }
        else {
            return recurFibo(N-1) +recurFibo(N-2);
        }
    }
    public static int fibo(int N) {
        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(1);

        for(int i = 3; i <= N; i++) {
            arrayList.add((arrayList.get(i-1)+arrayList.get(i-2)));
            dpCount++;
        }
        return arrayList.get(N);
    }

    public static void main(String[] args) {
        int N;
        arrayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        fibo(N);

        System.out.println(recurFibo(N));
        System.out.println(dpCount);
    }
}