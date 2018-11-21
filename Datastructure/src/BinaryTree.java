
public class BinaryTree{
	
	class Node {
		int value;
		Node left,right;
		
		Node (int value){
			this.value = value;
			
		}
	}
	
	Node root;
	
	BinaryTree(){
		
	}
	void addNode(Node node) {
		Node rootCheck = root;
		if(root == null) {
			root=node;
			System.out.println(node.value);
		}			
		else
			if(node.value>rootCheck.value) {
				if(rootCheck.right==null) {
					rootCheck.right = node;
					System.out.println("right");
				}else {
					rootCheck= rootCheck.right;
					addNode(node);
				}
					
			}
			else if(node.value<rootCheck.value) {
				if(rootCheck.left==null) {
					rootCheck.left = node;
				}
				else {
					rootCheck = rootCheck.left;
					addNode(node);
				}
			}
		System.out.println("added");
	}
	
	void removeNode(Node node) {
		Node rootCheck = root; 
		if(rootCheck == null)
			System.out.println("Tree is Empty");
		else if(root.value == node.value) {
			
			if(root.right !=null)
				root = root.right;
			else if(root.left!= null)
				root = root.left ;
			else 
				root = null ;
			System.out.println("deleted: " + node.value);
		}
		else if(node.value > rootCheck.value && rootCheck.right != null) {
			rootCheck= rootCheck.right;
			removeNode(node);
		}
		else if(node.value < rootCheck.value && rootCheck.left != null){
			rootCheck = rootCheck.left;
			removeNode(node);
		}
		else 
			System.out.println("the value isn't fount");
		
	}
	public static void main(String[] args) {
/*		BinaryTree <Integer> tree  = new BinaryTree<Integer>() ;
 
*/		BinaryTree tree = new BinaryTree();
				
		BinaryTree.Node node = tree.new Node(4);// define object from innerclass
		BinaryTree.Node node2 = tree.new Node(3);
		tree.addNode(node);
		tree.addNode(node2);
		
		tree.removeNode(node);
		tree.removeNode(node);
		

	}
	
}
