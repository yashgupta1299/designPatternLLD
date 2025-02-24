package CompositeDesignPattern.v1;

import CompositeDesignPattern.v1.Exp.Number;
import CompositeDesignPattern.v1.Exp.AirthmeticExpression;
import CompositeDesignPattern.v1.Exp.Expression;

/* 
      +

 1        *

      2       3
*/

public class Main {

    public static void main(String []args){
        AirthmeticExpression one = new Number(1);
        AirthmeticExpression two = new Number(2);
        AirthmeticExpression three = new Number(3);

        AirthmeticExpression multiplyExpression = new Expression(two, three, Operation.MULTIPLY);
        AirthmeticExpression parentExpression = new Expression(one, multiplyExpression, Operation.ADD);

        System.out.println(parentExpression.evaluate());
    }
}



