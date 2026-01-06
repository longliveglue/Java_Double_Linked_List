public class DoubleLinkedList {

    Node rootNode = null;
    Node currentNode = null;

    public DoubleLinkedList(Object newObj){
        this.rootNode = new Node(newObj);
        this.currentNode = rootNode;
    }

    public boolean addNext(Object newObj){

        // Check if the classes of both objects are exactly the same
        if(newObj.getClass() == rootNode.getValue().getClass()) {
            rootNode.addNext(newObj);
            return true;
        }
        return false;
    }

    public Object getValue(){
        return currentNode.getValue();
    }

    public boolean hasNext(){
        if (currentNode.hasNext()){
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

