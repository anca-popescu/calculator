package calculator;

import java.util.Scanner;
import org.tinylog.Logger;

class MyException extends Exception {
    public MyException(String s) {
        Logger.error("Not between 1-9");
    }
}
public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Logger.info("Insert type of operation: ");
        Scanner scanner = new Scanner(System.in);
        String operation = scanner.nextLine();
        Logger.info("Insert first number: ");
        double a = scanner.nextDouble();
        Logger.info("Insert second number: ");
        double b = scanner.nextDouble();
        try
        {
            if ( b < 1 || b > 9) {
                throw new MyException("Not between 1 - 9");
            }
            System.out.println(calculator.calculate(operation, a, b));
        }
          catch (MyException ex) {
            System.out.println("Caught");
        } catch (Exception e) {
            e.printStackTrace();
        }

        //try catch for calculate method only

        //TODO: Inlocuit String-uri cu ENUM/Constanta ,Exception (imi propun sa am numere intre 1 si 10), Logging,
        // *Unit Testing, Pas 2: *Maven, Pas 3: Jenkins, Pas 4: *Spring
    }
}
