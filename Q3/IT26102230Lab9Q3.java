import java.util.Scanner;

public class IT26102230Lab9Q3{
	
	public static int add(int num1, int num2){
		return num1 + num2;
	}
	
	public static int multiply(int num1, int num2){
		return num1 * num2;
	}
	
	public static int square(int num){
		return num*num;
	}
	
	public static void main(String[] args){
		
		int resultA = square( ( add( multiply(3,4) , multiply(5,7) ) ) );
		int resultB = add( square(add(4,7)) , square(add(8,3)) );
		
		System.out.println("Result of (3 * 4 + 5 * 7)\u00B2\t: " + resultA);
		System.out.println("Result of (4 + 7)\u00B2 + (8 + 3)\u00B2\t: " + resultB);
	}
}