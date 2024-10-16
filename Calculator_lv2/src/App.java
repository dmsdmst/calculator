import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int firstNum, secondNum, returnNum = 0;
        String sign;
        String exit = "?";

        calculator cal = new calculator();

        while(exit.equals("?")) {
            Scanner scan = new Scanner(System.in);
            System.out.println("계산할 두 개의 양의 정수를 입력하세요: ");

            firstNum = scan.nextInt();
            secondNum = scan.nextInt();

            System.out.println("사칙연산 기호를 입력해주세요: ");

            sign = scan.next();


            cal.calcul(firstNum, secondNum, sign);

            System.out.println(cal.getResult(firstNum+sign+secondNum));

            System.out.println("다른 계산을 하려면 ?를 입력해주세요");
            exit = scan.next();
        }




    }
}
