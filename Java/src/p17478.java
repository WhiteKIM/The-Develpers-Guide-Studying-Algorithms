import java.util.Scanner;

/*
* 백준 17478
* 재귀함수가 뭔가요
* */
public class p17478 {
    private static String answer[] = {"\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n",
            "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n",
            "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"\n"};

    private static String question = "\"재귀함수가 뭔가요?\"";
    private static String once = "어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.";
    private static String comment = "라고 답변하였지.";
    private static String correct = "\"재귀함수는 자기 자신을 호출하는 함수라네\"";

    public static String addHyphen(int num) {
        String result = "";
        if(num==0)
            return result;
        else {
            for(int i = 0; i < num; i++) {
                result = "____"+result;
            }
            return result;
        }
    }

    public static void whatisRecurisve(int num,String answer[] ,String question, String comment, String correct, int last) {
        if(num == last) {
            System.out.println(addHyphen(num)+question);
            System.out.println(addHyphen(num)+correct);
            System.out.println(addHyphen(num)+comment);
            return;
        }

        System.out.println(addHyphen(num)+question);
        for(int j =0; j < answer.length; j++) {
            System.out.print(addHyphen(num)+answer[j]);
        }
        whatisRecurisve(num+1,answer, question, comment, correct, last);
        System.out.println(addHyphen(num)+comment);
    }

    public static void main(String[] args) {
        int num  = 0;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println(once);
        whatisRecurisve(0, answer, question, comment, correct, num);
    }

}
