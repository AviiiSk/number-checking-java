import java.util.Scanner;

// 6. Write the program to check whether the no is greater than 100.


public class Question6 {

	public static void main(String[] args) {
		
		System.out.println("Enter the Number");
		
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		
		if(a>100)
		{
			System.out.println("Your Enter Number is Greater than 100");
		}

		else
		{
			System.out.println("Your Enter Number is Not Greater than 100");
		}
		
	}

}
