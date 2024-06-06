import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class p2304 {
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.nextLine());
        Column[] data = new Column[N];
        int max = 0;
        int maxIndex = 0;
        for(int i = 0; i < N; i++) {
            String[] input = sc.nextLine().split(" ");
            int index = Integer.parseInt(input[0]);
            int height = Integer.parseInt(input[1]);

            if(max < height) {
                max = height;
                maxIndex = index;
            }

            data[i] = new Column(index, height);
        }

        Arrays.sort(data, new Comparator<Column>() {
            @Override
            public int compare(Column o1, Column o2) {
                if(o1.getIndex() < o2.getIndex())
                    return -1;
                else if(o1.getIndex() > o2.getIndex())
                    return 1;
                else //호출되면 안된다.
                    return 0;
            }
        });
        // 가장 큰 부분을 기준으로 좌우로 나눈다.
        Column before = data[0];
        int sum = 0;
        for(int i = 1; i < maxIndex; i++) {
            if(before.getHeight() < data[i].getHeight()) {
                sum += (data[i].getIndex() - before.getIndex()) * before.height;
                before = data[i];
            }
        }

        //오른쪽
        for(int i = maxIndex; i < N; i++) {
            if(before.getHeight() < data[i].getHeight()) {
                sum += (data[i].getIndex() - before.getIndex()) * before.height;
                before = data[i];
            }

            if(i == N-1) {
                sum += (data[i].getIndex() - before.index) * data[i].height;
            }
        }

        System.out.println(sum);
    }

    public static class Column {
        int index;
        int height;

        public Column(int index, int height) {
            this.index = index;
            this.height = height;
        }

        public int getIndex() {
            return index;
        }

        public int getHeight() {
            return height;
        }

        @Override
        public String toString() {
            return "Column{" +
                    "index=" + index +
                    ", height=" + height +
                    '}';
        }
    }
}
