import java.util.Scanner;

public class p27433 {
    public static long factorial(long num) {
        if(num == 0 || num == 1) {
            return 1;
        }
        return num * factorial(num-1);
    }
    public static void main(String[] args) {
        long T;
        Scanner sc = new Scanner(System.in);
        T = Long.parseLong(sc.nextLine());
        System.out.println(factorial(T));
    }
}
