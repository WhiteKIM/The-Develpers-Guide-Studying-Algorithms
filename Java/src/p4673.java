import java.util.Arrays;

public class p4673 {
    public static void main(String[] args) {
        boolean[] check = new boolean[10001];
        Arrays.fill(check, true);

        for(int i = 1; i <= 10000; i++) {
            int index = i;
            int sum = i;

            if(i >= 1000) {
                sum += index / 1000;
                index = index % 1000;
            }
            if (i >= 100) {
                sum += index / 100;
                index = index % 100;
            }
            if(i >= 10) {
                sum += index / 10;
                index = index % 10;
            }
            if (i >= 0){
                sum += index;
            }

            if(sum <= 10000)
                check[sum] = false;
        }

        for(int i = 1; i < check.length; i++) {
            if(check[i])
                System.out.println(i);
        }
    }
}
