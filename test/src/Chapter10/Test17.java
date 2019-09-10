package Chapter10;

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
}

class CoinTossFactory implements GameFactory {
    public Game getGame() {
        return new CoinToss();
    }
}

class Dice implements Game {
    Random rr = new Random();

    public String move() {
        return getString(rr);
    }

    public static String getString(Random rr) {
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
}

class DiceFactory implements GameFactory {
    public Game getGame() {
        return new Dice();
    }
}

public class Test17 {
    public static void playGame(GameFactory f) {
        Game g = f.getGame();
        g.move();
    }

    public static void main(String[] args) {
        playGame(new CoinTossFactory());
        playGame(new DiceFactory());
    }
}