package ControlFlow;
import java.util.Scanner;
public class WhileLoop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the countdown start value");
		int number = input.nextInt();
		while(number>0) {
			System.out.println(number);
			number--;
		}
		System.out.println("Blast off");
		input.close();
		
	}

}
