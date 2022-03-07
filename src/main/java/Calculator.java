package calculator;

import java.util.HashMap;

public class Calculator {

    private static final String MULTIPLICATION  = "multiplication";
    private static final String ADDITION  = "addition";
    private static final String SUBSTRACTION  = "substraction";
    private static final String DIVISION  = "division";

    private Operation addition = new Addition();
    private Operation substraction = new Substraction();
    private Operation multiplication = new Multiplication();
    private Operation division = new Division();

    private HashMap<String, Operation> ops = new HashMap();

//    public Calculator(Addition addition, Substraction substraction, Multiplication multiplication, Division division) {
//        this.addition = addition;
//        this.substraction = substraction;
//        this.multiplication = multiplication;
//        this.division = division;
//    }

    public Calculator() {
        this.ops.put(ADDITION, addition);
        this.ops.put(MULTIPLICATION, multiplication);
        this.ops.put(SUBSTRACTION, substraction);
        this.ops.put(DIVISION, division);
    }

    public double calculate(String operation, double a, double b) throws Exception {
        //aici throws exception
        if(a > 9) {
            throw new Exception();
        }
        double result = 0;
        result = ops.get(operation).execute(a,b);
//        switch (operation) {
//            case ADDITION:
//                result = getAddition().execute(a, b);
//                break;
//            case SUBSTRACTION:
//                result = getSubstraction().execute(a, b);
//                break;
//            case MULTIPLICATION:
//                result = getMultiplication().execute(a, b);
//                break;
//            case DIVISION:
//                result = getDivision().execute(a, b);
//                break;
//        }
        return result;
    }

    private Operation getAddition() {
        return addition;
    }

    private Operation getSubstraction() {
        return substraction;
    }

    private Operation getMultiplication() {
        return multiplication;
    }

    private Operation getDivision() {
        return division;
    }
}
