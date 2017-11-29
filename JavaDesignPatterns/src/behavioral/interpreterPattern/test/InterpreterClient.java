package behavioral.interpreterPattern.test;

import behavioral.interpreterPattern.model.Expression;
import behavioral.interpreterPattern.model.IntToBinaryExpression;
import behavioral.interpreterPattern.model.IntToHexExpression;
import behavioral.interpreterPattern.model.InterpreterContext;

/**
 * Interpreter pattern is used to defines a grammatical representation for a language and 
 * provides an interpreter to deal with this grammar.
 * 
 * This pattern involves implementing an expression interface which tells to interpret a particular context.
 * 
 * The best example of interpreter design pattern is java compiler that interprets the java source code into byte code that is understandable by JVM. 
 * Google Translator is also an example of interpreter pattern where the input can be in any language and we can get the output interpreted in another language.
 *
 * java.util.Pattern and subclasses of java.text.Format are some of the examples of interpreter pattern used in JDK.
 *
 */
public class InterpreterClient {
	public InterpreterContext ic;

	public InterpreterClient(InterpreterContext ic) {
		this.ic = ic;
	}
	
	public String interpret(String str)
	{
		Expression exp = null;

		//create rules for expression
		if(str.contains("Hexadecimal")){
			exp = new IntToHexExpression(Integer.parseInt(str.substring(0, str.indexOf(" "))));
		} else if(str.contains("Binary")){
			exp = new IntToBinaryExpression(Integer.parseInt(str.substring(0, str.indexOf(" "))));
		} else 
			return str;
		return exp.interpret(ic);
	}
	
	public static void main(String[] args) {
		String str1 = "28 in Binary";
		String str2 = "28 in Hexadecimal";
		
		InterpreterClient interpreterClient= new InterpreterClient(new InterpreterContext());
		
		System.out.println(str1 + "= " + interpreterClient.interpret(str1));
		System.out.println(str2 + "= " + interpreterClient.interpret(str2));
	}
}
