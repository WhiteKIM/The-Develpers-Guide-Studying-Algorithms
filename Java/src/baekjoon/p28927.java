package baekjoon;

import java.util.Scanner;

public class p28927 {
    private static final int trailer = 3;
    private static final int series = 20;
    private static final int movie = 120;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int mel = 0;
        String[] input = sc.nextLine().split(" ");
        max = Integer.parseInt(input[0]) * trailer + Integer.parseInt(input[1]) * series + Integer.parseInt(input[2]) * movie;
        input = sc.nextLine().split(" ");
        mel = Integer.parseInt(input[0]) * trailer + Integer.parseInt(input[1]) * series + Integer.parseInt(input[2]) * movie;

        if(max > mel)
            System.out.println("Max");
        else if(mel > max)
            System.out.println("Mel");
        else
            System.out.println("Draw");
    }
}
