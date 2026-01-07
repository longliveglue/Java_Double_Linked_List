public class DoubleLinkedList {

    Node rootNode = null;
    Node currentNode = null;
    Node tailNode = null; // i need to ponder on this more...

    public DoubleLinkedList(Object newObj){
        this.rootNode = new Node(newObj);
        this.currentNode = rootNode;
        this.tailNode = currentNode;
    }

    public boolean addNext(Object newObj){
        // Check if the classes of both objects are exactly the same
        if(newObj.getClass() == rootNode.getValue().getClass()) {

            //Create a new Node called nextTail using the newObj passed in.
            Node nextTail = new Node(newObj);
            //Add the Current tailNode as the nextTails left link.
            nextTail.addLeftLink(tailNode);
            //Add the nextTail as the current tailNodes rightLink.
            tailNode.addRightLink(nextTail);
            //make nextTail the new tailNode.
            this.tailNode = nextTail;
            return true;
        }
        return false;
    }

    public Object getValue(){
        return currentNode.getValue();
    }

    public boolean hasNext(){
        if (currentNode.hasNext() || currentNode.next() == tailNode){
            return true;
        }
        return false;
    }

    public void next(){
        currentNode = currentNode.next();
    }

    public boolean hasPrevious(){
        if(currentNode.hasPrevious()){
            return true;
        }
        return false;
    }

    public void previous(){
        currentNode = currentNode.previous();
    }


}

