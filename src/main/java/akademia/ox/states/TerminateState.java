package akademia.ox.states;

import akademia.ox.Player;
import akademia.ox.StateInfo;
import akademia.ox.StateQuestions;

public class TerminateState implements GameState {
    @Override
    public GameState moveToNextState() {
        return null;
    }

    @Override
    public boolean isGameOver() {
        return true;
    }

    @Override
    public String showStateInfo() {
        return StateInfo.TERMINATE_STATE.get();
    }

    @Override
    public void consumeInput(String query) {

    }

    @Override
    public String showQuestion() {
        return StateQuestions.TERMINATE_STATE.get();
    }

    @Override
    public Player showCurrentPlayer() {
        return null;
    }

    @Override
    public String showBoard() {
        return null;
    }
}
