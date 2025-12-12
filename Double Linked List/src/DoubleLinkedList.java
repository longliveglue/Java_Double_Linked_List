public class DoubleLinkedList {
    Object root;
    Node rootNode;
    Node leftLink;
    Node rightLink;
    Node currentNode;

    public DoubleLinkedList(Object root){
        this.root = root;
        rootNode = new Node(root);
        currentNode = rootNode;

    }

    public Object getValue(){
        return root;
    }

    public Node next(){
    return null;
    }
}
