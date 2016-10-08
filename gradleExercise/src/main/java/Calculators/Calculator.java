package Calculators;

/**
 * Created by syono on 2016-10-08.
 */
public class Calculator {
    String msg = "";

    public Calculator() {
    }

    public Calculator(String msg) {
        this.msg = msg;
    }

    public int sum(Integer num1, Integer num2) {
        return num1 + num2;
    }

    public static int staticSum(int num1, int num2){
        return num1 + num2;
    }
}
