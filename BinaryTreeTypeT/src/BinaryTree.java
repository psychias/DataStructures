import java.util.Iterator;
import java.util.Stack;

public class BinaryTree<T> implements Iterable<BinaryTree <T>>{

	public Node<T> root;
    

	public BinaryTree() {
		root = null;
	}

	public BinaryTree(T n) {
		root.data = n;
		root.left = null;
		root.right = null;
	}
	public BinaryTree(BinaryTree<T> left, T n, BinaryTree<T> right ) {
		root.data = n;
		root.left = left;
		root.right = right;
	}


    public void createLeaf(T data) {
    	root = new Node<T>(data);
    }

    public void addSubLeft(BinaryTree<T> t) {
    	root.left = t;
    }
    public void addSubRight(BinaryTree<T> t) {
    	root.right = t;
    }
	
    public T element() {
    	return root.data;
    }
    public BinaryTree<T> left() {
    	return root.left;
    }
    public BinaryTree<T> right() {
    	return root.right;
    }
    public boolean isEmpty() {
    	return root==null;
    }
    
    @Override
    public Iterator< BinaryTree<T> > iterator(){
    	return new PreOrder(this);
    }
    
    
    private class PreOrder implements Iterator<BinaryTree<T>>{
        // Askisis Na ylopoiisis se Java mia STACK
    	// Askisis Na ylopoiisis se Java mia QUEUE
        Stack<BinaryTree<T>> stack = new Stack<BinaryTree<T>>();   // https://docs.oracle.com/javase/7/docs/api/java/util/Stack.html
        
        public PreOrder(BinaryTree<T> t) {
        	stack.push(t);
        }
    	
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return !stack.isEmpty();
		}

		@Override
		public BinaryTree<T> next() {
			// TODO Auto-generated method stub
			BinaryTree<T> t = stack.pop();
			Node node = t.root;
			if(node.right!=null) {
				stack.push(node.right);
			}
			if(node.left!=null) {
				stack.push(node.left);
			}
			return t;
		}
    	
    }
    
    
    
}
