import java.util.HashSet;
import java.util.Scanner;

public class p4659 {
    public static HashSet<Character> vowel = new HashSet<>();
    public static HashSet<Character> consonant = new HashSet<>();

    public static boolean mustHave(String str) {
        for(int i = 0; i < str.length(); i++) {
            if(vowel.contains(str.charAt(i))) {
//                System.out.println(str+" : true");
                return true;
            }
        }
//        System.out.println(str+" : false");
        return false;
    }

    public static boolean sameContinue(String str) {
        for(int i = 0; i < str.length(); i++) {
            if(i+1 < str.length()) {
                for(int j = i; j < i+2; j++) {
                    if(str.charAt(i) == str.charAt(j)) {
                        if(str.charAt(i) != 'e' || str.charAt(i) != 'o') {
//                            System.out.println(str + " : false");
                            return false;
                        }
                    }
                }
            }
        }
//        System.out.println(str+" : true");
        return true;
    }

    public static boolean overContinue(String str) {
        for(int i = 0; i < str.length(); i++) {
            int count = 1;
            if(i+2 < str.length()) {
                for(int j = i; j < i+3; j++) {
                    if((vowel.contains(str.charAt(i)) && !vowel.contains(str.charAt(j))) || (!vowel.contains(str.charAt(i)) && vowel.contains(str.charAt(j)))) {
                        count = 1;
                        break;
                    } else {
                        count++;
                    }
                }
            }
            if(count==3) {
//                System.out.println(str+" : false");
                return false;
            }
        }
//        System.out.println(str+" : true");
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        vowel.add('a');
        vowel.add('e');
        vowel.add('i');
        vowel.add('o');
        vowel.add('u');
        for(int i = 0; i < 26; i++) {
            char c =  (char)(97 + i);
            if(!vowel.contains(c))
                consonant.add(c);
        }
        while (true) {
            String input = sc.nextLine();
            if(input.equals("end")) {
                break;
            }

            if(mustHave(input) && sameContinue(input) && overContinue(input))
                sb.append("<").append(input).append(">").append(" ").append("is").append(" ").append("acceptable.").append("\n");
            else
                sb.append("<").append(input).append(">").append(" ").append("is").append(" ").append("not").append(" ").append("acceptable.").append("\n");

        }
        System.out.println(sb.toString());
    }
}
