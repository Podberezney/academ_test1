import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {

    int sum(int a, int b) {
        int ResultSum = a + b;
        return ResultSum;
    }

    int sub(int a, int b) {
        int ResultSub = a - b;
        return ResultSub;
    }

    int div(int a, int b) {
        int ResultDiv = a / b;
        return ResultDiv;
    }

    int mult(int a, int b) {
        int ResultMult = a * b;
        return ResultMult;
    }

}

class colculations {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите первое число: ");
        String num1 = reader.readLine();
        System.out.println("Введие знак: ");
        String sing = reader.readLine();
        System.out.println("Введие второе число: ");
        String num2 = reader.readLine();
        int a = Integer.parseInt(num1);
        int b = Integer.parseInt(num2);
        int result = 0;

        Calculator calc = new Calculator();

        if (sing.equals("+")) {
            result = calc.sum(a, b);
        }
        if (sing.equals("-")) {
            result = calc.sub(a, b);
        }
        if (sing.equals("/")) {
            result = calc.div(a, b);
        }
        if (sing.equals("*")) {
            result = calc.mult(a, b);
        }
        System.out.println("Результат равен: " + result);
    }
}