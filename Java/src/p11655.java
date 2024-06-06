import java.util.Scanner;

public class p11655 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] input = sc.nextLine().toCharArray();

        for(int i = 0; i < input.length; i++) {
            int index = input[i];
            if(index >= 65 && index <= 90) {
                int newChar = index + 13;
                if(newChar > 90) {
                    newChar = (newChar - 91) + 65;
                    char c = (char)newChar;
                    input[i] = c;
                } else {
                    char c = (char)newChar;
                    input[i] = c;
                }
            }
            if(index >= 97 && index <= 122) {
                int newChar = index + 13;
                if(newChar > 122) {
                    newChar = (newChar - 123) + 97;
                    char c = (char)newChar;
                    input[i] = c;
                } else{
                    char c = (char)newChar;
                    input[i] = c;
                }
            }
        }
        for(char c : input) {
            System.out.print(c);
        }
    }
}
