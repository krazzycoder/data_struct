package ack_ran;
import java.util.Scanner;

class fact
{
   public static void main(String args[])
   {
      Scanner scanner=new Scanner(System.in);
      int no_testcase=scanner.nextInt();
      int[] arr=new int[no_testcase];
      
      for(int i=0;i<no_testcase;i++)
           arr[i]=scanner.nextInt();
           
       for(int i=0;i<no_testcase;i++)
       {
          int num=arr[i];
          long fact=1;
          
            for(int j=num;j>=1;j--)
               fact*=j;
               
             System.out.println(fact+"");  
               
       }      
   }
}