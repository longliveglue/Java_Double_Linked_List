import org.w3c.dom.Node;

public interface Nodeable {

    public boolean hasNext();
    public Node next();
    public boolean hasPrevious();
    public Node previous();
    public boolean addNext(Object node);
    public boolean remove();
    public boolean addItemAt(int postion, Object node);


}
