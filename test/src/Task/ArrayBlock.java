package Task;

public class ArrayBlock {
    private ArrayBlock previous;
    private ArrayBlock next;
    private Object value;
    private int index;

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public ArrayBlock getPrevious() {
        return previous;
    }

    public void setPrevious(ArrayBlock previous) {
        this.previous = previous;
    }

    public ArrayBlock getNext() {
        return next;
    }

    public void setNext(ArrayBlock next) {
        this.next = next;
    }
}
