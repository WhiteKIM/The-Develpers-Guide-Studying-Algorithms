import java.util.Arrays;
import java.util.Scanner;

public class p24268 {

    public static int solved(int N, int binary, int max) {
        int visited = 0;
        int[] arr = new int[101];

        for(int i = 0; i < binary; i++) {
            arr[i] = N % binary;
            N /= binary;
        }

        while (N <= max) {
            visited = 0;
            arr[0]+=1;


            for(int i = 0; i < binary; i++) {
                if(arr[i]==binary) {
                    arr[i+1]+=1;
                    arr[i] = 0;
                    break;
                }
                visited |= (1 << arr[i]);
            }

            boolean allDigitsVisited = true;
            for (int i = 0; i < binary; i++) {
                if ((visited & (1 << i)) == 0) {
                    allDigitsVisited = false;
                    break;
                }
            }

            if (allDigitsVisited && arr[binary - 1] != 0) {
                return N;
            }
            N +=1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int N;
        int D;
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");
        N = Integer.parseInt(input[0]);
        D = Integer.parseInt(input[1]);

        int max = 0;
        for(int i = 0; i < D; i++) {
            max += i * Math.pow(D, i);
        }

        if(N >= max) {
            System.out.println(-1);
        }else {
            System.out.println(solved(N, D, max));
        }
    }
}
