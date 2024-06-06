import java.util.Scanner;

public class p2864 {
    public static int getMin(int num1, int num2) {
        int result = 0;
        char[] temp1 = Integer.toString(num1).toCharArray();
        char[] temp2 = Integer.toString(num2).toCharArray();
        for(int i = 0; i < temp1.length; i++) {
            if(temp1[i] == '6')
                temp1[i] = '5';
        }

        for(int i = 0; i < temp2.length; i++) {
            if(temp2[i] == '6')
                temp2[i] = '5';
        }
        result = Integer.parseInt(String.valueOf(temp1)) + Integer.parseInt(String.valueOf(temp2));
        return result;
    }
    public static int getMax(int num1, int num2) {
        int result = 0;
        char[] temp1 = Integer.toString(num1).toCharArray();
        char[] temp2 = Integer.toString(num2).toCharArray();
        for(int i = 0; i < temp1.length; i++) {
            if(temp1[i] == '5')
                temp1[i] = '6';
        }

        for(int i = 0; i < temp2.length; i++) {
            if(temp2[i] == '5')
                temp2[i] = '6';
        }
        result = Integer.parseInt(String.valueOf(temp1)) + Integer.parseInt(String.valueOf(temp2));
        return result;
    }

    public static void main(String[] args) {
        int N, M;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        int min, max;
        min = getMin(N, M);
        max = getMax(N, M);

        System.out.println(min+" "+max);
    }
}
