package Chapter9;

import java.util.Random;

interface Game {
    String move();
}

interface GameFactory {
    Game getGame();
}

class CoinToss implements Game {
    Random rand = new Random();

    public String move() {
        switch (rand.nextInt(2)) {
            case 0:
                System.out.println("Coin is Back!!!");
                return "Coin is Back!!!";
            case 1:
                System.out.println("Coin is Positive!!!");
                return "Coin is Positive!!!";
            case 2:
            default:
                return "Coin toss";
        }
    }
    public static GameFactory cgf = new GameFactory() {
        @Override
        public Game getGame() {
            return new CoinToss();
        }
    };
}

class Dice implements Game {
    Random rr = new Random();

    public String move() {
        switch (rr.nextInt(6)) {
            case 0:
            case 1:
                System.out.println("Dice is 1 !");
                return "Dice is 1 !";
            case 2:
                System.out.println("Dice is 2 !");
                return "Dice is 2 !";
            case 3:
                System.out.println("Dice is 3 !");
                return "Dice is 3 !";
            case 4:
                System.out.println("Dice is 4 !");
                return "Dice is 4 !";
            case 5:
                System.out.println("Dice is 5 !");
                return "Dice is 5 !";
            case 6:
                System.out.println("Dice is 6 !");
                return "Dice is 6 !";
            default:
                return "Error";
        }
    }
    public static GameFactory dgf = new GameFactory() {
        @Override
        public Game getGame() {
            return new Dice();
        }
    };
}

public class Test19 {
    public static void playGame(GameFactory f) {
        Game g = f.getGame();
        g.move();
    }

    public static void main(String[] args) {
        playGame(CoinToss.cgf);
        playGame(Dice.dgf);
    }
}
