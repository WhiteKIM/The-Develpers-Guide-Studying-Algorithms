import java.util.Scanner;

public class p1080 {
    public static int N;
    public static int M;
    public static int count = 0;

    public static boolean compareToData(int[][] origin, int[][] target) {
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                if(origin[i][j] != target[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * @param origin : 원본 데이터
     * @param target : 이렇게 변경될 예정
     */
    public static void isPossible(int[][] origin, int[][] target) {
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                if(origin[i][j]!=target[i][j]) {
                    if(i+2 < N && j+2 < M) {
                        for(int x = i; x < i+3; x++) {
                            for(int y = j; y < j+3; y++) {
                                if(origin[x][y] == 1)
                                    origin[x][y] = 0;
                                else
                                    origin[x][y] = 1;
                            }
                        }count++;
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] temp = input.split(" ");
        N = Integer.parseInt(temp[0]);
        M = Integer.parseInt(temp[1]);
        int[][] origin = new int[N][M];
        int[][] target = new int[N][M];

        for(int i = 0; i < N; i++) {
            char[] data = sc.nextLine().toCharArray();
            for(int j = 0; j < M; j++) {
                origin[i][j] = Character.getNumericValue(data[j]);
            }
        }

        for(int i = 0; i < N; i++) {
            char[] data = sc.nextLine().toCharArray();
            for(int j = 0; j < M; j++) {
                target[i][j] = Character.getNumericValue(data[j]);
            }
        }

        isPossible(origin, target);
        if(compareToData(origin, target))
            System.out.println(count);
        else
            System.out.println(-1);
    }
}
