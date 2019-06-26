/*
This is one of the most easiest problem you will ever code.

Mr. Bournville loves programming and he likes to face new programming challenges. After completing many challenges he has now given you one challenge which is one of his favourites. He has given you a list of N random integers and he wants you to find the integer which has the maximum frequency in the given list.

Being a programmer himself, he had made this task a challenge for you and he will calculate your score for this task using a formula.

Formula for calculating the score : (max_score) - (number of characters in your code/15.0)

Mr. Bournville already has a solution for this but he is not satisfied with his solution. He wants you to write a shortest possible code for this task. In case Frequency of two numbers is same print the smaller one

Input:
First line of input contains N, number of integers.
Second line will contains N spaces separated integers.

Output:
Print the most frequent integer.

Contraints:
3<=N<=104
-10^6<=Integer<=10^6

NOTE : Score will awarded after passing all the test files.

SAMPLE INPUT 
5
1 1 1 2 2

SAMPLE OUTPUT 
1

 */
import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Scanner;

public class MostFrequent {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		 HashMap<Integer,Integer> countmap = new HashMap<>();
	        int n=sc.nextInt();
	        int a[]=new int[n];
	        for(int i=0;i<n;i++)
	        a[i]=sc.nextInt();
	        
	        for(int i=0;i<n;i++)
			{
				if(countmap.containsKey(a[i]))
				{
					countmap.put(a[i], countmap.get(a[i])+1);
				}
				else
				{
					countmap.put(a[i], 1);
				}
			}
	        int max =0;
			int key = 0;
			int min = 999999;
			for (Map.Entry ele : countmap.entrySet()) { 
			    
	            if(max <= (Integer)ele.getValue())
	            {
	                max =  (Integer)ele.getValue();
	                if((Integer) ele.getKey()<min)
	                key= (Integer) ele.getKey() ;
	            }
			}
	        
	        System.out.println(key);
	
	

	

}
}

