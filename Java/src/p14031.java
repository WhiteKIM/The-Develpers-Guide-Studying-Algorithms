import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p14031 {

    public static int solved(int[] data) {
        int count = 0;
        for(int i = 0; i < 20; i++) {
            for(int j = 0; j < i; j++) {
                if(data[i] < data[j]) {
                    int temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                    count+=1;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++) {

            String[] input = br.readLine().split(" ");
            int[] data = new int[20];
            int index = Integer.parseInt(input[0]);
            for(int j = 1; j <= 20; j++) {
                data[j-1] = Integer.parseInt(input[j]);
            }

            sb.append(index).append(" ").append(solved(data)).append("\n");
        }

        System.out.println(sb.toString());
    }
}
