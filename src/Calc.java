import arythm.arythm_operation;
import enter.numbers;
import welcome.hello;

import static enter.numbers.getInt;
import static enter.operation.getOperation;

public class Calc {
    public static void main(String[] args) {
        hello.hello();
        int num1 = numbers.getInt();
        int num2 = numbers.getInt();
        char operation = getOperation();
        int result = arythm_operation.calc(num1,num2,operation);
        System.out.println("Результат операции: "+result);
    }
}
