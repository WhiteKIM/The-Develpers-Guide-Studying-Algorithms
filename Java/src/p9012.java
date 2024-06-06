import java.util.Scanner;
import java.util.Stack;

/**
 * 스택에서 값을 하나씩 가져와 괄호가 닫히는 경우에만 값을 제거해서
 * 최종적으로 스택에 값이 남아있는지 없는지를 판단
 */
public class p9012 {
    public static String solved(char[] data) {
        Stack<Character> stack = new Stack<Character>();
        Stack<Character> stack1 = new Stack<Character>();

        for(int i = 0; i < data.length; i++) {
            stack.push(data[i]);
        }

        while (!stack.empty()) {
            char temp = stack.pop();

            if(stack1.empty()) {
                stack1.push(temp);
            }
            else{
                if(stack1.peek() == ')' && temp=='(') {
                    stack1.pop();
                }
                else {
                    stack1.push(temp);
                }
            }
        }

        if(stack1.empty())
            return "YES";
        else
            return "NO";
    }

    public static void main(String[] args) {
        int T;
        Scanner sc = new Scanner(System.in);
        T = Integer.parseInt(sc.nextLine());
        String[] result = new String[T];
        char[] data;
        for(int i = 0;  i < T; i++) {
            char[] input = sc.nextLine().toCharArray();
            data = new char[input.length];
            for(int j = 0; j  < input.length; j++) {
                data[j] = input[j];
            }
            result[i] = solved(data);
        }
        for(String x : result){
            System.out.println(x);
        }
    }
}
