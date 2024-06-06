import java.util.Scanner;

public class p24736 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input1 = sc.nextLine().split(" ");
        String[] input2 = sc.nextLine().split(" ");
        int[] data1 = new int[5];
        int[] data2 = new int[5];

        for(int i = 0; i < 5; i++) {
            data1[i] = Integer.parseInt(input1[i]);
            data2[i] = Integer.parseInt(input2[i]);
        }

        int result1 = 0;
        int result2 = 0;
        for(int i = 0; i < 5; i++) {
            switch (i) {
                case 0 :
                    if(data1[i] > 0) {
                        result1 += (6 * data1[i]);
                    }
                    if(data2[i] > 0) {
                        result2 += (6 * data2[i]);
                    }
                    break;
                case 1 :
                    if(data1[i] > 0) {
                        result1 += (3 * data1[i]);
                    }
                    if(data2[i] > 0) {
                        result2 += (3 * data2[i]);
                    }
                    break;
                case 2 :
                    if(data1[i] > 0) {
                        result1 += (2 * data1[i]);
                    }
                    if(data2[i] > 0) {
                        result2 += (2 * data2[i]);
                    }
                    break;
                case 3:
                    if(data1[i] > 0) {
                        result1 += data1[i];
                    }
                    if(data2[i] > 0) {
                        result2 += data2[i];
                    }
                    break;
                case 4:
                    if(data1[i] > 0) {
                        result1 += (2 * data1[i]);
                    }
                    if(data2[i] > 0) {
                        result2 += (2 * data2[i]);
                    }
                    break;
                default:
                    break;
            }
        }
        System.out.println(result1 +" " + result2);
    }
}
