import java.util.Scanner;

public class p8979 {
    public static int[] result;
    public static int rank = 1;
    public static int solved(int[][] data, int target, int N) {
        int index = 0;//target 인덱스

        for(int i = 0; i < N; i++) {
            if(target == data[i][0]) {
                index = i;
                break;
            }
        }

        for(int i = 0; i < N; i++) {
            if(index != i) {
                if(data[i][1] > data[index][1]) {
                    rank++;
                } else if (data[i][1] == data[index][1]) {
                    if(data[i][2] > data[index][2]) {
                        rank++;
                    } else if (data[i][2] == data[index][2]) {
                        if(data[i][3] > data[index][3]) {
                            rank++;
                        }
                    }
                }
            }
        }
        return rank;
    }

    public static void main(String[] args) {
        int N, target;
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        target = sc.nextInt();
        sc.nextLine();
        int[][] data = new int[N][4];
        result = new int[N];
        for(int i = 0; i < N; i++) {
            String input = sc.nextLine();
            String[] temp = input.split(" ");
            for(int j = 0; j < temp.length; j++) {
                data[i][j] = Integer.parseInt(temp[j]);
            }
        }

        System.out.println(solved(data, target, N));
    }
}
