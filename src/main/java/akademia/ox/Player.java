package akademia.ox;

public class Player {
    private int points;
    private String name;
    private GameCharacter character;


    public Player(String name) {
        this.name = name;
        this.points = 0;
    }

    public String showName() {
        return name;
    }

    public int showPoints() {
        return points;
    }

    public void incrementPoints(int newPoints) {
        if (newPoints >= 0) {
            points += newPoints;
        }
        else {
            throw new IllegalArgumentException("Points shouldn't be negative");
        }
    }

    public void assignCharacter(GameCharacter character) {
        this.character = character;
    }

    public GameCharacter whichCharacter() {
        return character;
    }


    public void swapCharacter() {
        character = character.getOpposite();
    }
}
