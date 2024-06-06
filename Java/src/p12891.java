import java.util.Scanner;

// Do it Algorithm in java
public class p12891 {
    public static int keyCheck = 0;
    public static int result;
    public static void addNumber(char c, int[] myCheck, int[] check) {
        switch (c) {
            case 'A' :
                myCheck[0]+=1;
                if(myCheck[0] == check[0])
                    keyCheck++;
                break;
            case 'C':
                myCheck[1]+=1;
                if(myCheck[1] == check[1])
                    keyCheck++;
                break;
            case 'G':
                myCheck[2]+=1;
                if(myCheck[2] == check[2])
                    keyCheck++;
                break;
            case 'T':
                myCheck[3]+=1;
                if(myCheck[3] == check[3])
                    keyCheck++;
                break;
            default:
                break;
        }
    }
    private static void removeNumber(char c, int[] myCheck, int[] check) {
        switch (c) {
            case 'A' :
                if(myCheck[0] == check[0])
                    keyCheck--;
                myCheck[0]--;
                break;
            case 'C':
                if(myCheck[1] == check[1])
                    keyCheck--;
                myCheck[1]--;
                break;
            case 'G':
                if(myCheck[2] == check[2])
                    keyCheck--;
                myCheck[2]--;
                break;
            case 'T':
                if(myCheck[3] == check[3])
                    keyCheck--;
                myCheck[3]--;
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {
        int N, M;
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        N = Integer.parseInt(input[0]);
        M = Integer.parseInt(input[1]);

        char[] data = sc.nextLine().toCharArray();

        int[] check = new int[4];
        int[] mycheck = new int[4];

        input = sc.nextLine().split(" ");
        for(int i = 0; i < 4; i++) {
            check[i] = Integer.parseInt(input[i]);
            if(check[i] == 0) {
                keyCheck++;
            }
        }

        for(int i = 0; i < M; i++) {
            addNumber(data[i], mycheck, check);
        }

        if(keyCheck == 4)
            result++;

        for(int i = M; i < N; i++) {
           int j = i - M;
           addNumber(data[i], mycheck, check);
           removeNumber(data[j], mycheck, check);
            if(keyCheck == 4)
                result++;
        }
        System.out.println(result);
    }
}
