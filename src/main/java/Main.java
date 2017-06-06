import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Game game = new Game();
        Computer computer = new Computer();
        game.initGame();

        while (game.getCurrentState().equals(GameState.PLAYING)) {
            System.out.println("Welcome!");
            System.out.println("Insert column");
            System.out.println("Insert row");
            game.printBoard();
            Integer column = InputGetter.getIntegerInput();
            Integer row = InputGetter.getIntegerInput();
            game.updateGameState(column, row);
            boolean state = game.checkState();
            if(state == true) {
                game.printBoard();
                System.out.println("THE END");
                break;
            }
            computer.markField(game.getBoard(), game.getCurrentPlayer());
            boolean state1 = game.checkState();
            if(state1 == true) {
                game.printBoard();
                System.out.println("THE END");
                break;
            }
            Player player = game.getCurrentPlayer();
            player.switchSeed();
            game.setCurrentPlayer(player);
        }
    }

}
