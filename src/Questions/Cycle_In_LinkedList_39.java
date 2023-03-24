package Questions;

import java.util.LinkedList;

//import org.w3c.dom.Node;

public class Cycle_In_LinkedList_39 {
	
	 static Node head;
	 static  class Node{
		int data;
		Node next;
		Node(int d){
			this.data=d;
			next=null;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node slow;
		LinkedList<Integer> ls1= new LinkedList<>();
		 Node n1 = new Node(10);
		 Node n2 = new Node(20);
		 Node n3 = new Node(30);
		 Node n4 = new Node(40);
		 Node n5 = new Node(50);
		 Node n6 = new Node(60);
		 Node head=n1;
		 head.next=n2;
		 n2.next=n3;
		 n3.next=n4;
		 n4.next=n5;
		 n5.next=n6;
		 n6.next=n4;
         //traverse(head);
         System.out.println(findCycle(head));
	}
	
	static void traverse(Node head) {
		Node cur=head;
		while(cur!=null) {
			System.out.println(cur.data);
			cur=cur.next;
		}
		
	}
	
	public static Node findCycle(Node head) {
		//LinkedList<Integer> ls= new LinkedList<>();
		Node slow=head;
		Node fast=head.next.next;
		while(fast!=null && fast.next!=null)
		{
			if (fast==slow) {
				System.out.println("cycle Exixts");
				return slow;
			}
			slow=slow.next;
			fast=fast.next.next;
		}	
		System.out.println("Cycle Doesn't Exixts");
		return null;
	}
	
	// Point At Which Cycle Starts 
	public  static Node  point (Node head) {
		
		Node start=head;
		Node mid = findCycle(head);
		
		while( start!=mid ) {
		
			//System.out.println(mid.data);
			
			return mid;
			
		
		}
		
		
		
		return head ;
		
	}
	

}
