import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class p11866 {

    public static void main(String[] args) {
        int N, M;
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        LinkedList<Integer> data = new LinkedList<>();
        LinkedList<Integer> result = new LinkedList<>();

        for(int i = 1; i <= N; i++){
            data.add(i);
        }

        int index = M-1;
        sb.append("<");
        while (!data.isEmpty()) {
            if(index >= data.size()) {
                index = index % data.size();
            } else {
                result.add(data.remove(index));
                index += M-1;
            }
        }

        while (result.size() > 1) {
            sb.append(result.remove()).append(", ");
        }

        sb.append(result.remove()).append(">");
        System.out.println(sb.toString());
    }
}
