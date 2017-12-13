public class Dices {
    private short dicesScore[];
    private boolean dicesToReroll[];

    public Dices() {
        dicesScore = new short[5];
        dicesToReroll = new boolean[5];
    }

    public Dices(short[] dices) {
        this.dicesToReroll = new boolean[5];
        this.dicesScore = dices;
    }

    public short[] getDicesScore() {
        return dicesScore;
    }

    public void setDicesScore(short[] dicesScore) {
        this.dicesScore = dicesScore;
    }

    public boolean[] getDicesToReroll() {
        return this.dicesToReroll;
    }

    public void setDicesToReroll(boolean[] dicesToReroll) {
        this.dicesToReroll = dicesToReroll;
    }
}
