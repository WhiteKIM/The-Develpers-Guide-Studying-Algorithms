import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

public class p4949 {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static String solved(char[] input) {
        Stack<Character> stack = new Stack<>();
        Stack<Character> stack1 = new Stack<>();

        for(int i = 0; i < input.length; i++) {
            if(input[i]=='(' || input[i]==')' || input[i]=='[' || input[i]==']') {
                stack.push(input[i]);
            }
        }

        while (!stack.isEmpty()) {
            char out = stack.pop();
            if(stack1.empty()) {
                if(out=='(' || out==')' || out=='[' || out==']')
                    stack1.push(out);
            } else if(out=='(' || out==')' || out=='[' || out==']') {
                if(stack1.peek() == ')' && out == '(') {
                    stack1.pop();
                } else if(stack1.peek() == ']' && out == '[') {
                    stack1.pop();
                } else {
                    stack1.push(out);
                }
            }
        }
        if(stack1.empty())
            return "yes";
        else
            return "no";
    }

    public static void main(String[] args) throws IOException {
        ArrayList<String> arrayList = new ArrayList();
        while (true) {
            char[] input = reader.readLine().toCharArray();
            if(input[0]=='.')
                break;

            arrayList.add(solved(input));
        }

        for(String x : arrayList) {
            System.out.println(x);
        }
    }
}
