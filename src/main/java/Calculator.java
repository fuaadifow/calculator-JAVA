public class Calculator {
    private String expression; //Whole expression
    private char operator; //Operator
    private int operand1; //First operand
    private int operand2; //Second Operand

    //Set expression
    public void setExpression(String s) {
        this.expression = s;
    }

    public boolean verify() {
        String[] parts = expression.split(" "); //Divide expression into parts by space
        if (parts.length != 3) return false; //If there are not 3 parts
        try {
            operand1 = Integer.parseInt(parts[0]); //First part will be operand 1. Convert it into integer
            operand2 = Integer.parseInt(parts[2]);//Third part will be operand 2. Convert it into integer
            //Second part will be operator. Check and assign which operator is used
            if (parts[1].equals("+")) operator = '+';
            else if (parts[1].equals("-")) operator = '-';
            else if (parts[1].equals("/")) operator = '/';
            else if (parts[1].equals("*")) operator = '*';
            else return false; //If it is not a valid operator

            if (operator == '/' && operand2 == 0) return false;    //Check the condition of divide by zero
        } catch (NumberFormatException e) { //If first and third parts are not integers there will be runtime exception
            return false;
        }

        return true; //Return true if everything is fine

    }

    //Getters
    public String getExpression() {
        return expression;
    }

    public char getOperator() {
        return operator;
    }

    public int getOperand1() {
        return operand1;
    }

    public int getOperand2() {
        return operand2;
    }

    //Evaluate Expression
    public int evaluate() {
        if (operator == '+') return operand1 + operand2;//If operator is +
        if (operator == '-') return operand1 - operand2;//If operator is -
        if (operator == '/') return operand1 / operand2;//If operator is /
        if (operator == '*') return operand1 * operand2;//If operator is *
        return -1;
    }
}






