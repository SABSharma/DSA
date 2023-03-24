package Questions;

import java.util.LinkedList;

import Questions.Cycle_In_LinkedList_39.Node;

public class Reverse_LinkedList {
	
	static class Node{
		int data;
		Node next;
		Node(int d){
			data=d;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse_LinkedList ob = new Reverse_LinkedList();
		// ob.add();
		 Node n1 = new Node(10);
		 Node n2 = new Node(20);
		 Node n3 = new Node(20);
		 Node n4 = new Node(30);
		// Node n5 = new Node(10);
		 Node head=n1;
		 head.next=n2;
		 n2.next=n3;
		 n3.next=n4;
		// n4.next=n5;
         //Node reverse = reverse(head);
         
         //Reversing the loop
//         while(reverse!=null) {
//        	 System.out.println(reverse.data);
//        	 reverse=reverse.next;
//         }
		  String To_check_palindrome = ob.Palindrome(head);
		  System.out.println(To_check_palindrome);
		

	}
	
	// To reverse A Link List
	static Node reverse(Node head) {
		Node cur=head;
		Node prev=null;
		while(cur!=null) {
			System.out.println(cur.data);
			Node temp = cur.next;
			cur.next=prev;
			prev=cur;
			cur=temp;
		
		}
		return prev;
	}
	
	// To find the Lsit is Palindrome or not
	public String Palindrome(Node head) {
		Node start=head;
		Node end=reverse(find_middle(head));
		
		while(end!=null) {
			if(start.data!=end.data) {
				return "Not Palindrome";
			}
			start=start.next;
			end=end.next;
		}
		return "Palindrome" ;
		
	}
	
	// To reverse the string from middle We have to finds the Middle
     public static Node find_middle(Node head) {
    	 Node slow=head;
    	 Node fast=head;
    	 while(fast!=null && fast.next!=null) {
    		 slow=slow.next;
    		 fast=fast.next.next;
    	 }
    	 System.out.println(slow.data);
    	 return slow;
     }
     

}
