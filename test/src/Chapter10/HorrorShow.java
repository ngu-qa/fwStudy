package Chapter10;

interface Monster {
    void menace();
}

interface Dan extends Monster {
    void destroy();
}

interface Lethal {
    void kill();
}

interface Vampire extends Dan, Lethal {
    void drinkBlood();
}

public class HorrorShow {
    static void u(Monster b) {
        b.menace();
    }

    static void v(Dan d) {
        d.menace();
        d.destroy();
    }

    public Dan getDan() {
        return new Dan() {
            public void menace() {
                System.out.println("Dan.menace() ");
            }

            public void destroy() {
                System.out.println("Dan.destroy() ");
            }
        };
    }

    public Vampire getVam() {
        return new Vampire() {
            public void drinkBlood() {
                System.out.println("Vampire.drinkBlood() ");
            }

            public void destroy() {
                System.out.println("Vampire.destroy() ");
            }

            public void kill() {
                System.out.println("Vampire.kill() ");
            }

            public void menace() {
                System.out.println("Vampire.menace() ");
            }
        };
    }

    public static void main(String[] args) {
        HorrorShow lll = new HorrorShow();
        u(lll.getDan());
        v(lll.getVam());
    }
}
