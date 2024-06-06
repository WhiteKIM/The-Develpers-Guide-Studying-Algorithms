import java.util.Scanner;

public class p2577 {
    public static void main(String[] args) {
        long sum = 0;
        Scanner sc = new Scanner(System.in);
        int A = Integer.parseInt(sc.nextLine());
        int B = Integer.parseInt(sc.nextLine());
        int C = Integer.parseInt(sc.nextLine());
        sum = (long) A * B * C;
        String str = String.valueOf(sum);
        int[] data = new int[10];
        for(int i = 0; i < str.length(); i++) {
            int index = Character.getNumericValue(str.charAt(i));
            data[index]++;
        }

        for(int x : data) {
            System.out.println(x);
        }
    }
}
