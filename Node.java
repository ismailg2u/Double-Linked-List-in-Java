public class Node {
    String name;
    Node head;
    Node tail;
    Node next;
    Node previous;


    //Default Constructor
    Node(){

        head = null;
        tail = null;
    }

    // Constructor
    Node(String value){
        this.name = value;
        head = null;
        tail = null;
    }
    //Is it empty method
    public boolean isEmpty(){

        if(head==null){
            return true;
        }
        else
            return false;
    }

    //Adding new nodes
    public void insert(String name){
        //First create a new node with given name
        Node node = new Node(name);
        //if head is null we initialize head
        if(head == null){
            head = tail =node;
            head.previous = null;
            head.next = null;


        }
        // else adding new node in tail
        else
            node.previous = tail;
             tail.next = node;
             tail = node;
             node.next = null;
    }
    //Adding new nodes in specific position
    public void insert(String name,int pos){
        Node node = new Node(name);
        Node node1 = getPosition(pos);

        Node node2 = getPosition(pos-1);



        if(pos == 0){
            node.next = head;
            head = node;
            node.previous = null;

        }
        else if (pos == size()){
            node.previous = tail;
            tail = node;
            node.next = null;
        }
        else
            node.next = node1;
            node.previous = node2;
            node2.next = node;
            node1.previous = node;




    }
    // deleting specific position between 0 and size()
    public void deletePos(int pos){
        if(pos == 0){
            Node node1 = this.head;
            head = node1.next;
            node1.previous = null;

        }

        else{
        Node node3 = getPosition(pos+1);
        Node node2 = getPosition(pos-1);
        Node node1 = getPosition(pos);
        node2.next = node1.next;
        node3.previous = node1.previous;}

    }
    //getting specific position this method returns node
    public Node getPosition(int pos){
        Node node = this.head;
        int index = 0;
        if (pos != 0) {
            while (node != null) {
                if (index++ == pos)
                    break;
                node = node.next;
            }
            if (node == null)
                return new Node("empty");
        }
        return node;
    }
    //getting size of nodes
    public int size(){

        Node node = this.head;
        int size = 0;
        while(node!=null){

            node = node.next;
            size ++;
        }

        return size;
    }




    //getting name
    public String getName(){
        return name;
    }

    //printing all nodes
    public void printNodes(){
        Node node = new Node();
        node= this.head;
        int i = 1;
        while (node!=null){
            System.out.println(i+"." + node.getName());
            node = node.next;
            i++;
        }

    }

}
