import arythm.Arythm_operation;
import enter.Numbers;
import welcome.Hello;

import static enter.Numbers.getInt;
import static enter.Operation.getOperation;

public class Calc {
    public static void main(String[] args) {
        Hello.hello();
        int num1 = Numbers.getInt();
        int num2 = Numbers.getInt();
        char operation = getOperation();
        int result = Arythm_operation.calc(num1,num2,operation);
        System.out.println("Результат операции: "+result);
    }
}
