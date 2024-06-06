import java.util.Scanner;

public class p30224 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        String str = Integer.toString(N);
        if(str.contains("7") && (N % 7) == 0) {
            System.out.println("3");
        } else if(str.contains("7")) {
            System.out.println("2");
        } else if(!str.contains("7") && (N % 7) == 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
