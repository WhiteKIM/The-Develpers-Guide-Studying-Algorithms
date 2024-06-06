import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class p2529 {

    public static int N;
    public static ArrayList<String> result = new ArrayList<>();
    public static boolean[] visited = new boolean[10];
    public static String[] data;
    public static void solved(int start, int index, String str) {
        if(N == index) {
            result.add(str);
            return;
        }

        for(int i = 0; i <= 9; i++) {
            if(!visited[i]) {
                char ch = data[index].charAt(0);

                if(ch == '>') {
                    if(start > i) {
                        visited[i] = true;
                        solved(i, index+1, str+i);
                        visited[i] = false;
                    }
                } else {
                    if(start < i) {
                        visited[i] = true;
                        solved(i, index+1, str+i);
                        visited[i] = false;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.nextLine());
        data = sc.nextLine().split(" ");

        for(int i = 0; i < 10; i++) {
            visited[i] = true;
            solved(i, 0, i+"");
            visited[i] = false;
        }

        Collections.sort(result);
        System.out.println(result.get(result.size()-1));
        System.out.println(result.get(0));
    }
}
