package linkedlist;

public class LinkedList 
{
	private int length=0;
	ListNode head;
	
	public LinkedList()
	{
		length=0;
	}
	
	public synchronized ListNode getHead()
	{
		return this.head;
	}
	
	//Inserting the node at the beginning
	public synchronized void insertAtBegin(ListNode node){
		
		node.setNext(head);
		head=node;
		length++;
	}
	
	//Inserting the node at the end
	public synchronized void insertAtEnd(ListNode node){
		
		if(head==null){
			//checking for the case of the empty linkedlist
			head=node;
		}
		else{
			
			ListNode p,q;
			for(p=head;(q=p.getNext())!=null;p=q);
			
				   p.setNext(node);
			
		}
		
		length++;
	}
	
	//Add a new value to the list at a given position
	//All values at the at position to the end move over to make the rooom
	public synchronized void insert(int data,int position){
		//fixing the position variable 
		if(position<0)
			position=0;
		
		if(position>length)
			position=length;
		
		if(head==null){
			head=new ListNode(data);	
		}
		else if(position==0){
			ListNode temp=new ListNode(data);
			temp.setNext(head);
			head=temp;
		}
		else{
			ListNode temp=head;
			for(int i=1;i<position;i++)
				  temp=temp.getNext();
			
			ListNode newNode=new ListNode(data);
			newNode.setNext(temp.getNext());
			temp.setNext(newNode);
		}
		
		length++;
	}
	
	public String toString()
	{
		 StringBuilder result=new StringBuilder();
		 result.append("[");
		 
		 if(head==null)
			 return result+"]";
		 
		 result.append(head.getData()+" ");
		 ListNode temp=head.getNext();
		 
		 while(temp!=null)
		 {
			 result.append(temp.getData()+" ");
			 temp=temp.getNext();
		 }
		 
		 result.append("]");
		 
		 return result.toString();
		 
	}
	
	public synchronized ListNode removeFromBegin()
	{
		ListNode node=head;
		if(node!=null)
		{
			head=node.getNext();
			node.setNext(null);
			length--;
		}
		
		return node;
	}
	
	
	public synchronized ListNode removeFromEnd()
	{
		ListNode node=head;
		if(head==null)
			return null;
		
		ListNode p=head,q=null,next=node.getNext();
		if(next==null)
		{
			head=null;
			return p;
		}
		
		while((next=p.getNext())!=null)
	    {
		   q=p;
		   p=next;
		}
		
		q.setNext(null);
		return p;
		
	}
	
	public synchronized void removeMatched(int data)
	{
		if(head==null)
			return ;
		
		if(head.getData()==(data))
		{
			head=head.getNext();
		    return;
		}
		
		ListNode p=head,q=null;
		while((q=p.getNext())!=null)
		{
			if(data==q.getData()){
				p.setNext(q.getNext());
				length--;
				return ;
			}
			p=q;
			
		}
		
	}
	
	
	public synchronized void remove(int position)
	{
		if(position<0)
			position=0;
		
		if(position>=length)
			position=length-1;
		
		if(head==null)
		    return;
		
		if(position==0)
		{
			head=head.getNext();
		}
		else{
		   ListNode temp=head;
		   for(int i=1;i<position;i++)
		   {
			   temp=temp.getNext();
		   }
		   
		   temp.setNext(temp.getNext().getNext());
		}
		
		length--;
		
	}
	
	public int getPosition(int data)
	{
		ListNode temp=head;
		int pos=0;
		while(temp!=null)
		{
			if(temp.getData()==data)
			{
				return pos;
			}
			pos++;
			temp=temp.getNext();
		}
		
		return Integer.MIN_VALUE;
		
	}
	
	public void add(int item)
	{
		this.insertAtEnd(new ListNode(item));
	}
	
	public void add(ListNode node)
	{
		this.insertAtEnd(node);
	}
	
	
	public int getLength()
	{
		return length;
	}
	
	public void clearList()
	{
		head=null;
		length=0;
	}
	
}
