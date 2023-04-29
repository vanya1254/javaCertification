package program.model.toys;

public abstract class Toy {
    private int id;
    private String name;
    private int count;
    private float chance;

    public Toy(int id, String name, int count, float chance) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.chance = chance;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setChance(float chance) {
        this.chance = chance;
    }
}
