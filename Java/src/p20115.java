import java.util.Arrays;
import java.util.Scanner;

public class p20115 {
    public static float makeDrink(int[] drink) {
        // 선택 방법
        // 가장 큰 드링크에 가장 작은 드링크를 붓는다.
        float result = (float) drink[drink.length-1];
        for(int i = 0; i < drink.length-1; i++) {
            result = result + ((float) drink[i] /2);
        }

        return result;
    }

    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.nextLine());
        int[] drink = new int[N];

        String[] input = sc.nextLine().split(" ");

        for(int i = 0; i < N; i++) {
            drink[i] = Integer.parseInt(input[i]);
        }

        Arrays.sort(drink);
        float result = makeDrink(drink);
        System.out.println(result);
    }
}
