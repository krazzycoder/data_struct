package ack_ran;

import java.util.Scanner;

public class ran_prob_2 
{
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		
		int[][] mat=new int[6][6];
		
		//enter the matrix
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<6;j++)
			{
				mat[i][j]=scanner.nextInt();
			}
		}
		
		scanner.close();
		
		int MAX=-20;
		
		//Checking the all the hour-glass sum
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				int[][] arr_temp=new int[3][3];
				int sum=0;
				//new hour-glass value
				for(int k=0;k<3;k++)
				{
					for(int l=0;l<3;l++)
					{
						arr_temp[k][l]=mat[i+k][j+l];
					}
				}
				
			   for(int m=0;m<3;m++)
			   {
				   for(int n=0;n<3;n++)
				   {
					  if(m==1&&(n==0||n==2))
					  {
						  continue;
					   }
					   else
					   {
						  sum+=arr_temp[m][n];
					   }
				   }
			   }
				
				if(sum>MAX)
				{
					MAX=sum;
				}
				
			}
		}
		
		
		System.out.println(MAX+"");
	
			
	}
	
}
