import java.util.Scanner;

public class KSA_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float input = sc.nextFloat();

        int bilions = (int) Math.pow(10, 9);
        int result = (int) (input*bilions);
        System.out.println(result+"/"+bilions);
    }
}
