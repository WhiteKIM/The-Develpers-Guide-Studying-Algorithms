import java.util.Scanner;

public class p17615 {

    public static int solved(char[] data) {
        int case1 = 0;
        int case2 = 0;
        int case3 = 0;
        int case4 = 0;
        boolean blueCheck = false;
        boolean redCheck = false;
        //빨간색을 왼쪽으로
        for(int i = 0; i < data.length; i++) {

            if(data[i]=='R') {
                if(blueCheck) {
                    case1++;
                }
            }else {
                blueCheck = true;
            }
        }

        //빨간색을 오른쪽으로
        blueCheck = false;
        for(int i = data.length-1; i >= 0; i--) {

            if(data[i]=='R') {
                if(blueCheck) {
                    case2++;
                }
            }else {
                blueCheck = true;
            }
        }

        //파란색을 왼쪽으로
        for(int i = 0; i < data.length; i++) {
            if(data[i]=='B') {
                if(redCheck) {
                    case3++;
                }
            }else {
                redCheck = true;
            }
        }

        //파란색을 오른쪽으로
        redCheck = false;
        for(int i = data.length-1; i >= 0; i--) {
            if(data[i]=='B') {
                if(redCheck) {
                    case4++;
                }
            }else {
                redCheck = true;
            }
        }

        return Math.min(Math.min(case1, case2), Math.min(case3, case4));
    }

    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.nextLine());
        String input = sc.nextLine();
        char[] data = input.toCharArray();

        System.out.println(solved(data));
    }
}
