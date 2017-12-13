public class DicesScore {
    private short dices[];
    public DicesScore(){
        dices = new short[5];
    }
    public DicesScore(short[] dices){
        this.dices = dices;
    }
    public short[] getDices() {
        return dices;
    }

    public void setDices(short[] dices) {
        this.dices = dices;
    }
}
