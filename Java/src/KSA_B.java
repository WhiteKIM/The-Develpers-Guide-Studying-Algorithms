import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class KSA_B {
    public static int[] dx = {-1,1,0,0,-1,-1,1,1};
    public static int[] dy = {0,0,-1, 1, -1, 1, -1, 1};

    public static boolean isBetween(Student student, int x, int y, Student other) {
        int minX = Math.min(student.getX(), x);
        int minY = Math.min(student.getY(), x);
        int maxX = Math.max(student.getX(), y);
        int maxY = Math.max(student.getY(), y);

        if((other.getX() >= minX && other.getX() <= maxX) && (other.getY() >= minY && other.getY() <= maxY))
            return false;
        else
            return true;
    }

    public static void main(String[] args) throws IOException {
        int N;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        N = Integer.parseInt(br.readLine());
        Student[] data = new Student[N];
        for(int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);

            data[i] = new Student(x, y);
        }

        for(int i = 0; i < N; i++) {
            for(int j = i+1; j < N; j++) {
                if(!isBetween(data[i], 0, 0, data[j])) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    static public class Student {
        int X;
        int Y;

        public Student(int x, int y) {
            X = x;
            Y = y;
        }

        public int getX() {
            return X;
        }

        public int getY() {
            return Y;
        }
    }
}
