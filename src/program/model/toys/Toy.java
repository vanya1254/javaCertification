package program.model.toys;

public class Toy {
    private int id;
    private String name;
    private int count;
    private double chance;

    public Toy(int id, String name, int count, double chance) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.chance = chance;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setChance(double chance) {
        this.chance = chance;
    }

    public int getCount() {
        return this.count;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("{id: %d, name: %s, count: %d, chance: %2.1f}", this.id, this.name, this.count, this.chance);
    }
}
