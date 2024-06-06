import java.util.Scanner;

public class p11057 {
    public static int solved(int index) {
        int[][] result = new int[index+1][10];
        result[1][0] = 1;
        for(int i = 0; i < 10; i++) {
            result[1][i] = 1;
        }

        for(int i = 2; i <= index; i++) {
            for(int j = 0; j < 10; j++) {
                if(j == 0) {
                    result[i][j] = 1;
                } else {
                    result[i][j] = result[i][j-1]+ result[i-1][j];
                    result[i][j] %= 10007;
                }
            }
        }

        int sum = 0;
        for (int i = 0; i < 10; i++)
            sum+= result[index][i];

        return sum%10007;
    }

    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        System.out.println(solved(N));
    }
}
