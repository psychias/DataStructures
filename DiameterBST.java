public class Tree{

    
    public class Node{

        int value;
        Node left;
        Node right;

        public node(int value){
            this.value = value;
        }

    }

    Node root;

    public Tree addNode(int val){
        if(root == null){
            root = new Node(val);
        }
        else{
            if(val > node.val){
                root.left = addNode(val);
            }else{
                root.right = addNode(val);
            }
        }
        return root;
    }
    public void printInOrder(){ printTree(root);}
    public void printTree(Node node){
        if(node == null){
            return;
        }
        printTree(node.left);
        System.out.print(node.value + ", ");
        printTree(node.right);
    }
    // find height of binary tree
    public int height(Node root){
        if(root == null){
            return 0;
        }

        int left = height(root.left);
    }

    public static void main(String[] args){
        Tree tree = new Tree();
        tree.addNode(10);
        tree.addNode(23);
        tree.addNode(34);
        tree.addNode(56);
        tree.addNode(234);
        tree.addNode(2);

        tree.printInOrder();


    }
}