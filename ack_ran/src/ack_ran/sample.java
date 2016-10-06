package ack_ran;

import java.util.Arrays;

public class sample 
{
	public static void main(String args[])
	{
		int[] rotated=new int[10];
		for(int i=0;i<rotated.length;i++)
			rotated[i]=i;
		
		//int temp_arr[]=Arrays.copyOfRange(rotated,0,4);
		//for(int i=0;i<temp_arr.length;i++)
			//System.out.print(temp_arr[i]+" ");
		
	   int arr[]=new int[10];
	   System.arraycopy(rotated,0,arr,0,6);
	   for(int i=0;i<arr.length;i++)
		   System.out.print(arr[i]+" ");
	}
}
