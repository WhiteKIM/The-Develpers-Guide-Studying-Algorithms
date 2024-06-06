import java.util.Scanner;

public class p1316 {
    public static int count;
    public static void groupWord(String data[]) {
        for(int i = 0; i < data.length; i++) {
            boolean check[] = new boolean[26];
            String word = data[i];
            char words[] = word.toCharArray();
            int prev = 0;//이전값
            for(int j = 0; j < words.length; j++) {
                int now = words[j];//char to int
                if(now!= prev) {
                    if(check[now-'a'] == false) {//문자값을 아스키코드값으로 치환해서 사용
                        check[now-'a'] = true;
                        prev = now;
                    } else {
                        count--;
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
    }
    public static void main(String[] args) {
        int N;
        String data[];

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        data = new String[N];

        for(int i = 0; i < N; i++) {
            data[i] = sc.next();
        }
        count = N;
        groupWord(data);
        System.out.println(count);
    }
}
