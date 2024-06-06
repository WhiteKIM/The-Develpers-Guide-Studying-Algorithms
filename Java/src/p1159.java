import java.util.Scanner;

public class p1159 {
    public static int[] alpabet = new int[26];

    public static void solved(String[] data) {
        for(int i = 0; i < data.length; i++) {
            char[] name = data[i].toCharArray();
            int index = name[0] - 'a';
            alpabet[index]++;
        }
    }

    public static void main(String[] args) {
        int T;
        boolean check = false;
        Scanner sc = new Scanner(System.in);
        T = Integer.parseInt(sc.nextLine());
        String[] input = new String[T];

        for(int i = 0; i < T; i++) {
            input[i] = sc.nextLine();
        }
        solved(input);
        for(int i = 0; i < alpabet.length; i++) {
            if(alpabet[i] >= 5) {
                check = true;
                char c = (char)(i+97);
                System.out.print(c);
            }
        }
        if(check==false)
            System.out.print("PREDAJA");
    }
}
