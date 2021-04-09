package StrategyPattern;

public class Query {
    private Calculator calc;
    public Query(Calculator calc){
             this.calc = calc;
    }
    
    public float executeStrategy(float num1, float num2){
    	return calc.calculation(num1, num2);
    }
}