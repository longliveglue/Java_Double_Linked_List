public class Node {

    private Node leftLink;
    private Node rightLink;
    private Object value;

    public Node(Object newObj) {
        this.value = newObj;
    }

    public Object getValue() {
        return value;
    }

    public boolean addNext(Object newObj) {
        Node newNode = new Node(newObj);

        if (this.rightLink == null) {
            rightLink = newNode;
            rightLink.addLeftLink(this);
        } else {
            rightLink.addNext(newObj);
        }
        return true;
    }

    public void addLeftLink(Node leftNode) {
        this.leftLink = leftNode;
    }

    public void addRightLink(Node rightNode) {
        this.rightLink = rightNode;
    }

    public Node next() {
        return rightLink;
    }

    public boolean hasNext() {
        if (rightLink != null) {
            return true;
        }
        return false;
    }

    public Node previous() {
        return leftLink;
    }

    public boolean hasPrevious() {
        if (leftLink != null) {
            return true;
        }
        return false;
    }

}





























































