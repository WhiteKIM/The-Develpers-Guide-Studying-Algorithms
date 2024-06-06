import java.util.Objects;
import java.util.Scanner;
import java.util.Stack;

public class p1541 {
    private static int INF = 99999999;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.next().split("-"); // -부호로 값 분리
        int num = INF;
        for(int i =  0; i < input.length; i++) {
            int temp = 0;

            String[] add = input[i].split("\\+");

            for(int j = 0; j < add.length; j++) {
                temp += Integer.parseInt(add[j]);
            }

            if(num==INF) {
                num = temp;
            } else {
                num -= temp;
            }
        }
        System.out.println(num);
    }
}
