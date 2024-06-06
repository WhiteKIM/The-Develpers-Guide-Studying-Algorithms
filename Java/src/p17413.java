import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class p17413 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        String input = br.readLine();
        Stack<Character> stack = new Stack<>();

        boolean check = true;
        for(int i = 0; i < input.length(); i++) {
            if(input.charAt(i)=='>') {
                check = true;
                sb.append(input.charAt(i));
            } else if(!check) {
                sb.append(input.charAt(i));
            } else if(input.charAt(i)=='<') {
                if(!stack.isEmpty()) {
                    while (!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                }
                sb.append(input.charAt(i));
                check = false;
            } else if(input.charAt(i)==' ') {
                if(!stack.isEmpty()) {
                    while (!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                }
                sb.append(" ");
            } else {
                stack.push(input.charAt(i));
            }
        }

        if(!stack.isEmpty()) {
            while (!stack.isEmpty())
                sb.append(stack.pop());
        }
        System.out.println(sb.toString());
    }
}
