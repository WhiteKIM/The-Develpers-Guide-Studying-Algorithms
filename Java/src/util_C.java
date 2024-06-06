import java.util.*;

// 허접~ 조건도 제대로 안보는 허접~
public class util_C {
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int level = 0;
        int ability = 0;
        Integer[] data = new Integer[N];
        Arrays.fill(data, 0);
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            data[i] = num;
        }
        Arrays.sort(data);
        List<Integer> list = Arrays.asList(data);
        Collections.reverse(list);
        data = list.toArray(new Integer[list.size()]);

        for (int i = 0; i < data.length && i <42; i++) {

            int num = data[i];
            level += num;
            if (num >= 250) {
                ability += 5;
            } else if (200 <= num) {
                ability += 4;
            } else if (140 <= num) {
                ability += 3;
            } else if (100 <= num) {
                ability += 2;
            } else if(60<= num){
                ability += 1;
            }
        }
        System.out.println(level + " " + ability);
    }
}
