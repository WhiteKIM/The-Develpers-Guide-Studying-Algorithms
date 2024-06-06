import java.util.Scanner;

public class p11726 {
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int[] result = new int[N+1];
        if(N == 1)
            System.out.println(1);
        else if(N == 2)
            System.out.println(2);
        else {
            result[1] = 1;
            result[2] = 2;
            //단순하게 피보나치 결과값인거 같다.
            for(int i = 3; i <= N; i++) {
                result[i] = (result[i-1]+result[i-2])%10007;
            }

            System.out.println(result[N]%10007);
        }
    }
}
