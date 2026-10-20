//Array Program No.3 
//Array with for loop
import java.util.Scanner;
class arrloop1
	{
		public static void main(String[]args)
		{
			int marks[]=new int[5];
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter any 5 Elements");
			for(int i=0;i<5;i++)
			{
				marks[i]=sc.nextInt();
			}
			System.out.println("Elements are");
				for(int i=0;i<5;i++)
				{
					System.out.println(marks[i]);
				}
		}
	}