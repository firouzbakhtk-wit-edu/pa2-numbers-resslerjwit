package edu.wit.cs.comp1000;

import java.util.Scanner;

// TODO: document this class
public class PA2b {

	// TODO: document this function
	public static void main(String[] args) {
		double intput1 = 0, intput2 = 0, intput3 = 0, d = 0;
		double root1 = 0, root2 = 0;
		
		Scanner input = new Scanner(System.in);
		
		//Gets user inputs, then applies them to variables
		System.out.printf("Enter a b c: ");
		intput1 = input.nextDouble();
		intput2 = input.nextDouble();
		intput3 = input.nextDouble();
		
		d = (intput2 * intput2) - (4*(intput1)*(intput3));
		
		if(d > 0)
		{
			root1 = ((-1 * intput2) + Math.sqrt(d))/(2 * intput1);
			root2 = ((-1 * intput2) - Math.sqrt(d))/(2 * intput1);
			
			if(root1 > root2)
			{
				double stored = root1;
				root1 = root2;
				root2 = stored;
			}
			System.out.printf("Roots: %.2f, %.2f%n", root1, root2);
		}
		else if(d == 0)
		{
			root1 = ((-1 * intput2) / (2 * intput1));
			System.out.printf("Root: %.2f%n", root1);
		}
		else
		{
			System.out.printf("Roots: imaginary%n");
		}
	}

}
