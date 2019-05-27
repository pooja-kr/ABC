import java.util.Scanner;
class Demo
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("User please enter a number:");
		int n= scan.nextInt();
		int sum=0;
		for (int i=1;i<=n ;i++ )

		{
			sum=sum+i;
		}
	System.out.println(sum);

  }
 }

