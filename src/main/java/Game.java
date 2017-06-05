import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.Random;

public class Game {
    private Board board;
    private GameState currentState;
    private Player currentPlayer;

    public Game() {
        this.board = new Board();
        this.currentPlayer = null;
        this.currentState = GameState.PLAYING;
    }

    public static Player getPlayer() {
        Random generator = new Random();
        int i = generator.nextInt(2);
        if (i==1) {
            return new Player(Seed.CROSS);
        } else {
            return new Player(Seed.NOUGHT);
        }
    }

    public void initGame() {
        this.board = new Board();
        this.board.init();
        this.currentPlayer = Game.getPlayer();
    }

    public void updateGameState(int column, int row) {
        Cell cell = this.board.getCell(row, column);
        Seed seed = this.getCurrentPlayer().getSeed();
        cell.setSeed(seed);
        this.board.setCell(row, column, cell);
        this.currentPlayer.switchSeed();
    }

    public Board getBoard() {
        return board;
    }

    public GameState getCurrentState() {
        return this.currentState;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }
}
