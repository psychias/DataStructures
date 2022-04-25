public class BinaryTree {


    public class Node{

        int key;
        Node left;
        Node right;

        public Node(int key){
            this.key = key;
            left = right = null;
        }
    }

    Node root;
    public BinaryTree(){root = null;}
    public BinaryTree(int key){
        root = new Node(key);
    }

    //insert Node 


    public void insert(int key){root = insertNode(root,key);}

    public Node insertNode(Node root,int key){
        
        if(root == null){
            root = new Node(key);
            return root;
        }
        else if(root.key > key){
            root.right = insertNode(root.right, key);
        }
        else if(root.key < key ){
            root.left = insertNode(root.left, key);
        }
        return root;
    }



    public void inorder(){inorderPrint(root);}

    public void inorderPrint(Node root){
        if(root!=null){
            inorderPrint(root.right);
            System.out.print(" ->" + root.key);
            inorderPrint(root.left);
        }
    }


    public static void main(String[] args){
        BinaryTree tree = new BinaryTree();
        tree.insert(12);
        tree.insert(4);
        tree.insert(2);
        tree.insert(45);
        tree.insert(23);
        tree.insert(3);
        tree.insert(52);
        tree.insert(1);
        tree.insert(6);

        System.out.println("==============================");
        tree.inorder();


    }

    //print
    //in pro post order

    
}
