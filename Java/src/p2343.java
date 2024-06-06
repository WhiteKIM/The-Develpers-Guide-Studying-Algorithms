import java.util.Scanner;

public class p2343 {
    public static void main(String[] args) {
        int N;
        int M;
        Scanner sc = new Scanner(System.in);
        String[] input= sc.nextLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        int[] data = new int[N];
        input = sc.nextLine().split(" ");
        int left = 0;
        int right = 0;
        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(input[i]);
            data[i] = num;
            left = Math.max(left, num);
            right += num;
        }

        while (left <= right) {
            int mid = (left+right)/2;//블루레이 크기
            int count = 0;
            int sum = 0;

            for(int i = 0; i < N; i++) {
                if(sum + data[i] > mid) {// 블루레이 크기보다 크다면 블루레이를 하나더 사용해야한다.
                    sum = 0;
                    count+=1;
                }
                sum+= data[i];
            }

            if(sum!= 0) {//블루레이가 더 필요하다
                count+=1;
            }

            if(count > M) {
                left = mid + 1;
            } else if(count <= M) {//크기를 더 줄일 수 있는지 확인한다.
                right = mid -1;
            }

        }

        System.out.println(left);
    }
}
