package src;

public class Room {

    // Class Variables:

    /**
     * The Maximum level available for the room to be upgraded to
     * only accessible to specialist room types.
     */
    protected int maxLevel;
    /**
     * defines the level of and by extension the effectiveness of the room's function between 1 - 5
     */
    protected int level;
    /**
     * Multiplier for damage dealt to the room
     */
    private float fragility;
    /**
     * boolean displaying whether
     */
    private boolean upgradable;

    // Constructors:

    /**
     * default constructor
     */
    protected Room() {

        this.maxLevel = 5;
        this.level = 1;
        this.fragility = 1.00f;
        this.upgradable = false;

    }

    /**
     * constructor with all parameters manually defined
     * @param level defines the selected level of the room in question
     * @param fragility defines the
     */
    protected Room(int level,
                   float fragility) {
        this.level = level;
        this.fragility = fragility;
    }

    // Methods:

    /**
     * Increases the level of the room by 1
     */
    protected void levelUp() {
        if (level++ > maxLevel) {
            level = maxLevel;
        } else {
            level++;
        }
    }
    /**
     *
     * @param levels how many levels to be increased by
     */
    public void levelUp(int levels) {
        level += levels;
    }

}
