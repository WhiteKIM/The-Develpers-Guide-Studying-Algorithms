import java.util.Scanner;

public class p1515 {
    public static void main(String[] args) {
        String input;
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        input = sc.nextLine();

        int point = 0;
        int base  = 0;
        boolean check = true;

        while(check) {
            base++;
            String base_str = String.valueOf(base);
            for(int i = 0; i < base_str.length(); i++) {
                if(base_str.charAt(i)== input.charAt(point)) {
                    point++;
                }
                if(point == input.length()){
                    check = false;
                    break;
                }
            }
        }
        System.out.println(base);
    }
}
