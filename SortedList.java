package generics;

public class SortedList<T extends Comparable<T>> { 
	private class  Node {
		T data;
		Node next;
		Node(T data,Node next) {
			this.data = data;
			this.next = next;
		}	
	} 
	private Node head;
	public void add(T ele) {
		if(head==null)
			  head= new Node(ele,head);
		else if(ele.compareTo(head.data)<0)
		   	head = new Node(ele,head); 
		else {
			Node ptemp = null,temp=head;
					while(temp!=null) {
						  if(ele.compareTo(temp.data)<0)
							    break;
                         ptemp = temp;
						 temp = temp.next;
					} 
					ptemp.next = new Node(ele,temp);
		}
			
	}
	public void Display() {
		Node temp = head;
		while(null!=temp) {
			System.out.print(temp.data +"->");
			temp = temp.next;			
		} 
		System.out.print("null");
	}
	
}
