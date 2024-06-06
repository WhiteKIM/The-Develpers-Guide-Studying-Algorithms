public class kmp_example {
    public static int[] table;

    public static void createTable(String str, int strlen) {
        int j;

        table = new int[strlen+1];
        table[0] = -1;
        j = 0;

        for(int i=1; i < strlen; i++) {
            while (str.charAt(j) != str.charAt(i) && j > 0) {
                j = table[j];
            }
            
            if(str.charAt(j) == str.charAt(i)) {
                table[i+1] = ++j;
            }
        }
    }

    public static void KMP(String str, String pattern) {
        int patternLen = pattern.length();
        int strLen = str.length();
        int distance = 0;
        int idx;
        int cnt = 0;
        int findFlag = 0;
        
        createTable(str, strLen);
        
        while (true) {
            idx = 0;
            if((idx+distance) + patternLen > strLen)
                break;
            
            while (str.charAt(idx+distance) == pattern.charAt(cnt)) {
                cnt++;
                idx++;
                
                if(cnt == patternLen) {
                    System.out.println("패턴 찾기 : "+distance+1);
                    findFlag = 1;
                    break;
                }
            }
            distance = distance + (cnt - table[cnt]);
            cnt = 0;
        }
        if(findFlag == 0)
            System.out.println("패턴 없음");
    }

    public static void main(String[] args) {
        String str = "ABAABACABAACCABACABACABAACABACABAAC";
        String pattern = "ABACABAAC";

        KMP(str, pattern);
    }
}
