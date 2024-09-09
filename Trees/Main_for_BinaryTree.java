package Trees;

import java.util.Scanner;
public class Main_for_BinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		BinaryTree tree=new BinaryTree();
		tree.populate(scanner);
		tree.prettydisplay();
	}

}
