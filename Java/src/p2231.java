import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class p2231 {
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        ArrayList<Integer> result = new ArrayList<>();
        for(int i = N/2; i <= N; i++) {
            String str = String.valueOf(i);
            int sum = i;
            for(int j = 0; j < str.length(); j++) {
                int x = Character.getNumericValue(str.charAt(j));
                sum+= x;
            }

            if(sum == N) {
                result.add(i);
            }
        }

        if(result.size() == 0) {
            System.out.println(0);
        } else {
            Collections.sort(result);
            System.out.println(result.get(0));
        }
    }
}
