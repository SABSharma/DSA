package practiceQues;

public class Node_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node n1= new Node(10);
		Node n2 = new Node(20);
		Node n3 = new Node(30);
		
		Node head=n1;
		head.next=n2;
		n2.next=n3;
		
		Node cur=head;
		insert(50, head, 2);
		while(cur!=null) {
			System.out.println(cur.data);
			cur=cur.next;
		}
		delete(head, 2);
		System.out.println("After Delete");
		cur=head;
		while(cur!=null) {
			System.out.println(cur.data);
			cur=cur.next;
		}
		
		
		
        
	}
	
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	
	public static void insert(int data , Node head , int pos) {
		
		Node prev =head;
		Node toadd= new Node(data);
		for(int i=0; i<pos-1; i++) {
			prev=prev.next;
		}
		toadd.next=prev.next;
		prev.next=toadd;
	}
	
	public static void delete(Node head , int pos) {
		Node prev = head;
		for(int i=0; i<pos-1; i++) {
			prev=prev.next;
		}
		prev.next=prev.next.next;
	}
	
	
	

}
