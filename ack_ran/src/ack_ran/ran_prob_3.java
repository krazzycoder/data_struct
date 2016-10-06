package ack_ran;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ran_prob_3 
{
	public static void main(String args[])
	{
		//Enter the no of sequence in sequencelist & no of element in single sequence
		Scanner scanner=new Scanner(System.in);
		
		int _no_element=scanner.nextInt();
		int _no_sequence=scanner.nextInt();
		
	
		HashMap<Integer,List<Long>> hash=new HashMap();
		for(int i=0;i<_no_sequence;i++)
		{
			List<Long> mylist=new ArrayList<Long>();
			 for(int j=0;j<_no_element+1;j++)
			 {
				 mylist.add(scanner.nextLong());
			 }
			 
			 hash.put(i,mylist);
		}
		
		
		
		ArrayList<List<Long>> myarrlist=new ArrayList<List<Long>>();
		for(int z=0;z<_no_element;z++)
			myarrlist.add(new ArrayList<Long>());
		
		long lastAns=0;
		
	/*	Iterator myiterator1=hash.keySet().iterator();
		while(myiterator1.hasNext())
		{
			int key=(Integer)myiterator1.next();
			List<Integer> mylist=hash.get(key);
			  for(int i=0;i<mylist.size();i++)
			  {
				 System.out.println 
				  
			  }
		} */
		
		Iterator myiterator=hash.keySet().iterator();
		while(myiterator.hasNext())
		{
			int key=(Integer)myiterator.next();
			List<Long> mylist=hash.get(key);
			//for(int i=0;i<mylist.size();i++)
			//{
				long master_element=mylist.get(0);
				if(master_element==1)
				{
					//Query 1
					 int element=(int)((mylist.get(1)^lastAns)%_no_element);
					 List<Long> temp_List=myarrlist.get(element);
					 temp_List.add(mylist.get(2));
				}
				else if(master_element==2)
				{
					//Query 2
					int element=(int)((mylist.get(1)^lastAns)%_no_element);
					//System.out.println("element="+element);
					List<Long> temp_List=myarrlist.get(element);
					int index=(int)(mylist.get(2)%(temp_List.size()));
					//System.out.println("index="+index+"");
					lastAns=temp_List.get(index);
					System.out.println(lastAns);
				}
			//}
		}
		
		
		
		
		
		
		
	}
}
