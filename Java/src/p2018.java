import java.util.Scanner;

public class p2018 {
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        int left = 1;
        int right = 1;
        int count = 1;
        int sum = 1;

        while (right < N) {
            if(sum == N) {
                count++;
                right++;
                sum = sum + right;
            } else if(sum > N) {
                sum-=left;
                left++;

            } else {
                right+=1;
                sum+= right;
            }
        }
        System.out.println(count);
    }
}
