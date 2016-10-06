package ack_ran;

import java.util.Scanner;

public class ran_prob_4 
{
	public static void main(String args[])
	{
		//Enter the number of elements & no of left rotation
		Scanner scanner=new Scanner(System.in);
		
		int _no_element=scanner.nextInt();
		int _no_left_rot=scanner.nextInt();
		int arr[]=new int[_no_element];
		
		for(int i=0;i<_no_element;i++)
		    arr[i]=scanner.nextInt();
		
		//rotate the array
		for(int i=1;i<=_no_left_rot;i++)
		{
			int zero_element=arr[0];
			for(int j=0;j<_no_element;j++)
			{
				if(j==_no_element-1)
					arr[j]=zero_element;
				else
				    arr[j]=arr[j+1];
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}
}
