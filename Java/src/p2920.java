import java.util.Scanner;

public class p2920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().replaceAll(" ","");

        boolean a = false;
        boolean d = false;
        int before = Character.getNumericValue(input.charAt(0));
        for(int i = 1; i < input.length(); i++) {
            int num = Character.getNumericValue(input.charAt(i));
            if(before < num) {
                a = true;
                before = num;
            } else {
                d = true;
                before = num;
            }
        }

        if(a && d) {
            System.out.println("mixed");
        } else if(a && !d) {
            System.out.println("ascending");
        } else {
            System.out.println("descending");
        }
    }
}
