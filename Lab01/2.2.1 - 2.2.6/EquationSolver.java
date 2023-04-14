import java.util.Scanner;

public class EquationSolver {
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		
		//Get information about the equation
		System.out.print("Press 0 for Linear Equations, or press 1 for Quadratic Equation: ";
		byte kindOfEquation = input.nextByte();
		
		//For the Linear Equation with 2 variables
		if (kindOfEquation = 0) {
			
			