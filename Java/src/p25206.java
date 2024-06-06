import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class p25206 {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static float calculate(float myPoint,String grade) {
        float point = 0.0F;
        if(grade.equals("A+")) {
            point = 4.5F;
        } else if(grade.equals("A0")) {
            point = 4.0F;
        } else if(grade.equals("B+")) {
            point = 3.5F;
        } else if(grade.equals("B0")) {
            point = 3.0F;
        } else if(grade.equals("C+")) {
            point = 2.5F;
        } else if(grade.equals("C0")) {
            point = 2.0F;
        } else if(grade.equals("D+")) {
            point = 1.5F;
        } else if(grade.equals("D0")) {
            point = 1.0F;
        } else {
            point = 0.0F;
        }

        return (point * myPoint);
    }

    public static void main(String[] args) throws IOException {
        float average = 0;
        float sum = 0;
        for(int i = 0; i < 20; i++) {
            String[] input = br.readLine().split(" ");
            float point = Float.parseFloat(input[1]);
            String grade = input[2];
            if(!grade.equals("P")) {
                average += calculate(point, grade);
                sum += point;
            }
        }

        float result = average / sum;
        System.out.println(result);
    }
}
