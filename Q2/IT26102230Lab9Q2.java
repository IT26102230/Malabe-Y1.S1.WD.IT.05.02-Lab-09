import java.util.Scanner;

public class IT26102230Lab9Q2{
	
	public static double circleArea(double radius){
		
		return Math.PI * radius * radius;
		
	}
	
	public static void main(String[] args){
		
		double radius;
		
		Scanner lookfor = new Scanner(System.in);
		
		System.out.print("Enter the radius of the circle: ");
		radius = lookfor.nextDouble();
		
		double area = circleArea(radius);
		
		System.out.print("The area of the circle with radius " + radius + " is : " + area);
		
		lookfor.close();
	}	
}