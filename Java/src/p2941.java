import java.util.Scanner;

public class p2941 {
    public static int count = 0;

    public static void check(String str) {
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='d') {
                if(i+1 < str.length() && str.charAt(i+1)=='z') {
                    if (i+2 < str.length() && str.charAt(i + 2) == '=') {
                        i = i + 2;
                    }
                } else if(i+1 < str.length() && str.charAt(i+1)=='-') {
                    i+=1;
                }
            } else if(str.charAt(i)=='c') {
                if(i+1 < str.length() && str.charAt(i+1)=='=') {
                    i+=1;
                } else if(i+1 < str.length() && str.charAt(i+1)=='-') {
                    i+=1;
                }
            } else if(str.charAt(i)=='l') {
                if(i+1 < str.length() && str.charAt(i+1)=='j') {
                    i+=1;
                }
            } else if(str.charAt(i)=='n') {
                if(i+1 < str.length() && str.charAt(i+1)=='j') {
                    i+=1;
                }
            } else if(str.charAt(i)=='s') {
                if(i+1 < str.length() && str.charAt(i+1)=='=') {
                    i+=1;
                }
            } else if(str.charAt(i)=='z') {
                if(i+1 < str.length() && str.charAt(i+1)=='=') {
                    i+=1;
                }
            }
            count++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        check(input);
        System.out.println(count);
    }
}
