import java.util.Map;
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
            return new Player(Seed.X);
        } else {
            return new Player(Seed.O);
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

    public void setCurrentPlayer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }
    public boolean checkState() {
        boolean state = false;
        Map<Integer, Cell> board = this.board.getBoard();
        Cell cell1 = board.get(1);
        Cell cell2 = board.get(2);
        Cell cell3 = board.get(3);
        Cell cell4 = board.get(4);
        Cell cell5 = board.get(5);
        Cell cell6 = board.get(6);
        Cell cell7 = board.get(7);
        Cell cell8 = board.get(8);
        Cell cell9 = board.get(9);
        if(cell1.getContent() == cell2.getContent() && cell2.getContent() == cell3.getContent() && cell1.getContent()!=Seed._) {
            state = true;
        } else if(cell4.getContent() == cell5.getContent() && cell5.getContent() == cell6.getContent() && cell5.getContent()!=Seed._) {
            state = true;
        } else if(cell7.getContent() == cell8.getContent() && cell8.getContent() == cell9.getContent() && cell9.getContent()!=Seed._) {
            state = true;
        } else if(cell1.getContent() == cell4.getContent() && cell4.getContent() == cell7.getContent() && cell1.getContent()!=Seed._) {
            state = true;
        } else if(cell2.getContent() == cell5.getContent() && cell5.getContent() == cell8.getContent() && cell5.getContent()!=Seed._) {
            state = true;
        } else if(cell3.getContent() == cell6.getContent() && cell6.getContent() == cell9.getContent() && cell3.getContent()!=Seed._) {
            state = true;
        } else if(cell1.getContent() == cell5.getContent() && cell5.getContent() == cell9.getContent() && cell1.getContent()!=Seed._) {
            state = true;
        } else if(cell3.getContent() == cell5.getContent() && cell5.getContent() == cell7.getContent() && cell3.getContent()!=Seed._) {
            state = true;
        }
        return state;
    }
    
    public void printBoard() {
        System.out.println("|"+board.getBoard().get(1).getContent()+"|"+board.getBoard().get(2).getContent()+"|"+board.getBoard().get(3).getContent()+"|");
        System.out.println("-------");
        System.out.println("|"+board.getBoard().get(4).getContent()+"|"+board.getBoard().get(5).getContent()+"|"+board.getBoard().get(6).getContent()+"|");
        System.out.println("-------");
        System.out.println("|"+board.getBoard().get(7).getContent()+"|"+board.getBoard().get(8).getContent()+"|"+board.getBoard().get(9).getContent()+"|");
    }
}
