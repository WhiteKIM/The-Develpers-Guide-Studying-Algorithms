import java.util.Scanner;

public class p10162 {
    public static void main(String[] args) {
        int min5 = 300;
        int min5_count = 0;
        int min1_count = 0;
        int min1 = 60;
        int sec_count = 0;
        int sec = 10;
        int time = 0;
        Scanner sc = new Scanner(System.in);

        time = Integer.parseInt(sc.nextLine());

        if(time >= min5) {
            min5_count = time / min5;
            time = time % min5;
        }

        if(time >= min1) {
            min1_count = time / min1;
            time = time % min1;
        }

        if(time >= sec) {
            sec_count = time / sec;
            time = time % sec;
        }

        if(time > 0) {
            System.out.println(-1);
        } else {
            System.out.println(min5_count+" "+min1_count+" "+sec_count);
        }
    }
}
