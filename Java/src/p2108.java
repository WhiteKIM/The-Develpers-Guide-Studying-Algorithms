import java.util.*;

public class p2108 {
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.nextLine());
        int[] data = new int[N];
        Map<Integer, Integer> frequency = new HashMap<>();
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(sc.nextLine());
            data[i] = num;
            if(frequency.containsKey(num)) {
                frequency.put(num, frequency.get(num)+1);
            } else {
                frequency.put(num, 1);
            }
            sum+= num;
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        int index = 0;
        int rank = 0;
        int max_frequency = -1;
        List<Integer> keySet = new ArrayList<>(frequency.keySet());
        Collections.sort(keySet);

        for(Integer key : keySet) {
            int num = frequency.get(key);
            if(max_frequency < num) {
                max_frequency = num;
            }
        }

        for(Integer key : keySet) {
            int num = frequency.get(key);
            if(num == max_frequency) {
                index = key;
                rank+=1;

                if(rank == 2) {
                    break;
                }
            }
        }

        Arrays.sort(data);
        int mid = (N-1)/2;
        double avg = (double) sum / N;
        long avg_round = Math.round(avg);
        System.out.println(avg_round);
        System.out.println(data[mid]);
        System.out.println(index);
        System.out.println(max-min);
    }
}
