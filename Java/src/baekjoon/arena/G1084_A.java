package baekjoon.arena;

import java.io.*;

public class G1084_A {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringBuilder sb = new StringBuilder();
    private static String[] data = {"swimming", "bowling", "soccer"};
    
    public static void main(String[] args) throws IOException {
        int N;
        N = Integer.parseInt(br.readLine());
        String[] success = new String[N];//Pass 예상
        for(int i = 0; i < N; i++) {
            int random = (int)(Math.random()*3);
            success[i] = data[random];
            System.out.print(data[random]+" ");
        }
        System.out.println();
        //success = br.readLine().split(" ");//테스트 코드
        System.out.flush();
        String[] fail = br.readLine().split(" ");// 주어진 F과목
        String[] select = new String[N];//최종 예상

        // 선택한 예상 과목이 아니고, 실패한 과목을 제외한 나머지 과목
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < 3; j++) {
                if(!success[i].equals(data[j]) && !fail[i].equals(data[j])) {
                    sb.append(data[j]).append(" ");
                    break;
                }
            }
        }
        System.out.println(sb.toString());
        System.out.flush();
    }
}
