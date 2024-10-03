package edu.wit.cs.comp1000;

import java.util.Scanner;

// TODO: document this class
public class PA2a {

	// TODO: document this function
	public static void main(String[] args) {
		int intput1 = 0, intput2 = 0, intput3 = 0, intput4 = 0, intput5 = 0;
		int posNum = 0, negNum = 0;
		int posSum = 0, negSum = 0, totalSum = 0;
		double posAvg = 0, negAvg = 0, totalAvg;
		
		Scanner input = new Scanner(System.in);
		
		//Gets user inputs, then applies them to variables
		System.out.printf("Enter five whole numbers: ");
		intput1 = input.nextInt();
		intput2 = input.nextInt();
		intput3 = input.nextInt();
		intput4 = input.nextInt();
		intput5 = input.nextInt();
		
		//finds out how many values are positive
		if(intput1 > 0) 
		{
			posNum++;
			posSum += intput1;
		}
		if(intput2 > 0) 
		{
			posNum++;
			posSum += intput2;
		}
		if(intput3 > 0) 
		{
			posNum++;
			posSum += intput3;
		}
		if(intput4 > 0) 
		{
			posNum++;
			posSum += intput4;
		}
		if(intput5 > 0) 
		{
			posNum++;
			posSum += intput5;
		}
		
		//finds out how many values are negative
		if(intput1 <= 0)
		{
			negNum++;
			negSum += intput1;
		}
		if(intput2 <= 0)
		{
			negNum++;
			negSum += intput2;
		}
		if(intput3 <= 0) 
		{
			negNum++;
			negSum += intput3;
		}
		if(intput4 <= 0)
		{
			negNum++;
			negSum += intput4;
		}
		if(intput5 <= 0)
		{
			negNum++;
			negSum += intput5;
		}
		
		totalSum = posSum + negSum;
		
		if(posNum > 0)
		{
			posAvg = (double)posSum / posNum;
		}
		else posAvg = 0;
		
		if(negNum > 0)
		{
			negAvg = (double)negSum / negNum;
		}
		else negAvg = 0;
		
		totalAvg = (double)totalSum / 5;
		
		if(posNum != 1)
		{
			System.out.printf("The sum of the %d positive numbers: %d%n", posNum, posSum);
		}
		else
		{
			System.out.printf("The sum of the %d positive number: %d%n", posNum, posSum);
		}
		
		if(negNum != 1)
		{
			System.out.printf("The sum of the %d non-positive numbers: %d%n", negNum, negSum);
		}
		else
		{
			System.out.printf("The sum of the %d non-positive number: %d%n", negNum, negSum);
		}
		
		System.out.printf("The sum of the 5 numbers: %d\n", totalSum);
		
		if(posNum != 1)
		{
			System.out.printf("The average of the %d positive numbers: %.2f%n", posNum, posAvg);
		}
		else
		{
			System.out.printf("The average of the %d positive number: %.2f%n", posNum, posAvg);
		}
		
		if(negNum != 1)
		{
			System.out.printf("The average of the %d non-positive numbers: %.2f%n", negNum, negAvg);
		}
		else
		{
			System.out.printf("The average of the %d non-positive number: %.2f%n", negNum, negAvg);
		}
		System.out.printf("The average of the 5 numbers: %.2f%n", totalAvg);
		
		input.close();
	}

}
