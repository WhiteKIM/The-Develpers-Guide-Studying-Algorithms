import java.util.Scanner;

public class p1427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] input = sc.nextLine().toCharArray();
        int[] data = new int[input.length];
        for(int i = 0; i < input.length; i++) {
            data[i] = Character.getNumericValue(input[i]);
        }

        for(int i = 0; i < input.length; i++) {
            int max = data[i];
            int index = i;
            for(int j = i+1; j < input.length; j++) {
                if(max < data[j]) {
                    index = j;
                    max = data[j];
                }
            }

            int temp = data[i];
            data[i] = data[index];
            data[index] = temp;
        }

        for(int i : data) {
            System.out.print(i);
        }
    }
}
