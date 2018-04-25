package akademia.ox;

public class GameInProgress implements GameState {
    private boolean isDraw;
    private boolean isVictory;

    @Override
    public GameState moveToNextState() {
        if (isNoEnd()) {
            return this;
        }
        if (checkVictory()) {
            return new VictoryState();
        } else {
            return null;
        }
    }

    private boolean checkVictory() {
        return isVictory && ! isDraw;
    }

    private boolean isNoEnd() {
        return ! isDraw && ! isVictory;
    }

    void setNoDrawNoVictory(){
        isDraw = false;
        isVictory = false;
    }

    void setVictory() {
        isVictory = true;
        isDraw = false;
    }
}
