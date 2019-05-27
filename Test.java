import java.util.Scanner;
class Test
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the size of an array:");
			int n=scan.nextInt();
		int a[]=new int[n];
		System.out.println("Start Giving the Inputs:");
		for (int i=0;i<a.length ;i++ )
		{
			a[i]=scan.nextInt();
		}
		System.out.println("elements are:");
		for (int i=0;i<a.length ;i++ )
		{
			if(i%2==1)
			{

			System.out.println(a[i]);
			}
			
		}

	}
}
