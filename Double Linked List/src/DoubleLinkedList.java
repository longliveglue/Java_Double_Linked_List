public class DoubleLinkedList {
    Object root;
    Node rootNode;
    Node leftLink;
    Node rightLink;
    Node currentNode;

    public DoubleLinkedList(Object root){
        this.root = root;
        this.leftLink = null;
        rootNode = new Node(root);
        currentNode = rootNode;

    }

    // This will pull the value out of the current node.
    public Object getValue(){
        return currentNode.getValue();
    }

    // This checks if the current value has a node stored in the rightLink
    public Boolean hasNext(){
    if(currentNode.hasNext()){
        return true;
    }
    return false;
    }

    public boolean addNext(Object nextObject){
        Node nextNode = new Node(nextObject);
        Node previousNode = currentNode;
        Node tempNode =  currentNode;

        while(tempNode.hasNext()){
            previousNode = tempNode;
            tempNode = tempNode.next();
        }

        nextNode.leftLink = previousNode;

        tempNode.rightLink = nextNode;

        return true;
    }

    public void next(){
        currentNode = currentNode.next();
    }

    public boolean hasPrevious(){

        if (currentNode.leftLink != null){
            return true;
        };
        return false;
    }

    public void previous(){
        currentNode = currentNode.previous();
    }

}

