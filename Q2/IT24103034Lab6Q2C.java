import java.util.Scanner;

public class IT24103034Lab6Q2C {

	public static void main(String[] args) {

		int []numbers=new int[10];
		int sum=0;
		Scanner input=new Scanner(System.in);

		System.out.println("Please enter 10 numbers:");
		
		
		for(int i=0;i<10;i++)
		{
			System.out.print("Enter number"+ (i+1)+":");
			numbers[i]=input.nextInt();
			sum+=numbers[i];
		}
		double average=sum/10.0;

		System.out.print("The numbers you entered are:");

		for(int i=0;i<10;i++)
		{
			System.out.print(numbers[i]+" ");
		}

		System.out.println("sum:"+sum);
		System.out.println("average::"+average);

	}

}
		
			