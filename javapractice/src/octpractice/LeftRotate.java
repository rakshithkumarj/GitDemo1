package octpractice;

import java.util.Scanner;

public class LeftRotate {

	public static void main(String[] args) {
		int[] myArray = { 1, 2, 3, 4, 5 };
		int[] outputArrray = { myArray.length };
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number of rotations");
		int numRotation = scn.nextInt();
		int rotatingPoint = numRotation;

		int i = 0;
		while (rotatingPoint < myArray.length) {
			outputArrray[i] = myArray[rotatingPoint];
			i++;
			rotatingPoint++;

		}
		rotatingPoint = 0;
		while (rotatingPoint < numRotation) {
			outputArrray[i] = myArray[rotatingPoint];
			i++;
			rotatingPoint++;
		}
		
		for(int arrrayElement:outputArrray)
		{
			System.out.println(arrrayElement);
		}

	}

}
