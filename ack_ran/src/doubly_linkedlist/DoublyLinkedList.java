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
	//	System.out.println("data="+data+" position="+position);
		if(position<0)
			position=0;
		if(position>length)
			position=length-1;
		
	//	System.out.println("data="+data+" position="+position);
		if(head.getNext()==tail)
		{
			DLLNode dll=new DLLNode(data,head,tail);
			head.setNext(dll);
			tail.setPrev(dll);
			System.out.println("going heer 1");
		}
		else if(position==0)
		{
			DLLNode newnode=new DLLNode(data,head,head.getNext());
			head.getNext().setPrev(newnode);
		    head.setNext(newnode);
			System.out.println("going heer 2");
		    
		}
		else 
		{
		//	System.out.println("going here 3 position="+position);
			DLLNode temp=head.getNext();
			for(int i=1;i<position;i++)
			{
				temp=temp.getNext();
				//System.out.print(i+" times");
			}
			//System.out.println();
			
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
		
		length++;
		
	}
	
	public int removeHead()
	{
		if(length==0)
			return Integer.MIN_VALUE;
		
	    DLLNode save=head.getNext();
	    head.setNext(save.getNext());
	    save.getNext().setPrev(head);
	    length--;
	    return save.getData();
	}
	
	public int removeTail()
	{
		if(length==0)
			return Integer.MIN_VALUE;
		
		DLLNode node=tail.getPrev();
		tail.setPrev(node.getPrev());
		node.getPrev().setNext(tail);
		length--;
		return node.getData();
		
	}
	
	public int remove(int position)
	{
		if(position<0)
			position=0;
		if(position>=length)
			position=length-1;
		
		if(head.getNext()==tail)
		{
			length--;
			return Integer.MIN_VALUE;
		}
		else if(position==0)
		{
			   DLLNode save=head.getNext();
			    head.setNext(save.getNext());
			    save.getNext().setPrev(head);
				length--;
			    return save.getData();
		}
		else
		{
			DLLNode temp=head.getNext();
			for(int i=1;i<position;i++)
				temp=temp.getNext();
			
			temp.getPrev().setNext(temp.getNext());
			temp.getNext().setPrev(temp.getPrev());
			length--;
			return temp.getData();
		}
	
	}
	
	public int removeMatched(int data)
	{
		
		if(head.getNext()==tail)
			return Integer.MIN_VALUE;
		
		DLLNode temp=head.getNext();
		int counter=0;
		while(temp!=null)
		{
			if(temp.getData()==data)
			{
				temp.getPrev().setNext(temp.getNext());
				temp.getNext().setPrev(temp.getPrev());
				length--;
				counter++;
			}
			
			temp=temp.getNext();
		}
		
		return counter;
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
	
	
	public void clear()
	{
		head.setNext(tail);
		tail.setPrev(head);
		length=0;
	}
	
	
	
}
