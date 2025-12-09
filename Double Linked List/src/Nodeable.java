

public interface Nodeable {



    public boolean hasNext();
    public Node next();
    public boolean hasPrevious();
    public Node previous();
    public boolean addNext(Node newNode);
    public Object getValue();
    public boolean remove(Node node);
    public boolean addItemAt(int postion, Object node);


}
