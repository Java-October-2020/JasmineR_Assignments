public class Calculator{
    private double operandOne;
    private String operation;
    private double operandTwo;
    private double result;

    public Calculator(){

    }
    public Calculator(double operandOne, String operation, double operandTwo, double result){
        this.operandOne = operandOne;
        this.operation = operation;
        this.operandTwo = operandTwo;
        this.result = result;
    }
    public String getOperation(){
        return operation; 
}
public String getOperandOne(){
        return operandOne;
 }
public String getOperandTwo(){
        return operandTwo;
}
public void setOperation(String operation){
    this.operation = operation;
}

public void setOperandOne(double number){
    this.operandOne = number;
}

public void setOperandTwo(double number){
    this.operandTwo = number;
}

public void performOperation(){
    if(operation == "+"){
        this.result = this.operandOne + this.operandTwo;
    }

    else if(operation == "-"){
        this.result = this.operandOne - this.operandTwo;
    }

    else {
        System.out.println("please set operand to '+' or '-' ");
    }
}

    public double getResults(){
        return performOperation();
    }
} 
