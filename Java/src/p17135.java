import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class p17135 {
    public static int N;
    public static int M;
    public static int range;
    public static int[][] field;
    public static int[][] copyField;
    public static int phase = 1;
    public static int result = 0;
    // 적이 유효 사거리 내인가?
    public static int calcAttack(int x, int y, int enemy_X, int enemy_Y) {
        return Math.abs(x - enemy_X) + Math.abs(y - enemy_Y);
    }

    // 공격!!!
    public static void attack(ArrayList<Integer> comb) {
        int count = 0;
        for(int n = 0; n < N; n++) {
            boolean[][] visited = new boolean[N+1][M+1];
            for(int i = 0; i < comb.size(); i++) {
                int loc = comb.get(i);
                int min = Integer.MAX_VALUE;
                int sx = 0;
                int sy = 0;
                for(int x = 1; x <= N; x++) {
                    for(int y = 1; y <= M; y++) {
                        if(field[x][y]==1) {
                            int num = calcAttack(N+1, loc, x, y);
                            if(min >= num) {
                                if(min > num) {
                                    min = num;
                                    sx = x;
                                    sy = y;
                                } else {
                                    if(sy > y) {
                                        sx = x;
                                        sy = y;
                                    }
                                }
                            }
                        }
                    }
                }
                if(min <= range) {
                    visited[sx][sy] = true;
                }
            }
            for(int x = 1; x <= N; x++) {
                for(int y = 1; y <= M; y++) {
                    if(visited[x][y]) {
                        field[x][y] = 0;//적이 쓰려졌다.
                        count++;
                    }
                }
            }
            move();
        }
        result = Math.max(result, count);
    }
//
//    // 지정한 적을 사살
//    public static int enemyDie(boolean[][] visited) {
//        int count = 0;
//        for(int x = 0; x < N; x++) {
//            for(int y = 0; y < M; y++) {
//                if(visited[x][y]) {
//                    field[x][y] = 0;//적이 쓰려졌다.
//                    count+=1;
//                }
//            }
//        }
//        System.out.println("count : "+count);
//        return count;
//    }

    //적들이 움직입니다.
    public static void move() {
        for(int y = 1; y <= M; y++) {
            field[N][y] = 0;//적이 성 아래에 있다.
        }



        for(int x = N; x >= 1; x--) {
            for (int y = 1; y <= M; y++) {
                field[x][y] = field[x-1][y];// 앞으로 앞으로
            }
        }
    }

//    // 모든 적이 사라졌다
//    public static boolean whereisEnemy() {
//        for(int x = 1; x <= N; x++) {
//            for(int y = 0; y < M; y++) {
//                if(field[x][y]==1) {// 여기있넹
//                    return true;
//                }
//            }
//        }
//        return false;// 적이 사라졌다.
//    }
//
//    // 잘 동작하는지 확인하자
//    public static void printField() {
//        System.out.println("#"+phase);
//        phase+=1;
//        for(int x = 0; x < N; x++) {
//            for(int y = 0; y < M; y++) {
//                System.out.print(field[x][y]+" ");
//            }
//            System.out.println();
//        }
//    }

//    // 패턴을 다음과 같다
//    // 1. 공격
//    // 2. 성으로 접근한다.
//    public static void pattern(ArrayList<Integer> comb) {
//        //printField();
//        //선빵 필승
//        attack(comb);
//        move();
//    }

    // 조합을 이용해서 사용가능한 경우의 수 모두 뽑기
    public static void combination(int start, int M, int R, ArrayList<Integer> comb) {
        if(R == 0) {
            InitField();
            attack(comb);
            return;
        }

        for(int i = start; i <= M; i++) {
            comb.add(i);
            combination(i+1, M, R -1, comb);
            comb.remove(comb.size() - 1);
        }
    }

    // 아처의 위치를 최대한 효울적으로 구성해보자
    public static void InitField() {
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                field[i][j] = copyField[i][j];
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);
        range = Integer.parseInt(input[2]);
        field = new int[N+1][M+1];
        copyField = new int[N+1][M+1];

        for(int i = 1; i <= N; i++) {
            input = sc.nextLine().split(" ");
            for(int j = 0; j < M; j++) {
                field[i][j+1] = Integer.parseInt(input[j]);
                copyField[i][j+1] = Integer.parseInt(input[j]);
            }
        }

        // test
/*        field[0][0] = 2;
        field[0][2] = 2;
        field[0][4] = 2;*/
        ArrayList<Integer> comb = new ArrayList<>();
        combination(1, M, 3, comb);

        System.out.println(result);
    }
}
