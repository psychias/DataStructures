

public class Node<T> {
		public T data;
		public BinaryTree<T> left, right;

		public Node(T d) {
			data = d;
			left = null;
			right = null;
		}
		
		public Node(T data, BinaryTree left, BinaryTree right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
		
		public String toString() {
			
			return "Node -> { data = "+data+" }";
		}
		
	}