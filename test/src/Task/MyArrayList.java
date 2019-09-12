package Task;

public class MyArrayList implements MyList {
    ArrayBlock first;
    ArrayBlock last;
    int count;

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        return 0 == count;
    }

    @Override
    public boolean contains(Object o) {
        ArrayBlock arBlock = first;
        if (first == null)
            return false;
        while (arBlock.getValue() != o) {
            arBlock = arBlock.getNext();
            if (arBlock == null)
                return false;
        }
        return true;
    }

    @Override
    public boolean add(Object o) {
        ArrayBlock arrayBlock = new ArrayBlock();
        arrayBlock.setValue(o);
        arrayBlock.setIndex(count);
        if (count == 0){
            first = arrayBlock;
            last = arrayBlock;
        } else {
            last.setNext(arrayBlock);
            arrayBlock.setPrevious(last);
            last = arrayBlock;
        }
        count += 1;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        ArrayBlock remBlock = first;
        if (first == null)
            return false;
        while (remBlock.getValue() != o) {
            remBlock = remBlock.getNext();
            if (remBlock == null)
                return false;
        }
        if (remBlock.getIndex() == count - 1 && count == 1){
            first = null;
            last = null;
            count = 0;
            return true;
        } else if (remBlock.getIndex() == 0){
            remBlock.getNext().setPrevious(null);
            first = remBlock.getNext();
        } else if (remBlock.getIndex() == count - 1){
            remBlock.getPrevious().setNext(null);
            last = remBlock.getPrevious();
        } else {
            remBlock.getPrevious().setNext(remBlock.getNext());
            remBlock.getNext().setPrevious(remBlock.getPrevious());
        }
        while (remBlock.getNext() != null){
            remBlock = remBlock.getNext();
            remBlock.setIndex(remBlock.getIndex() - 1);
            if (remBlock.getNext() == null)
                break;
        }
        count -= 1;
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
        return false;
    }

    @Override
    public boolean add(int index, Object o) {
        ArrayBlock addBlock = new ArrayBlock();
        addBlock.setValue(o);
        addBlock.setIndex(index);
        ArrayBlock oldBlock = first;
        if (first == null || index >= count)
            return false;
        while (oldBlock.getIndex() != index) {
            oldBlock = oldBlock.getNext();
            if (oldBlock == null)
                return false;
        }
        if (index == 0 && count == 1){
            first.setPrevious(addBlock);
            first.setIndex(1);
            last = first;
            addBlock.setNext(last);
            first = addBlock;
        } else if (index == 0){
            addBlock.setNext(oldBlock);
            oldBlock.setPrevious(addBlock);
            first = addBlock;
        } else if (index == count -1){
            last.setNext(addBlock);
            addBlock.setPrevious(last);
            last = addBlock;
        } else {
            oldBlock.getPrevious().setNext(addBlock);
            addBlock.setPrevious(oldBlock.getPrevious());
            addBlock.setNext(oldBlock);
            oldBlock.setPrevious(addBlock);
        }
        while (oldBlock.getValue() != null){
            oldBlock.setIndex(oldBlock.getIndex() + 1);
            if (oldBlock.getIndex() == count)
                break;
            oldBlock = oldBlock.getNext();
        }
        count += 1;
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
        first = null;
        last = null;
        count = 0;
    }

    @Override
    public Object get(int index) {
        if (index >= count){
            System.out.println("Index out of range !!!");
            return false;
        } else if (index == 0){
            return first.getValue();
        } else {
            ArrayBlock indexGet = first;
            while (indexGet.getIndex() != index){
                indexGet = indexGet.getNext();
            }
            return indexGet.getValue();
        }
    }
}
