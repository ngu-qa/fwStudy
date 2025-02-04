package Chapter8;

class Shared {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;

    public Shared() {
        System.out.println("Creating " + this);
        //System.out.println("Creating" + this.toString());
    }

    public void addRef() {
        refcount++;
    }

    protected void finalize() {
        if (refcount > 0) {
            System.out.println("Error: " + refcount + " Shared " + id + " objects in use");
        }
    }

    protected void dispose() {
        if (--refcount == 0) {
            System.out.println("Disposing " + this);
        }
    }

    @Override
    public String toString() {
        return "Shared " + id;
    }
}

class Composing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;

    public Composing(Shared shared) {
        System.out.println("Creating " + this);
        this.shared = shared;
        this.shared.addRef();
    }

    protected void dispose() {
        System.out.println("disposing " + this);
        shared.dispose();
    }

    @Override
    public String toString() {
        return "Composing " + id;
    }
}

public class Test6 {
    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing[] composing = {new Composing(shared), new Composing(shared), new Composing(shared), new Composing(shared), new Composing(shared)};
        for (Composing c : composing){
            c.dispose();
        }
        Composing comTest = new Composing(shared);
        Composing comTest2 = new Composing(shared);
        shared.finalize();
        Shared sharedTest = new Shared();
        Composing comTest3 = new Composing(sharedTest);
        sharedTest.finalize();
    }
}
