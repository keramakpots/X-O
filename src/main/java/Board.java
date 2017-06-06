import java.util.HashMap;
import java.util.Map;

public class Board {
    private Map<Integer, Cell> board;

    public Board() {
        this.board = new HashMap<Integer, Cell>();
    }

    public void init() {
        this.board = new HashMap<Integer, Cell>();
        this.board.put(1, new Cell(1,1));
        this.board.put(2, new Cell(1,2));
        this.board.put(3, new Cell(1,3));
        this.board.put(4, new Cell(2,1));
        this.board.put(5, new Cell(2,2));
        this.board.put(6, new Cell(2,3));
        this.board.put(7, new Cell(3,1));
        this.board.put(8, new Cell(3,2));
        this.board.put(9, new Cell(3,3));
    }


    public Cell getCell(int row, int column) {
        Cell cell = null;
        if(row == 1&&column==1) {
            cell = this.board.get(1);
        } else if (row == 1&&column==2) {
            cell = this.board.get(2);
        } else if (row == 1&&column==3) {
            cell = this.board.get(3);
        } else if (row == 2&&column==1) {
            cell = this.board.get(4);
        } else if (row == 2&&column==2) {
            cell = this.board.get(5);
        } else if (row == 2&&column==3) {
            cell = this.board.get(6);
        } else if (row == 3&&column==1) {
            cell = this.board.get(7);
        } else if (row == 3&&column==2) {
            cell = this.board.get(8);
        } else if (row == 3&&column==3) {
            cell = this.board.get(9);
        }
        return cell;
    }

    public void setCell(int row, int column, Cell cell) {
        if(row == 1&&column==1) {
            this.board.put(1, cell);
        } else if (row == 1&&column==2) {
            this.board.put(2, cell);
        } else if (row == 1&&column==3) {
            this.board.put(3, cell);
        } else if (row == 2&&column==1) {
            this.board.put(4, cell);
        } else if (row == 2&&column==2) {
            this.board.put(5, cell);
        } else if (row == 2&&column==3) {
            this.board.put(6, cell);
        } else if (row == 3&&column==1) {
            this.board.put(7, cell);
        } else if (row == 3&&column==2) {
            this.board.put(8, cell);
        } else if (row == 3&&column==3) {
            this.board.put(9, cell);
        }
    }
    public Map<Integer, Cell> getBoard() {
        return board;
    }

}
