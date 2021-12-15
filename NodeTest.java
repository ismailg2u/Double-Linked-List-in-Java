public class NodeTest {
    public static void main(String[] args) {
        Node test = new Node(); // initialize test node
        // adding nodes
        test.insert("node1");
        test.insert("node2");
        test.insert("node3");
        test.insert("node4");
        test.insert("node5");
        test.insert("node6");
        test.insert("node7",0);//adding specific position
        test.printNodes();
        System.out.println("---------------------------");

        test.deletePos(0);
        System.out.println("-----After deletion---------");
        test.printNodes();
        System.out.println("Size is:" + test.size());
        System.out.println("---------------------------");
        System.out.println("3.position is " + test.getPosition(2).getName());
        System.out.println("---------------------------");
        test.printNodes();

    }
}
