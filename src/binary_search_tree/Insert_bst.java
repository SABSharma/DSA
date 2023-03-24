package binary_search_tree;

import java.util.LinkedList;
import java.util.Queue;

import binary_search_tree.Tree_Creation.Node;

public class Insert_bst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,4,5,2};
		Tree_Creation ob = new Tree_Creation();
		Node root =ob.insertLevelOrder(arr, 0);
		traversal(root);
		Node root1=insert_Node(root, 1); 
		System.out.println();
		traversal(root);
		System.out.println("level Order Traversal");
		levelorder_traversal(root1);
		

	}
	
	public static Node insert_Node(Node root , int key) {
		if(root==null) {
			 return new Node(key);
		}
		if(root.data>key)
			root.left =insert_Node(root.left , key);
		else if(root.data<key)
			root.right =insert_Node(root.right , key);
		
		return root;

	}
	
	
	
	public  static void traversal(Node root) {
		if (root == null) return ;
		traversal(root.left);
		System.out.print(root.data+ " ");
		traversal(root.right);
	}
	
	public static void levelorder_traversal(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			Node cur = q.poll();
			System.out.print(cur.data + " ");
			if(cur.left!=null)
				q.add(cur.left);
			if(cur.right!=null)
				q.add(cur.right);
			
		}
		
	}


}
