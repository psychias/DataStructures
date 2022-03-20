

class linkedList{
    class Node{

        private int value;
        private Node next;
        private Node preview;
        
    
        public Node(int val){
            this.value = val;
            Node next;
            Node preview;
        }

        public Node(){
            this.value = 0;
            Node next;
            Node preview;
        }
    }


    
    static Node head;
    

    //push in the beginning
    
    public void push(int val){


        Node newNode = new Node(val);
        newNode.next = null;
        newNode.preview = null;

        if (head == null){
            head = newNode;
        }else{

            newNode.next = head;
            head= newNode;
        }
    }

    //place in the end

    public void put(int val){

        Node newNode = new Node(val);
        newNode.next = null;
        newNode.preview = null;

        if(head == null){
            head = newNode;

        }else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.preview = temp;
        }
    }

    //take the last one
    //take the first


    //remove last
  public void printList(){
      Node temp = head;
      if(head == null){
          System.out.println("empty");
      }
      while(temp != null){
          System.out.print(temp.value +" ,");
          temp = temp.next;
      }
  }



    //remove first

    //find length of list
    public static int findLenght(){
        int length = 0;
        Node temp = head;
        while(temp != null){
            length++;
            temp = temp.next;
        }

        return length;
    }



    public void reverse(){

        Node current = null;
        Node prev = null;
        Node temp = head;

        //System.out.println(head.value);
        while(temp!= null){
            
            current = temp;
            temp = temp.next;

            current.next = prev;
            prev = current;
            head = prev;
        }

    }


    public static void main(String[] args){

        linkedList lista = new linkedList();
        lista.push(10);
        lista.push(1);
        lista.push(3);
        lista.push(23);
        lista.push(22);
        lista.put(11);
        lista.put(17);
        lista.put(18);
        lista.put(19);


        System.out.println("=================================");
        
        System.out.println("check 1");
        lista.printList();


        System.out.println("=================================");

        System.out.println("check 2");
        lista.printList();
        
        lista.reverse();

        System.out.println("check 3");

        lista.printList();

        System.out.println("check 4");


        
    }


    










}
