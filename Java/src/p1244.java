import java.util.Scanner;

public class p1244 {

    public static void lightOnOff(int sex, int switchCount, int[] data) {
        switch(sex) {
            case 1 :
                for(int i = switchCount; i < data.length; i+=switchCount) {
                    if(data[i]==1) {
                        data[i] = 0;
                    } else {
                        data[i] = 1;
                    }
                }
                break;
            case 2 :
                int mid = switchCount;
                if(data[mid] == 1) {
                    data[mid] = 0;
                } else {
                    data[mid] = 1;
                }
                int index = 1;
                while ((mid - index) > 0 && (mid + index) < data.length) {
                    if(data[mid-index] == data[mid+index]) {
                        data[mid-index] = data[mid-index] == 0 ? 1 : 0;
                        data[mid+index] = data[mid+index] == 0 ? 1 : 0;

                    } else{
                        break;
                    }
                    index+=1;
                }
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.nextLine());
        String[] input = sc.nextLine().split(" ");
        int[] data = new int[N+1];
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= N; i++) {
            data[i] = Integer.parseInt(input[i-1]);
        }

        int M = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < M; i++) {
            input = sc.nextLine().split(" ");
            int sex = Integer.parseInt(input[0]);
            int switchCount = Integer.parseInt(input[1]);
            lightOnOff(sex, switchCount, data);
        }

        for(int i = 1; i <= N; i++) {
            sb.append(data[i]);
            if(i % 20 == 0) {
                sb.append("\n");
            } else {
                sb.append(" ");
            }
        }

        System.out.println(sb.toString());
    }
}
