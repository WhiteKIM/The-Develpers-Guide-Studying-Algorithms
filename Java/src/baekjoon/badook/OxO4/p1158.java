package baekjoon.badook.OxO4;

import java.util.*;

public class p1158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        StringBuilder sb = new StringBuilder();

        ArrayList<Integer> queue = new ArrayList<>();
        for(int i = 1; i <= N; i++)
            queue.add(i);

        int index = K - 1;
        sb.append("<");
        while (!queue.isEmpty()) {
            if(index >= N) {//한바퀴를 도는 경우에 인덱스 값을 초기화
                index %= N;
            }
            Integer remove = queue.remove(index);
            sb.append(remove).append(", ");
            //1, 2, 4, 5, 6, 7 예제에서
            index += K-1;//다음 인덱스 위치
            N -= 1;//데이터가 줄었다.
        }
        sb.delete(sb.length()-2, sb.length());
        sb.append(">");
        System.out.println(sb.toString());
    }
}
