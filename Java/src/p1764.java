import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class p1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        HashSet<String> notHeard = new HashSet<>();//듣도 못한
        HashSet<String> notSee = new HashSet<>();//보도 못한
        List<String> result = new ArrayList<>();

        for(int i = 0; i < N; i++) {
            notHeard.add(br.readLine());
        }

        for(int i = 0; i < M; i++) {
            notSee.add(br.readLine());
        }

        int count = 0;
        for(String s : notHeard) {
            if(notSee.contains(s)) {
                result.add(s);
                count+=1;
            }
        }
        result.sort(Comparator.naturalOrder());
        System.out.println(count);
        for(String s : result) {
            System.out.println(s);
        }
    }
}
