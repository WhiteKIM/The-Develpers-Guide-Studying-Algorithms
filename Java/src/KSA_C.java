import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class KSA_C {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        int K = Integer.parseInt(input[2]);

        String[] data = new String[N];

        for(int i = 0; i < N; i++) {
            data[i] = br.readLine();
        }

        Arrays.sort(data);
        int[] index = new int[K];
        for(int i = 0; i < K; i++) {

        }
    }
}
