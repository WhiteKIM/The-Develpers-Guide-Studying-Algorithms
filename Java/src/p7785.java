import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class p7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Set<String> data = new HashSet<>();
        for(int i =0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            if(input[1].equals("enter")) {
                data.add(input[0]);
            } else {
                data.remove(input[0]);
            }
        }

        List<String> list = new ArrayList<>(data);
        list.sort(Comparator.reverseOrder());
        for(String s : list) {
            System.out.println(s);
        }
    }
}
