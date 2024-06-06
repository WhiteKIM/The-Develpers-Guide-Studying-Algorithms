import java.util.Scanner;

public class p19941 {
    public static void main(String[] args) {
        int N, K;
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        N = Integer.parseInt(input[0]);
        K = Integer.parseInt(input[1]);

        char[] data = sc.nextLine().toCharArray();
        boolean[] eat = new boolean[N];
        int count = 0;
        for(int i = 0; i < N; i++) {
            // 좌우로 검색해보자
            // 왼쪽부터 오른쪽으로
            for(int j = i - K; j <= i + K ; j++) {
                if(0<= j && j < N) {
                    if(data[i]=='P' && data[j]=='H') {
                        if(!eat[j]) {
                            eat[j] = true;//먹은거 또 처먹기 방지
                            count+=1;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}
