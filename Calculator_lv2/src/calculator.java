import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class calculator {

    private ArrayList<Integer> result= new ArrayList<>();
    public int calcul(int firstNum, int secondNum, String sign){
        int returnNum = 0;

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
                result.add(returnNum);
            }
        } else {
            System.out.println("알맞은 사칙연산을 입력해주세요");
        }

        return returnNum;
    }

    public int getResult (){
        return result.getFirst();
    }

    public void setResult (int idx, int value){
        result.set(idx, value);
    }

    public void remove(){
        result.removeFirst();
    }
}
