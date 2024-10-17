public abstract class ArithmeticCalculator {
    enum OperatorType {
        PLUS("+"){
            public double cal(double first, double second){
                return first+second;
            };
        },MINUS("-"){
            public double cal(double first, double second){
                return first-second;
            };
        },MULTIPLY("*"){
            public double cal(double first, double second){
                return first*second;
            };
        }, DIVIDE("/"){
            public double cal(double first, double second){
                return first/second;
            };
        };

        private String type;
        OperatorType(String type) {
            this.type = type;
        }

    };


    OperatorType plus = OperatorType.PLUS;
    OperatorType minus = OperatorType.MINUS;
    OperatorType multiply = OperatorType.MULTIPLY;
    OperatorType divide = OperatorType.DIVIDE;




    public abstract double cal(double first, double second);
}
