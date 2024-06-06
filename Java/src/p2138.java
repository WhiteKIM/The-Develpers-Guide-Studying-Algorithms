import java.util.Scanner;

public class p2138 {
    public static int[] data;
    public static int[] result;
    public static void lightOnOff(int index, int[] data) {
        if(index-1 >= 0) {
            if(data[index-1]==1) {
                data[index-1] = 0;
            } else {
                data[index-1] = 1;
            }
        }

        if(data[index] == 1) {
            data[index] = 0;
        }else {
            data[index] = 1;
        }

        if(index+1 < data.length) {
            if(data[index+1]==1) {
                data[index+1] = 0;
            } else {
                data[index+1] = 1;
            }
        }
    }

    public static boolean comp(int[] data) {
        for(int i = 0; i < data.length; i++) {
            if(data[i] != result[i])
                return false;
        }
        return true;
    }

    public static int solved(int index) {
        int[] temp = data.clone();
        int count = 0;

        if(index == 0) {
            lightOnOff(0, temp);
            count++;
        }

        for(int i = 1; i < temp.length; i++) {
            if(temp[i-1] != result[i-1]) {
                lightOnOff(i, temp);
                count++;
            }
        }
        if(comp(temp))
            return count;
        else
            return -1;
    }

    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.nextLine());
        data = new int[N];
        result = new int[N];
        char[] input = sc.nextLine().toCharArray();

        for(int i = 0; i < N; i++) {
            data[i] = Character.getNumericValue(input[i]);
        }

        input = sc.nextLine().toCharArray();
        for(int i = 0; i < N; i++) {
            result[i] = Character.getNumericValue(input[i]);
        }

        int num1 = solved(0);
        int num2 = solved(1);

        if(num1 == -1 && num2 != -1) {
            System.out.println(num2);
        } else if(num1 != -1 && num2 == -1) {
            System.out.println(num1);
        } else if(num1 != -1 && num2 != -1) {
            System.out.println(Math.min(num1, num2));
        } else {
            System.out.println(-1);
        }
    }
}
