
public class Player {
    private String name;
    private Seed seed;

    public Player(Seed seed) {
        this.seed = seed;
        this.name = "";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void switchSeed() {
        if(this.seed.equals(Seed.CROSS)) {
            this.seed = Seed.NOUGHT;
        } else {
            this.seed = Seed.CROSS;
        }
    }
    public Seed getSeed() {
        return this.seed;
    }

}
