import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class p3986 {
    public static int count = 0;

    public static boolean isGoodWord(String str) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < str.length(); i++) {
            if(stack.isEmpty()) {
                stack.push(str.charAt(i));
            }else {
                if(stack.peek() == str.charAt(i)) {
                    stack.pop();
                } else {
                    stack.push(str.charAt(i));
                }
            }
        }

        if(stack.isEmpty())
            return true;
        else
            return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N;
        N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            String str = br.readLine();
            if(isGoodWord(str)) {
                count++;
            }
        }

        System.out.println(count);
    }
}
