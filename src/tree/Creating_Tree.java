package tree;
import java.util.*;
public class Creating_Tree {
    static Scanner sc =null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc = new Scanner(System.in);
		Node create_tree = Create_tree();
		System.out.println("inorder-traversal");
		inorder(create_tree);
		System.out.println("preorder-traversal");
		preorder(create_tree);
		System.out.println("postorder-traversal");
		postorder(create_tree);
//		while(create_tree!=null) {
//			System.out.println(create_tree.data);
//			create_tree=create_tree.left;
//		}
	}
	
	static Node Create_tree() {
		Node root = null;
		System.out.println("enter the root Data");
		int data = sc.nextInt();
		
		if (data==-1)
			 return null;
		root = new Node(data);
		
	    System.out.println(" Enter  left for" + data);
	    root.left=Create_tree();
	    
	    System.out.println(" Enter  right for" + data);
	    root.right=Create_tree();
		
		return root;
	}
	
	static void inorder(Node root) {
		if(root == null) return ;
		
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
		
	}
	
	static void preorder(Node root) {
		if(root == null) return ;
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
		
	}
	
	static void postorder(Node root) {
		if(root == null) return ;
		
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data+" ");
		
	}

}

 class Node{
	Node left , right;
	int data;
	Node(int data){
		this.data=data;
	}
} 
