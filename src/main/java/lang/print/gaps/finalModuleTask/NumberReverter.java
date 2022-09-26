package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int n=number/10;//44
        System.out.println(((number%10)*100)+((n%10)*10)+n/10);
    }
}
