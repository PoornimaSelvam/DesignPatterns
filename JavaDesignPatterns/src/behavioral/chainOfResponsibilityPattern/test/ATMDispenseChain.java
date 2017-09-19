package behavioral.chainOfResponsibilityPattern.test;

import java.util.Scanner;

import behavioral.chainOfResponsibilityPattern.model.Currency;
import behavioral.chainOfResponsibilityPattern.model.CurrencyDispenser;
import behavioral.chainOfResponsibilityPattern.model.DispenseChain;
import behavioral.chainOfResponsibilityPattern.model.Rupee10Dispenser;
import behavioral.chainOfResponsibilityPattern.model.Rupee20Dispenser;
import behavioral.chainOfResponsibilityPattern.model.Rupee50Dispenser;

/**
 * Chain of responsibility pattern is used to achieve loose coupling in software design where a request from client is passed to a chain of objects to process them. 
 * Then the object in the chain will decide themselves who will be processing the request and whether the request is required to be sent to the next object in the chain or not.
 * 
 * Example:
 * This is a very important step and we should create the chain carefully, otherwise a processor might not be getting any request at all. 
 * For example, in our implementation if we keep the first processor chain as Rupee10Dispenser and then Rupee20Dispenser, 
 * then the request will never be forwarded to the second processor and the chain will become useless.
 * 
 * 1. Client doesn’t know which part of the chain will be processing the request and it will send the request to the first object in the chain. 
 * 	  For example, in our program ATMDispenseChain is unaware of who is processing the request to dispense the entered amount.
 * 2. Each object in the chain will have it’s own implementation to process the request, either full or partial or to send it to the next object in the chain.
 * 3. Every object in the chain should have reference to the next object in chain to forward the request to, its achieved by java composition.
 * 4. Creating the chain carefully is very important otherwise there might be a case that the request will never be forwarded to a particular processor or 
 *    there are no objects in the chain who are able to handle the request. In my implementation, I have added the check for the user entered amount 
 *    to make sure it gets processed fully by all the processors but we might not check it and throw exception if the request reaches the last object and 
 *    there are no further objects in the chain to forward the request to. This is a design decision.
 * 5. Chain of Responsibility design pattern is good to achieve lose coupling but it comes with the trade-off of having a lot of implementation classes and 
 *    maintenance problems if most of the code is common in all the implementations.
 *    
 *   eg. try/catch block 
 *   java.util.logging.Logger#log()
 *   javax.servlet.Filter#doFilter()
 * 
 */
public class ATMDispenseChain {
	
	public static void main(String[] args) {
		
		CurrencyDispenser dispenser = new CurrencyDispenser();
		//try-with resource java 7 feature
		try(final Scanner scanner = new Scanner(System.in)) 
		{
			String flag = "Y";
			while ("Y".equalsIgnoreCase(flag)) 
			{
				System.out.println("Enter amount to dispense");
				int amount = scanner.nextInt();
				if(amount % 10 != 0){
					System.out.println("Amount should be in multiples of 10s.");
					break;
				} else {
					dispenser.dispenseAmount(amount);
					System.out.println("Do you wish to continue? (Y|N)");
					flag = scanner.next();
				}
			}
		} 
		finally {
			System.out.println("Program ending");
		}
	}

}
