package doubly_linkedlist;

public class DllTest 
{
	public static void main(String args[])
	{
		DoublyLinkedList mydll= new DoublyLinkedList();
		
		
		mydll.insert(1);
		print(mydll);
		mydll.insertTail(2);
		print(mydll);
		for(int i=1;i<20;i++)
		{
          mydll.add(i);
		}
		
		System.out.println(mydll.toString());
		
		mydll.insert(420,3);
		print(mydll);
		
		//remove operation
		mydll.removeMatched(1);
		print(mydll);
		mydll.removeHead();
		print(mydll);
		mydll.removeTail();
		print(mydll);
		mydll.remove(1);
		print(mydll);
		mydll.clear();
		print(mydll);
		
		
		
	}
	
	static void print(DoublyLinkedList dll)
	{
		System.out.println(dll.toString());
	}
	
}
