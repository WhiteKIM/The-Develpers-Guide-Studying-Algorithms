import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class p4796 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static int howLongCamp(int L, int P, int V) {
        int count = V / P;//캠핑장을 몇번 빌릴 수 있을까요?
        int temp = Math.min(V % P, L);// 만약 V ÷ P의 나머지가 연속으로 빌리는 날보다 크면 한번더 빌린 이후에는 빌릴 수 없음
        int result = L * count + temp;//최종결과
        //int result = V - ((P - L)*count);
        return result;
    }

    public static void main(String[] args) throws IOException {
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (true) {
            int L, P, V;
            int result;
            StringTokenizer st = new StringTokenizer(br.readLine());
            L = Integer.parseInt(st.nextToken());
            P = Integer.parseInt(st.nextToken());
            V = Integer.parseInt(st.nextToken());

            if(L == 0 || P == 0 || V == 0) {
                break;
            } else {
                result = howLongCamp(L, P, V);
                arrayList.add(result);
            }
        }

        for(int i =0; i < arrayList.size(); i++) {
            System.out.println("Case "+(i+1)+": "+arrayList.get(i));
        }
    }
}
