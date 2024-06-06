import java.util.Scanner;

public class p29863 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int night = sc.nextInt();
        int day = sc.nextInt();

        int count = 0;
        while (true) {
            if(night == day) {
                break;
            }
            night+=1;
            count+=1;
            if(night == 24) {
                night = 0;
            }
        }
        System.out.println(count);
    }
}
