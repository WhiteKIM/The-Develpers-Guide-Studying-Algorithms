import java.util.Scanner;

public class p3052 {
    public static void main(String[] args) {
        boolean[] mod = new boolean[42];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            int index = num % 42;
            mod[index] = true;
        }
        int count = 0;
        for(boolean check : mod) {
            if(check)
                count+=1;
        }

        System.out.println(count);
    }
}
