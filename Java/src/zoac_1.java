import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class zoac_1 {
    public static void main(String[] args) throws IOException {
        int N;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i = 0; i < N; i++) {
            String input = br.readLine();
            input = input.replaceAll("01", "#");
            input = input.replaceAll("OI", "#");


            for(int j = 0; j < input.length(); j++) {
                if(input.charAt(j)=='#') {
                    count+=1;
                    break;
                }
            }
        }

        System.out.println(count);
    }
}
