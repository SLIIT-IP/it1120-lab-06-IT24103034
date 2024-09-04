import java.util.Scanner;

public class IT24103034Lab6Q3 {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);

		double sumofSquares=0;
		int count=0,number;

		
	
		while(true)
		{
			System.out.println("Enter a number:");
			 number=input.nextInt();

		if(number==-99) 
		{
			break;
		}

		if(number<=0)
		{
			System.out.println("Invalid input.Please enter a positive integer or -99 to terminate.");
			continue;
		}

		
		sumofSquares+=number*number;
		count++;
		}


		if(count>0)
		{
			double rms=Math.sqrt(sumofSquares/count);
			System.out.println("The Root Mean Square(RMS):"+rms);
		}

	}
}	