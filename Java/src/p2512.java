import java.util.Scanner;

public class p2512 {
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.nextLine());
        String[] input = sc.nextLine().split(" ");
        int[] data = new int[N];
        int min = 0;
        int max = Integer.MIN_VALUE;
        int total = 0;
        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(input[i]);
            data[i] = num;
            max = Math.max(max, num);
//            min = Math.min(min, num);
            total += num;
        }
        int sum = sc.nextInt();

        if(total <= sum) {
            System.out.println(max);
            return;
        }

        int mid = 0;
        int result = 0;
        while (min <= max) {
            int inSum = 0;
            mid = (min+max)/2;
//            System.out.println("min  : "+min+" max : "+max+" mid : "+mid);
            for(int i = 0; i < N; i++) {
                if(data[i] > mid) {
                    inSum+= mid;
                } else {
                    inSum+= data[i];
                }
            }
            if (inSum > sum) {
                max = mid -1;
            } else {
                min= mid +1;
                result = mid;
            }
        }

        System.out.println(result);
    }
}
