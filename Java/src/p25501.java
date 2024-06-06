import java.util.Scanner;

public class p25501 {
    public static int count = 1;
    public static int palindrome(String str, int left, int right) {
        if(left >= right)
            return 1;
        else if (str.charAt(left) != str.charAt(right)) {
            return 0;
        } else {
            count++;
            return palindrome(str, left+1, right-1);
        }
    }
    public static void main(String[] args) {
        int T;
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        T = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < T; i++) {
            String input = sc.nextLine();
            int result = palindrome(input, 0, input.length()-1);
            sb.append(result).append(" ").append(count).append("\n");
            count = 1;
        }
        System.out.println(sb.toString());
    }
}
