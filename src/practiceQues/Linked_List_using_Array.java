package practiceQues;

public class Linked_List_using_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,6,7,8,9};
		Node head=null;
		for(int i=arr.length-1; i>=0; i--) {
		    head = create_Node(arr[i], head);
		}
		Node cur=head;
		while(cur!=null) {
			System.out.print(cur.data +"->");
			cur=cur.next;
		}

	}
	
	static class Node{
		int data;
		Node next;
	}
	
	public static  Node  create_Node( int data , Node head) {
		Node newnode=new Node();
		newnode.data=data;
		newnode.next=head;
		head=newnode;
		return head;
		
	}

}
