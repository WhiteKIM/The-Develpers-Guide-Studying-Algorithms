import java.util.Scanner;

public class p30087 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++) {
            String str = sc.nextLine();

            if(str.equals("Algorithm")) {
                sb.append("204").append("\n");
            } else if(str.equals("DataAnalysis")) {
                sb.append("207").append("\n");
            } else if(str.equals("ArtificialIntelligence")) {
                sb.append("302").append("\n");
            } else if(str.equals("CyberSecurity")) {
                sb.append("B101").append("\n");
            } else if(str.equals("Network")) {
                sb.append("303").append("\n");
            } else if(str.equals("Startup")) {
                sb.append("501").append("\n");
            } else {
                sb.append("105").append("\n");
            }
        }
        System.out.println(sb.toString());
    }
}
