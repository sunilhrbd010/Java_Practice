class Node{
	   int value;
       Node left,right;

	Node(int value){
		this.value = value;
		left=right=null;
	}
}

class BinaryTree{
	Node root;

	Node createNode(int val){
		Node node = new Node(val);
		node.left=null;
		node.right=null;
		return node;
	}

	void printPostOrder(Node node){
			if(node!=null){
				printPostOrder(node.left);
				printPostOrder(node.right);
				System.out.print(node.value+" ");	
			}	
	}

	Node mirrorify(Node node){	
		if(node==null)
			 return null;

		Node mirrored=createNode(node.value);
		mirrored.left=mirrorify(node.right);
		mirrored.right=mirrorify(node.left);		
		return mirrored;	
	}
}

class TreeMirror{
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
			tree.root = tree.createNode(3);
			tree.root.left = tree.createNode(4);
			tree.root.right = tree.createNode(5);
			tree.root.left.left = tree.createNode(6);
			tree.root.left.right = tree.createNode(9);

			tree.printPostOrder(tree.root);
			Node mirror=tree.mirrorify(tree.root);
			System.out.println();
			tree.printPostOrder(mirror);
	}
}