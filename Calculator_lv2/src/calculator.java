import java.util.HashMap;
import java.util.Map;

public class calculator {

    private Map<String, Integer> result= new HashMap<>();
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
                result.put(firstNum + sign + secondNum,returnNum);
            }
        } else {
            System.out.println("알맞은 사칙연산을 입력해주세요");
        }

        return returnNum;
    }

    public int getResult (String key){
        return result.get(key);
    }

    public void setResult (String key, int value){
        result.put(key, value);
    }
}
