import java.util.Scanner;

public class IT26102230Lab9Q4{
	
	public static double calcFinalMark(double assignmentMark, double examPaperMark){
		
		return (assignmentMark * 0.3 + examPaperMark * 0.7);
		
	}
	
	public static char findGrades(double finalMark){
		
		if (finalMark >= 75){
			
			return 'A';
			
		}
		else if (finalMark >= 60){
			
			return 'B';
			
		}
		else if (finalMark >= 50){
			
			return 'C';
		}
		else{
			
			return 'F';
		}
		
	}
	
	public static void printDetails(String name, double finalMark, char grade){
		
		System.out.println(name + "\t\t" + String.format("%.2f" , finalMark) + "\t\t" + grade);
		
	}
	
	public static void main(String[] args){
		
		String names[] = new String[5];
		double assignmentMark[] = new double[5];
		double examPaperMark[] = new double[5];
		double finalMark[] = new double[5];
		char grade[] = new char[5];
		
		Scanner lookfor = new Scanner(System.in);
		
		for(int counter = 0; counter < 5; counter++){
			
			System.out.print("Enter Name of Student " + (counter + 1) + ": ");
			names[counter] = lookfor.nextLine();
			
			System.out.print("Enter Assignment Mark (Out of 100) for " + names[counter] + ": ");
			assignmentMark[counter] = lookfor.nextDouble();
			
			System.out.print("Enter Exam Paper Mark (Out of 100) for " + names[counter] + ": ");
			examPaperMark[counter] = lookfor.nextDouble();
			lookfor.nextLine();
			
			finalMark[counter] = calcFinalMark(assignmentMark[counter], examPaperMark[counter]);
			grade[counter] = findGrades(finalMark[counter]);
			
			System.out.println();
			
		}
		
		System.out.println("Name\t\tFinal Mark\tGrade");
		
		for(int counter = 0; counter < 5; counter++){
			
			printDetails(names[counter], finalMark[counter], grade[counter]);
			
		}
	}
}