package akademia.ox;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class BoardTests {
    Random random = new Random();

    @Test
    public void Board_afterCreateBoardWithXandYRows_boardSizeIsEqualMultiplicationXandY() {
        int x = Math.abs(random.nextInt())+1;
        int y = Math.abs(random.nextInt())+1;
        Board board = new Board(x,y);
        int boardSize = board.boardSize();
        Assert.assertEquals(boardSize, x*y);
    }

    @Test(expectedExceptions = IllegalArgumentException.class, invocationCount = 10)
    public void Board_afterCreateBoardWithNegativeInput_illegalArgumentExceptionIsThrown() {
        int x = -1*Math.abs(random.nextInt());
        int y = -1*Math.abs(random.nextInt());
        Board board = new Board(x,y);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void Board_afterCreateBoardWithZeroInput_illegalArgumentExceptionIsThrown() {
        int x = 0;
        int y = 0;
        Board board = new Board(x,y);
    }



    @Test(invocationCount = 10)
    public void emptyBoard_afterGetByRowAndCol_emptyIsReturned() {
        int x = Math.abs(random.nextInt()+1);
        int y = Math.abs(random.nextInt() + 1);
        Board board = new Board(x,y);

        int row = random.nextInt(x)+1;
        int col = random.nextInt(y)+1;

        GameCharacter character = board.getCharacter(row, col);
        Assert.assertEquals(character, GameCharacter.EMPTY);
    }

    @Test(invocationCount = 100)
    public void emptyBoard_afterGetByFieldNumber_emptyIsReturned() {
        int x = Math.abs(random.nextInt((int)Math.sqrt(Integer.MAX_VALUE)))+1;
        int y = Math.abs(random.nextInt((int)Math.sqrt(Integer.MAX_VALUE)))+1;
        Board board = new Board(x,y);
        int fieldNumber = random.nextInt(x*y)+1;


        GameCharacter character = board.getCharacter(fieldNumber);
        Assert.assertEquals(character, GameCharacter.EMPTY);
    }





}
