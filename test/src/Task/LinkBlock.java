package Task;

public class LinkBlock {
    private LinkBlock before;
    private LinkBlock after;
    private Object value;

    public LinkBlock getBefore() {
        return before;
    }

    public void setBefore(LinkBlock before) {
        this.before = before;
    }

    public LinkBlock getAfter() {
        return after;
    }

    public void setAfter(LinkBlock after) {
        this.after = after;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
