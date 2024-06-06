import java.util.Scanner;

public class p10951 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (sc.hasNextLine()) {
            String input = sc.nextLine();
            if(input.isEmpty()) {
                break;
            }

            String[] data = input.split(" ");
            int A = Integer.parseInt(data[0]);
            int B = Integer.parseInt(data[1]);

            int result = A + B;
            sb.append(result).append("\n");
        }
        System.out.println(sb.toString());
    }
}
