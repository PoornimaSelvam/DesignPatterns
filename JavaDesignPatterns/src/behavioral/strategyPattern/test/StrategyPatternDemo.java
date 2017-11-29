package behavioral.strategyPattern.test;

import behavioral.strategyPattern.model.Context;
import behavioral.strategyPattern.model.OperationAdd;
import behavioral.strategyPattern.model.OperationMultiply;
import behavioral.strategyPattern.model.OperationSubtract;

/**
 * Strategy pattern is used when we have multiple algorithm for a specific task and client decides 
 * the actual implementation to be used at runtime.
 * 
 * We could have used composition to create instance variable for strategies 
 * but we should avoid that as we want the specific strategy to be applied for a particular task. 
 * Same is followed in Collections.sort() and Arrays.sort() method that take comparator as argument.
 * 
 * A good use of the Strategy pattern would be saving files in different formats, 
 * running various sorting algorithms, or file compression.
 *
 */
public class StrategyPatternDemo {
	public static void main(String[] args) {
		Context context = new Context(new OperationAdd());
		System.out.println("10 + 5 = " + context.executeStrategy(10, 5));
		
		context = new Context(new OperationSubtract());
		System.out.println("10 - 5 = " + context.executeStrategy(10, 5));
		
		context = new Context(new OperationMultiply());
		System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
	}
}
