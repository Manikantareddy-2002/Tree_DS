  package Trees;

public class BinarySearchTree {
	class Node{
		int value;
		Node left;
		Node right;
		public Node(int item)
		{
			value=item;
			left=right=null;
		}
	}
	Node root;
	BinarySearchTree()
	{
		root=null;
	}
	void insert(int value)
	{
		root=insertvalue(root,value);
	}
	//insert value in a tree
	Node insertvalue(Node root,int value)
	{
		//return a new node if tree is empty
		if(root==null)
		{
			root=new Node(value);
			return root;
		}
		//Traverse to the right place and insert the node
		if(value<root.value)
		{
			root.left=insertvalue(root.left,value);
		}
		else if(value>root.value)
		{
			root.right=insertvalue(root.right,value);
		}
		return root;
	}
	void inorder()
	{
		inorderrec(root);
	}
	//inorder traversal
	void inorderrec(Node root)
	{
		if(root!=null)
		{
			inorderrec(root.left);
			System.out.print(root.value+"->");
			inorderrec(root.right);
		}
	}
	void deletevalue(int value)
	{
		root=deleterec(root,value);
	}
	Node deleterec(Node root,int value)
	{
		//return if the tree is empty
		if(root==null)
			return root;
		// find the node to be deleted
	    if (value < root.value)
	        root.left = deleterec(root.left, value);
	      else if (value > root.value)
	        root.right = deleterec(root.right, value);
	      else {
	        // If the node is with only one child or no child
	        if (root.left == null)
	          return root.right;
	        else if (root.right == null)
	          return root.left;
	        //if the node has two children
	        //place the inorder successor in position of the node to be deleted
	        root.value=minvalue(root.right);
	        //delete the inorder successor
	        root.right=deleterec(root.right,root.value);
	}
	    return root;
}
	//find the inorder successor
	int minvalue(Node root)
	{
		int minv=root.value;
		while(root.left!=null)
		{
			minv=root.left.value;
			root=root.left;
		}
		return minv;
	}
	public static void main(String[] args)
	{
    BinarySearchTree tree = new BinarySearchTree();

    tree.insert(8);
    tree.insert(3);
    tree.insert(1);
    tree.insert(6);
    tree.insert(7);
    tree.insert(10);
    tree.insert(14);
    tree.insert(4);

    System.out.print("Inorder traversal: ");
    tree.inorder();

    System.out.println("\n\nAfter deleting 10");
    tree.deletevalue(10);
    System.out.print("Inorder traversal: ");
    tree.inorder();
}
}
