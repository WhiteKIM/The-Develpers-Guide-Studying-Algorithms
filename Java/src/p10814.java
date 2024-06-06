import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class p10814 {
    public static void main(String[] args) {
        int N;
        Scanner sc = new Scanner(System.in);
        ArrayList<Person> personArrayList = new ArrayList<>();
        N = Integer.parseInt(sc.nextLine());

        for(int i = 0; i < N; i++) {
            String[] input = sc.nextLine().split(" ");
            int age = Integer.parseInt(input[0]);
            String name = input[1];
            personArrayList.add(new Person(age, name, i));
        }

        personArrayList.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.age > o2.age) {
                    return 1;
                } else if (o2.age > o1.age) {
                    return -1;
                } else {
                    if (o1.regist < o2.regist) {
                        return -1;
                    } else if (o1.regist > o2.regist) {
                        return 1;
                    } else {
                        return 0;
                    }
                }
            }
        });

        for(Person p : personArrayList) {
            System.out.println(p.toString());
        }
    }

    public static class Person {
        int age;
        String name;
        int regist;

        public Person(int age, String name, int regist) {
            this.age = age;
            this.name = name;
            this.regist = regist;
        }

        @Override
        public String toString() {
            return age + " " + name;
        }
    }
}
