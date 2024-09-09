package Trees;

public class Main_for_Binarysearchtree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
