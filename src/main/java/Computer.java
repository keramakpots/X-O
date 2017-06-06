
public class Computer {
    public Board markField(Board board, Player player) {
        if(board.getBoard().get(5).getContent() == Seed._) {
            Cell cell = board.getBoard().get(5);
            cell.setSeed(player.getSeed());
            board.getBoard().put(5, cell);
        } else if(board.getBoard().get(1).getContent() == Seed._) {
            Cell cell = board.getBoard().get(1);
            cell.setSeed(player.getSeed());
            board.getBoard().put(1, cell);
        } else if(board.getBoard().get(3).getContent() == Seed._) {
            Cell cell = board.getBoard().get(3);
            cell.setSeed(player.getSeed());
            board.getBoard().put(3, cell);
        } else if(board.getBoard().get(7).getContent() == Seed._) {
            Cell cell = board.getBoard().get(7);
            cell.setSeed(player.getSeed());
            board.getBoard().put(7, cell);
        } else if(board.getBoard().get(9).getContent() == Seed._) {
            Cell cell = board.getBoard().get(9);
            cell.setSeed(player.getSeed());
            board.getBoard().put(9, cell);
        } else if(board.getBoard().get(2).getContent() == Seed._) {
            Cell cell = board.getBoard().get(2);
            cell.setSeed(player.getSeed());
            board.getBoard().put(2, cell);
        } else if(board.getBoard().get(4).getContent() == Seed._) {
            Cell cell = board.getBoard().get(4);
            cell.setSeed(player.getSeed());
            board.getBoard().put(4, cell);
        } else if(board.getBoard().get(6).getContent() == Seed._) {
            Cell cell = board.getBoard().get(6);
            cell.setSeed(player.getSeed());
            board.getBoard().put(6, cell);
        } else if(board.getBoard().get(8).getContent() == Seed._) {
            Cell cell = board.getBoard().get(8);
            cell.setSeed(player.getSeed());
            board.getBoard().put(8, cell);
        }
        return board;
    }

}
