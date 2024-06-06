import java.util.Arrays;
import java.util.Scanner;

public class p1940 {
    public static void main(String[] args) {
        int N;
        int M;
        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.nextLine());
        M = Integer.parseInt(sc.nextLine());
        int[] data = new int[N];
        String[] input = sc.nextLine().split(" ");
        for(int i = 0; i < N; i++) {
            data[i] = Integer.parseInt(input[i]);
        }

        Arrays.sort(data);//오름차순으로 정렬
        int left = 0;
        int right = N-1;
        int count = 0;
        while(left < right) {
            if((data[left]+ data[right]) == M) {// 원하는 값과 같다면 count 증가
                count++;
                left++;//사용한 값을 제외하기 위함
                right--;
            } else if((data[left]+ data[right]) < M) {
                left++;// 현재 값이 목표치에 미달이므로, 더 큰값을 사용
            } else {
                right--;// 현재 값이 목표치를 벗어나므로, 값을 줄여봄
            }
        }
        System.out.println(count);
    }
}
