import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class p7568 {
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        N = Integer.parseInt(sc.nextLine());
        Person[] data = new Person[N];
        for(int i = 0; i < N; i++) {
            String[] input = sc.nextLine().split(" ");
            int weight = Integer.parseInt(input[0]);
            int height = Integer.parseInt(input[1]);
            data[i] = new Person(weight, height);
        }


        for(int i = 0; i < N; i++) {
            int rank = 1;
            for(int j = 0; j < N; j++) {
                if(data[i].height < data[j].height && data[i].weight < data[j].weight) {
                    rank++;
                }
            }

            data[i].setRank(rank);
        }

        for(Person p : data) {
            System.out.print(p.getRank()+" ");
        }
    }

    static public class Person {
        int weight;
        int height;

        int rank;

        public void setRank(int rank) {
            this.rank = rank;
        }

        public int getRank() {
            return rank;
        }

        public Person(int weight, int height) {
            this.weight = weight;
            this.height = height;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "weight=" + weight +
                    ", height=" + height +
                    ", rank=" + rank +
                    '}';
        }
    }
}
