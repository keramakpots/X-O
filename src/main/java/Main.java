

public class Main {

    public static void main(String[] args) {
        Game game = new Game();
        game.initGame();
        while (game.getCurrentState().equals(GameState.PLAYING)) {
            System.out.println("Welcome!");
            System.out.println(game.getCurrentPlayer().getSeed());
            Integer column = InputGetter.getIntegerInput();
            Integer row = InputGetter.getIntegerInput();
            game.updateGameState(column, row);
            break;
        }
    }

}
