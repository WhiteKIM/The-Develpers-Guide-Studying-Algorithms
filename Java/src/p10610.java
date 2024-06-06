import java.util.Arrays;
import java.util.Scanner;

public class p10610 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] data = sc.nextLine().toCharArray();

        Arrays.sort(data);
        StringBuilder result = new StringBuilder();

        int sum = 0;
        for(int i = data.length-1; i >= 0; i--) {
            int value = Character.getNumericValue(data[i]);
            sum += value;
            result.append(value);
        }

        if(sum % 3 == 0 && data[0]=='0') {
            System.out.println(result.toString());
        } else {
            System.out.println(-1);
        }
    }
}
