package doubly_linkedlist;

public class DoublyLinkedList
{
	private DLLNode head;
	private DLLNode tail;
	private int length;
	
	public DoublyLinkedList()
	{
		head=new DLLNode(Integer.MIN_VALUE,null,null);
		tail=new DLLNode(Integer.MIN_VALUE,head,null);
		head.setNext(tail);
		length=0;
	}
	
	public int getLength()
	{
		return this.length;
	}
	
	public void insert(int newValue)
	{
		DLLNode newNode=new DLLNode(newValue,head,head.getNext());
		newNode.getNext().setPrev(newNode);
		head.setNext(newNode);
		length++;
	}
	
	public void insert(int data,int position)
	{
		if(position<0)
			position=0;
		if(position>length)
			position=length-1;
		
		if(head.getNext()==tail)
		{
			DLLNode dll=new DLLNode(data,head,tail);
			head.setNext(dll);
			tail.setPrev(dll);
		}
		else if(position==0)
		{
			DLLNode newnode=new DLLNode(data,head,head.getNext());
			head.getNext().setPrev(newnode);
		    head.setNext(newnode);
		    
		}
		else 
		{
			DLLNode temp=head.getNext();
			for(int i=1;i<position;i++)
				temp=temp.getNext();
			
			DLLNode newnode=new DLLNode(data,temp,temp.getNext());
			temp.getNext().setPrev(newnode);
			temp.setNext(newnode);
			
		}
		length+=1;
	}
	
	public void insertTail(int newValue)
	{
		DLLNode node=new DLLNode(newValue,tail.getPrev(),tail);
		tail.getPrev().setNext(node);
		tail.setPrev(node);
		length+=1;
	}
	
	
	public void add(int newValue)
	{
		//DLLNode newnode=new DLLNode(newValue);
		if(head.getNext()==tail)
		{
			DLLNode newnode=new DLLNode(newValue,head,head.getNext());
			head.getNext().setPrev(newnode);
			head.setNext(newnode);
		}
		else
		{
		    DLLNode newnode=new DLLNode(newValue,tail.getPrev(),tail);
		    tail.getPrev().setNext(newnode);
		    tail.setPrev(newnode);
		}
		
	}
	
	public String toString()
	{
		StringBuilder strbuilder=new StringBuilder();
		strbuilder.append("[");
		DLLNode temp=head.getNext();
		while(temp.getNext()!=null)
		{
		    //System.out.print(temp.getData()+" ");	
			strbuilder.append(temp.getData()+" ");
			temp=temp.getNext();
		}
		strbuilder.append("]");
		
		return strbuilder.toString();
	}
	
	
	
	
}
