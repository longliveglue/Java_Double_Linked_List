public class Node implements Nodeable {

    Node leftLink = null;
    Node rightLink = null;
    Object value = null;


    public Node(Object value){
        this.value = value;
    }

    @Override
    public Object getValue(){
        return value;
}

    @Override
    public boolean hasNext() {
        if (rightLink != null) {
            return true;
        }
        return false;
    }

    @Override
    public Node next() {

        return rightLink;
    }

    public void setRightLink(Node rightLink){
        this.rightLink = rightLink;
    }

    public void setLeftLink(Node leftLink){
        this.leftLink = leftLink;
    }

    @Override
    public boolean hasPrevious() {
        if (leftLink != null) {
            return true;
        }
        return false;
    }

    @Override
    public Node previous() {
        if(hasPrevious()){
            return leftLink;
        }
        return null;
    }

    @Override
    public boolean addNext(Node node) {
        if(hasNext()){
            rightLink.addNext(node);
        } else {
            rightLink = node;
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(Node node) {

        return false;
    }

    @Override
    public boolean addItemAt(int postion, Object node) {
        return false;
    }
}
