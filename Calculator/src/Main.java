import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int firstNum, secondNum, returnNum = 0;
        String sign;
        String exit = "?";

        while(exit.equals("?")) {
            Scanner scan = new Scanner(System.in);
            System.out.println("계산할 두 개의 양의 정수를 입력하세요: ");

            firstNum = scan.nextInt();
            secondNum = scan.nextInt();

            System.out.println("사칙연산 기호를 입력해주세요: ");

            sign = scan.next();

            if(sign.length()==1&&"+-*/".contains(sign)){
                switch (sign) {
                    case "+":
                        returnNum = firstNum + secondNum;
                        break;
                    case "-":
                        returnNum = firstNum - secondNum;
                        break;
                    case "*":
                        returnNum = firstNum * secondNum;
                        break;
                    case "/":
                        if (secondNum == 0) {
                            System.out.println("0은 나누는 수가 될 수 없습니다");
                            break;
                        }
                        returnNum = firstNum / secondNum;
                        break;
                    default:
                }
                if (sign.equals("/") && secondNum == 0) {
                } else {
                    System.out.println(firstNum + sign + secondNum + "의 결과는 " + returnNum + "입니다");
                }
            } else {
                System.out.println("알맞은 사칙연산을 입력해주세요");
            }

            System.out.println("다른 계산을 하려면 ?를 입력해주세요");
            exit = scan.next();
        }




    }

}