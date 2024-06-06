import java.util.Scanner;

public class p2563 {
    public static int[][] map = new int[101][101];
    public static int length = 10;

    public static void paper(int x, int y) {
        for(int i = x; i < x+length; i++) {
            for(int j = y; j < y+length; j++) {
                map[i][j] = 1;
            }
        }
    }

    public static int countPaper() {
        int count = 0;
        for(int i = 1; i < 101; i++) {
            for (int j = 1; j < 101; j++) {
                if(map[i][j] == 1) {
                    count+=1;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < N; i++) {
            String[] input = sc.nextLine().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);
            paper(x, y);
        }

        System.out.println(countPaper());
    }
}
