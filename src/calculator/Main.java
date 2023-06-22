package calculator;

import java.util.*;

public class Main {
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number");
		int firstNumber = scan.nextInt();

		System.out.println("Enter second number");
		int secondNumber = scan.nextInt();
		
        
		CalculatorVO calVO = new CalculatorVO();
		calVO.setFirstNumber(firstNumber); 
		calVO.setSecondNumber(secondNumber);
		
		Calculator cal = new Calculator();
		
		int addResult = cal.add(calVO.getFirstNumber(), calVO.getSecondNumber());
		System.out.println("Addition Result ="+addResult);
		
		int subResult = cal.substract(calVO.getFirstNumber(), calVO.getSecondNumber());
		System.out.println("Subtraction Result ="+subResult);
		
		int mulResult = cal.multiply(calVO.getFirstNumber(), calVO.getSecondNumber());
		System.out.println("Multiplication Result ="+mulResult);
		
		float divResult = cal.divide(calVO.getFirstNumber(), calVO.getSecondNumber());
		System.out.println("Division Result ="+divResult);

	}
}
