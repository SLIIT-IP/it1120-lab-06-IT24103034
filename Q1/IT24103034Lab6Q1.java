import java.util.Scanner;

public class IT24103034Lab6Q1 {

	public static void main(String[] args) {
		double square,squareRoot;
		double sqrt;

		Scanner input=new Scanner(System.in);

		System.out.println("Enter a number: ");
		double number=input.nextInt();

		square=number*number;

		squareRoot=Math.sqrt(number);

		System.out.println("The square of "+number+" is:"+square);
		System.out.println("The square root of "+number+" is:"+squareRoot);

	}
}
