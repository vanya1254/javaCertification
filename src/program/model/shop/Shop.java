package program.model.shop;

import program.model.toys.Toy;

import java.util.List;

public class Shop {
    private static final int startSize = 1;
    private int total;
    private List<Toy> store;

    public Shop(int total, List<Toy> store) {
        this.total = total;
        this.store = store;
    }

    public int getTotal() {
        return this.total;
    }

    public List<Toy> getStore() {
        return this.store;
    }

    public void addToy(String name, int count, double chance) {
        Toy newToy = new Toy(this.total, name.toLowerCase(), count, chance);
        this.total++;
        this.store.add(newToy);
    }

    public int getCountToys() {
        int countToys = 0;

        for (int i = 0; i < this.total; i++) {
            countToys += this.store.get(i).getCount();
        }
        return countToys;
    }

    public Toy getToy(int id) {
        return this.store.get(id);
    }



}
