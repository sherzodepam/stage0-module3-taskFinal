package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int number1= number%10;
        number/=10;
        int number2=number%10;
        number/=10;
        int number3=number%10;
        int number4=number%10;
        System.out.println(number1+number2+number3+number4);
    }
}
