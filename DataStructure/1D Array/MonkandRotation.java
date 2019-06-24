import java.util.Scanner;
/*Monk loves to preform different operations on arrays, and so being the principal of Hackerearth School, he assigned a task to his new student Mishki. Mishki will be provided with an integer array A of size N and an integer K ,
 *  where she needs to rotate the array in the right direction by K steps and then print the resultant array.
 *   As she is new to the school, please help her to complete the task.

Input:
The first line will consists of one integer T denoting the number of test cases. 
For each test case:
1) The first line consists of two integers N and K, N being the number of elements in the array and K denotes the number of steps of rotation.
2) The next line consists of N space separated integers , denoting the elements of the array A.
Output:
Print the required array.*/
/*
SAMPLE INPUT 
1
5 2
1 2 3 4 5
SAMPLE OUTPUT 
4 5 1 2 3 
 */
public class MonkandRotation {
	public static void main(String [] args)
	{ Scanner sc=new Scanner(System.in);
		int  arr[]; //declare 
		int t=sc.nextInt();
		while(t-->0){
		int n=sc.nextInt();
		int k=sc.nextInt();
		arr=new int[n]; //allocating 
		int arr2[]=new int[n];
		int j=0;
		for(int i=0;i<n;i++) //from 0 to n-1
		{
			arr[i]=sc.nextInt();
			
				
		}
	 
		j=n-k;
		for(int i=j;i<n;i++)
		{
			System.out.print(arr[i]+" ");
			
			
		}
		for (int i=0;i<j;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	}
}
