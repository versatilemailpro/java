public class Output {

    public String outputOfSum(double num1, double num2) {
        Sum getSum = new Sum();

        double resultSum = getSum.sumOf(num1, num2);
        return "The Sum is" + resultSum;
    }

    public String outputOfSub(double num1, double num2) {
        Sub getSub = new Sub();
        double resultSub = getSub.subOf(num1, num2);
        return "The Substraction is " + resultSub;
    }

    public String outputOfMul(double num1, double num2) {
        Mul getMul = new Mul();
        double resultMul = getMul.mulOf(num1, num2);
        return "The multiplication is " + resultMul;
    }

    public String outputOfDiv(double num1, double num2) {
        Div getSub = new Div();
        double resultDiv = getSub.divOf(num1, num2);
        return "The Divison is " + resultDiv;
    }

}
