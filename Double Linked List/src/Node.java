public class Node implements Nodeable{

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public org.w3c.dom.Node next() {
        return null;
    }

    @Override
    public boolean hasPrevious() {
        return false;
    }

    @Override
    public org.w3c.dom.Node previous() {
        return null;
    }

    @Override
    public boolean addNext(Object node) {
        return false;
    }

    @Override
    public boolean remove() {
        return false;
    }

    @Override
    public boolean addItemAt(int postion, Object node) {
        return false;
    }
}
