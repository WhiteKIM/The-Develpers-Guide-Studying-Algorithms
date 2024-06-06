import java.util.Scanner;

public class p26489 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (sc.hasNextLine()) {
            String str = sc.nextLine();

            if(str.isEmpty()) {
                break;
            }
            count+=1;
        }

        System.out.println(count);
    }
}
