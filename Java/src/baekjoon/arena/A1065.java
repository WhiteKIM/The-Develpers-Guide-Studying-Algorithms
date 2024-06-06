package baekjoon.arena;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A1065 {
    public static void main(String[] args) {
        Map<Integer, String> data =new HashMap<>();

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5; i++) {
            String str = sc.nextLine();
            int num = Integer.parseInt(str);

            if (data.containsKey(num)) {
                data.remove(num);
            } else {
                data.put(num, str);
            }
        }

        for (Integer integer : data.keySet()) {
            System.out.println(integer);
        }
    }
}
