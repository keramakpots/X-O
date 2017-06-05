
public class Cell {
    private Seed content;
    private int row;
    private int column;

    public Cell(int row, int column) {
        this.column = column;
        this.row = row;
        this.content = Seed.EMPTY;
    }

    public void setSeed(Seed seed) {
        this.content = seed;
    }

    public Seed getContent() {
        return content;
    }
}
