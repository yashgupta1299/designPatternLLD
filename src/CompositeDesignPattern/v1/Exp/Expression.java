package CompositeDesignPattern.v1.Exp;

import CompositeDesignPattern.v1.Operation;

public class Expression implements AirthmeticExpression{
    AirthmeticExpression left;
    AirthmeticExpression right;
    Operation operation;
    public Expression(AirthmeticExpression left, AirthmeticExpression right, Operation operation){
        this.left = left;
        this.right = right;
        this.operation = operation;
    }
    
    @Override
    public int evaluate(){
        int res=0;
        if(operation == Operation.ADD){
            res = left.evaluate() + right.evaluate();

        }else if(operation == Operation.DIVIDE){
            res = left.evaluate() / right.evaluate();

        }else if(operation == Operation.MULTIPLY){
            res = left.evaluate() * right.evaluate();

        }else{
            res = left.evaluate() - right.evaluate();
        }
        return res;
    }
}