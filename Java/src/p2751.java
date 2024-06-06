import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class p2751 {
    public static int[] result;
    public static void merge(int[] data, int left, int mid, int right) {
        int l = left;
        int r = mid+1;

        int index = left;

        while (l <= mid && r <= right) {
            if(data[l] <= data[r]) {
                result[index++] = data[l];
                l++;
            } else {
                result[index++] = data[r];
                r++;
            }
        }

        if(l > mid) {
            while (r <= right) {
                result[index++] = data[r];
                r++;
            }
        } else {
            while (l <= mid) {
                result[index++] = data[l];
                l++;
            }
        }

        for(int i = left; i <= right; i++) {
            data[i] = result[i];
        }
    }

    public static void mergeSort(int[] data, int left, int right) {
        if(left < right) {
            int mid = (left + right) / 2;
            mergeSort(data, left, mid);
            mergeSort(data, mid + 1, right);
            merge(data, left, mid, right);
        }
    }

    public static void main(String[] args) throws IOException {
        int N;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        int[] data = new int[N];
        result = new int[N];
        for(int i = 0; i < N; i++) {
            data[i] = Integer.parseInt(br.readLine());
        }

        mergeSort(data, 0, data.length-1);
        for(int x : data) {
            sb.append(x).append("\n");
        }
        System.out.println(sb.toString());
    }
}
