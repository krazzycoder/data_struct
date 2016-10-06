package linkedlist;

public class ll_test 
{
	public static void main(String args[])
	{
	  LinkedList mylinkedlist=new LinkedList();
	  
	  for(int i=1;i<20;i++)
	    mylinkedlist.add(i);
	  
	  System.out.println(mylinkedlist.toString());
	  
	 //Insert Operation 
	  System.out.println("Inserting 0 at Beginning !");
	   mylinkedlist.insertAtBegin(new ListNode(0));
	  System.out.println("\n"+mylinkedlist.toString()); 
	  
	  System.out.println("\nInserting 20 at the end of the list");
	   mylinkedlist.insertAtEnd(new ListNode(20));
	   System.out.println(mylinkedlist.toString());
	   
	   System.out.println("\nInserting 234 at 4th position");
	   mylinkedlist.insert(234,4);
	   System.out.println("\n"+mylinkedlist.toString());
	   
	   System.out.println("\nInserting -1 at 0th position");
	   mylinkedlist.insert(-1,0);
	   System.out.println(mylinkedlist.toString());
	   
	   
	   
	   //Remove Operation
	   System.out.println("\n Removing from Beginging");
	   mylinkedlist.removeFromBegin();
	   System.out.println(mylinkedlist.toString());
	   
	   System.out.println("\n Removing from End");
	   mylinkedlist.removeFromEnd();
	   System.out.println(mylinkedlist.toString());
	   
	   System.out.println("\n Removing from 0th position of the linkedlist collection\n");
	   mylinkedlist.remove(0);
	   System.out.println(mylinkedlist.toString());
	   
	   System.out.println("\n Removing 234 data element from the linkedlist collection");
	   mylinkedlist.removeMatched(234);
	   System.out.println(mylinkedlist.toString());
	   
	   System.out.println("\n Calculating the length of the list");
	   int length=mylinkedlist.getLength();
	   System.out.println("The length of the linkedlist is "+length);
	   
	   System.out.println("\n Getting position of '4' data element");
	   int position1=mylinkedlist.getPosition(4);
	   System.out.println("The position ="+position1);
	   System.out.println(mylinkedlist.toString());
	   
	   
	   System.out.println("\n Clearing the list");
	   mylinkedlist.clearList();
	   System.out.println(mylinkedlist.toString());
	   
	   System.out.println("\n Getting position of '4' data element");
	   int position=mylinkedlist.getPosition(4);
	   System.out.println("The position ="+position);
	   System.out.println(mylinkedlist.toString());
	   
	   
	   
	  	   
	}
}
