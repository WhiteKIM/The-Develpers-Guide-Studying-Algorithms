import java.util.Scanner;

public class p14916 {
    private static int data[] = {5, 2};
    private static int INF = 99999999;//결과값을 초기화하기위한 수, 큰 수면 상관없다

    //동적계획 알고리즘 사용
    public static int exchange(int money) {
        int result[] = new int[money+1];//각 배열의 인덱스값은 N원일때 동전의 최소개수
        for(int i = 1; i < money+1; i++) {
            result[i] = INF;
        }
        result[0] = 0;

        //result의 각 자리에는 동전의 최소개수가 담아져있다.
        for(int i = 1; i < money+1; i++) {
            for(int j : data) {
                if(j <= i && result[i - j]+1 < result[i])
                    result[i] = result[i - j] +1;//이전의 결과에 1을 더한 값을 저장
            }
        }
        return result[money];//문제에서 요구하는 결과값이 담겼다.
    }
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int count = 0;
        count = exchange(N);
        if(count == INF) {
            System.out.println(-1);
        } else {
            System.out.println(count);
        }
    }
}
