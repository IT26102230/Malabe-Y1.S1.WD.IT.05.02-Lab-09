import java.util.Scanner;

public class IT26102230Lab9Q1{
	
	public static void main(String[] args){
		
		double a, b, c, root1, root2;
		
		Scanner lookfor = new Scanner(System.in);
		
		System.out.print("Enter Value a: ");
		a = lookfor.nextDouble();
		
		System.out.print("Enter Value b: ");
		b = lookfor.nextDouble();
		
		System.out.print("Enter Value c: ");
		c = lookfor.nextDouble();
		
		if(Math.pow(b,2) - 4*a*c > 0){
			
			System.out.println("\nRoots are real and different :");
			
		}
		else if(Math.pow(b,2) - 4*a*c == 0){
			
			System.out.println("\nRoots are real and similar :");
		}
		else{
			
			System.out.println("\nRoots are not real.");
			return;
			
		}
		
		root1 = (-b + Math.sqrt(Math.pow(b,2) - 4 * a * c))/(2*a);
		root2 = (-b - Math.sqrt(Math.pow(b,2) - 4 * a * c))/(2*a);
		
		System.out.println("Root 1: " + String.format("%.2f" , root1));
		System.out.println("Root 2: " + String.format("%.2f" , root2));
		
		System.out.println();
		
		lookfor.close();
	}
}