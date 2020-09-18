
public class Operation {

    public Operation() {
    }

    int operation(int operand1, int operand2, String operation){
        int result=0;
        switch(operation.charAt(0)){
            case '+': result = operand1+operand2; break;
            case '-': result = operand1-operand2; break;
            case '*': result = operand1*operand2; break;
            case '/': result = operand1/operand2; break;
            default: try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("Неверные операнды или операция");
            }
        }
        return result;
    }
}

