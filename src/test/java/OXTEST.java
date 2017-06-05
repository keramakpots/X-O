
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class OXTEST {
    @Test
    void placeXOnEmptyCell() {
        Game game = new Game();
        game.initGame();
        game.updateGameState( 2,2);
        assertEquals(Seed.CROSS, game.getBoard().getCell(2, 2));
    }

}
