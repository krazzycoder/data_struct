package ack_ran;

import java.util.Scanner;

public class arr_prob_1 
{
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of Test Cases");
		int no_test=scanner.nextInt();
		
	int temp_cases=no_test;
	while(temp_cases>0)
	{			
		System.out.println("Enter the no of elements in array & SUM which is required");
		int no_element=scanner.nextInt();
		int SUM=scanner.nextInt();
		int arr[]=new int[no_element];
		
		System.out.println("Enter the elements of array");
		for(int i=0;i<no_element;i++)
			arr[i]=scanner.nextInt();
	
	
	  out:for(int i=0;i<no_element;i++)
		{
			for(int j=0;j<no_element;j++)
			{
				if(i==j)
				{
					continue;
				}
				else
				{
					int temp=arr[i]+arr[j];
					if(temp==SUM)
					{
						System.out.println("YES");
						break out;
					}
				}
			}
		}
		
		temp_cases--;
	}
			
	}
}
