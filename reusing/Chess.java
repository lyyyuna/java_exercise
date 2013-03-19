class Game {
    Game(int i) {
        System.out.println("1111");
    }
}

class BoardGame extends Game {
    BoardGame(int i) {
        super(i);
        System.out.println("2222");
    }   
}

public class Chess extends BoardGame {
    Chess() {
        super(11);
        System.out.println("22333234");
    }
    public static void main(String[] args) {
        Chess x = new Chess();
    }
}
