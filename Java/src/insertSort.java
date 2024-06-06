import java.util.Scanner;

public class insertSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] input = sc.nextLine().toCharArray();
        int[] data = new int[input.length];
        int index = 0;
        for(int i = 0; i < input.length; i++) {
            int num = Character.getNumericValue(input[i]);
            if(index == 0) {
                data[index] = num;
                index++;
            } else {
                if(data[index-1] > num) {
                    int temp = data[index-1];
                    data[index] = temp;
                    data[index-1] = num;
                    index++;
                }
            }
        }

        for(int i : data) {
            System.out.print(i);
        }
    }
}
