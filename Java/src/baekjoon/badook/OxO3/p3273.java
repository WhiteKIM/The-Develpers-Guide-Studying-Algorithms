package baekjoon.badook.OxO3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class p3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] data = new int[N];
        int target = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            data[i] = Integer.parseInt(input[i]);
        }

        Arrays.sort(data);
        int count = 0;
        int left = 0;
        int right = N - 1;
        while (left < right) {
            if(data[left] + data[right] == target) {
                left+=1;
                count+=1;
            }

            if(data[left] + data[right] > target) {
                right -= 1;
            }

            if(data[left] + data[right] < target) {
                left+=1;
            }
        }

        System.out.println(count);
    }
}
