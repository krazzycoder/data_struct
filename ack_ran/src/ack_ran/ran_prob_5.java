package ack_ran;

import java.util.Scanner;

public class ran_prob_5 
{
	public static void main(String[] args) 
    {
        Scanner scanner =new Scanner(System.in);
        
        //Enter the number of strings
        int _no_str= scanner.nextInt();
        String arr_str[]=new String[_no_str];
        
        for(int i=0;i<_no_str;i++)
        	arr_str[i]=scanner.next();
        
      
      //  Scanner scanner1=new Scanner(System.in);
        //Enter the number of query
        int _no_query=scanner.nextInt();
        String arr_query[]=new String[_no_query];
        
        for(int i=0;i<_no_query;i++)
             arr_query[i]=scanner.next();
        
            for(int i=0;i<arr_query.length;i++)
             {
                 int counter=0;
                for(int j=0;j<arr_str.length;j++)
                {
                     if(arr_query[i].equals(arr_str[j]))
                         counter++;
                }
                  System.out.println(counter+"");
            }
            
       
            
    }
}
