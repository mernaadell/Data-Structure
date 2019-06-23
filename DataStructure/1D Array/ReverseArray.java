import java.util.Scanner;

public class ReverseArray {
	public static void main(String [] args)
	{ Scanner sc=new Scanner(System.in);
		int  arr[]; //declare 
		int n=sc.nextInt();
		arr=new int[n]; //allocating 
		for(int i=0;i<n;i++) //from 0 to n-1
		{
			arr[i]=sc.nextInt();
		}
		for (int i=n-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
		
		
	}

}
