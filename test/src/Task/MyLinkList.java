package Task;

public class MyLinkList implements MyList {
    LinkBlock head;
    LinkBlock tail;
    int len = 0;

    @Override
    public int size() {
        return len;
    }

    @Override
    public boolean isEmpty() {
        return 0 == len;
    }

    @Override
    public boolean contains(Object o) {
        LinkBlock con = head;
        if (head == null)
            return false;
        while (con.getValue() != o) {
            con = con.getAfter();
            if (con == null)
                return false;
        }
        return true;
    }

    @Override
    public boolean add(Object o) {
        if (o == null){
            System.out.println("The Object added is empty !!!");
            return false;
        }
        LinkBlock block = new LinkBlock();
        block.setValue(o);
        if (head == null) {
            head = block;
            tail = block;
        } else {
            tail.setAfter(block);
            block.setBefore(tail);
            tail = block;
        }
        len += 1;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        LinkBlock rem = head;
        if (head == null)
            return false;
        while (rem.getValue() != o) {
            rem = rem.getAfter();
            if (rem == null)
                return false;
        }
        if (rem.getBefore() == null) {
            rem.getAfter().setBefore(null);
            head = rem.getAfter();
        } else if (rem.getAfter() == null) {
            rem.getBefore().setAfter(null);
            tail = rem.getBefore();
        } else {
            rem.getAfter().setBefore(rem.getBefore());
            rem.getBefore().setAfter(rem.getAfter());
        }
        len -= 1;
        return true;
    }

    @Override
    public boolean addAll(Object... os) {
        if (os.length == 0){
            System.out.println("The Object added is empty !!!");
            return false;
        }
        for (Object i : os) {
            add(i);
        }
        return true;
    }

    @Override
    public boolean add(int index, Object o) {
        LinkBlock indexBlock = new LinkBlock();
        indexBlock.setValue(o);
        if (index >= len){
            System.out.println("Index out of range !!!");
            return false;
        } else if (index == 0){
            add(o);
        } else if (index == len - 1){
            tail.setAfter(indexBlock);
            indexBlock.setBefore(tail);
            tail = indexBlock;
        } else {
            LinkBlock indexAdd = head;
            for (int i = 0;i<index;i++){
                indexAdd = indexAdd.getAfter();
            }
            indexBlock.setAfter(indexAdd);
            indexBlock.setBefore(indexAdd.getBefore());
            indexAdd.getBefore().setAfter(indexBlock);
            indexAdd.setBefore(indexBlock);
        }
        len += 1;
        return false;
    }

    @Override
    public boolean removeAll(Object os) {
        if (os == null)
            return false;
        while (contains(os)){
            remove(os);
        }
        return true;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        len = 0;
    }

    @Override
    public Object get(int index) {
        if (index >= len){
            System.out.println("Index out of range !!!");
            return false;
        } else if (index == 0){
            return head.getValue();
        } else {
            LinkBlock indexGet = head;
            for (int i = 0;i<index;i++){
                indexGet = indexGet.getAfter();
            }
            return indexGet.getValue();
        }
    }
}
