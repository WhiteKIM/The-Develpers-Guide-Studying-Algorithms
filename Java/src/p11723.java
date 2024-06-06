import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class p11723 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        int T;
        T = Integer.parseInt(br.readLine());
        ArrayList<Integer> data = new ArrayList<>();

        for(int i = 0; i < T; i++) {
            String[] input = br.readLine().split(" ");
            String command = input[0];
            int num = -1;
            if(input.length > 1)
                num = Integer.parseInt(input[1]);

            command_input(command, num, data);
        }
        System.out.println(sb.toString());
    }

    private static void command_input(String command, int num, ArrayList<Integer> data) {
        if(command.equals("add")) {
            data.add(num);
        }
        else if(command.equals("check")) {
            boolean check = false;
            for(int x : data) {
                if(x == num) {
                    check = true;
                    break;
                }
            }
            if(check) {
                sb.append(1).append("\n");
            } else {
                sb.append(0).append("\n");
            }
        } else if(command.equals("remove")) {
            for(int i = 0; i < data.size(); i++) {
                if(data.get(i) == num) {
                    data.remove(i);
                    break;
                }
            }
        } else if(command.equals("toggle")) {
            if(data.contains(num)) {
                for(int i = 0; i < data.size(); i++) {
                    if(data.get(i) == num) {
                        data.remove(i);
                        break;
                    }
                }
            } else {
                data.add(num);
            }
        } else if(command.equals("all")) {
            data.clear();
            for(int i = 1; i <= 20; i++)
                data.add(i);
        } else if (command.equals("empty")) {
            data.clear();
        }
    }
}
