
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
        if(this.seed == Seed.X) {
            this.seed = Seed.O;
        } else {
            this.seed = Seed.X;
        }
    }
    public Seed getSeed() {
        return this.seed;
    }

}
