// Q2
class LinkedList{
	
	Node head;
	
	static class Node{
		
		int data;
		Node next;
		
		Node(int d){
			data = d;
			Node next = null;
		}
	}
	
/*
head ---> second ----> third ---> null;
null <---- head <----- second <----third
*/
	void reverse(){
		Node n = head;
		Node temp = n;
		
		n.next.next.next = temp.next;
		n.next = temp;
		n.next = null;	
			
		}
	}
	
	void display(){
		Node n = head;
		while(n != null)
			System.out.print(" "+n.data+" ");
	}
	
	public static void main(String []args){
		LinkedList list = new LinkedList();
		list.head = new Node(1);
		list second = new Node(2);
		list third = new Node(3);
		
		list.head.next = second;
		list.second.next = third;
		
		list.display();
		
	}
}