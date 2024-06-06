import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class p20920 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        Map<String, Integer> data = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        int N, M;
        String[] input = br.readLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);

        for (int i = 0; i < N; i++) {
            String temp = br.readLine();
            if (temp.length() >= M) {
                if(data.get(temp)!=null) {
                    data.put(temp, data.get(temp)+1);
                } else {
                    data.put(temp, 1);
                }
            }
        }

        Comparator<String> comparator1 = ((s1, s2) -> s1.compareTo(s2));//우선순위3
        Comparator<String> comparator2 = new Comparator<String>() {//우선순위2
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        };
        Comparator<String> comparator3 = new Comparator<String>() {//우선순위1
            @Override
            public int compare(String o1, String o2) {
                return data.get(o2) - data.get(o1);
            }
        };

        List<String> keySet = new ArrayList<>(data.keySet());
        keySet.sort(comparator1);
        keySet.sort(comparator2);
        keySet.sort(comparator3);

        for(String str : keySet)
            sb.append(str).append("\n");
        System.out.println(sb.toString());
    }
}
