import java.util.Scanner;

public class p10988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] input = sc.nextLine().toCharArray();

        int start = 0;
        int last = input.length-1;
        boolean check = true;
        while(true) {
            if(start < 0 || start >= input.length || last < 0 || last >= input.length)
                break;
            if(start == last)
                break;
            if(input[start]!=input[last]) {
                check = false;
                break;
            }
            start++;
            last--;
        }

        if(check)
            System.out.println(1);
        else
            System.out.println(0);
    }
}
