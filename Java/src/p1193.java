import java.util.Scanner;

public class p1193 {
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        int line = 1;
        N = sc.nextInt();
        int top = 0;
        int bottom = 0;
        while (N > line) {
            N -= line;
            line+=1;
        }

        if(line%2==0) {
            top = N;
            bottom = line - N + 1;
        } else if(line % 2 == 1) {
            top = line - N +1;
            bottom = N;
        }

        System.out.println(top+"/"+bottom);
    }
}
