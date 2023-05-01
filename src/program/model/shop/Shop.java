package program.model.shop;

import program.model.toys.Toy;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private int total;
    private List<Toy> store;

    public Shop(int total, List<Toy> store) {
        this.total = total;
        this.store = store;
    }

    public Shop(){
        this.total = 0;
        this.store = new ArrayList<Toy>();
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

    public Toy findToyByName(String name) {
        if (this.total != 0) {
            for (int i = 0; i < this.total; i++) {
                if (this.store.get(i).getName().equals(name))
                    return this.store.get(i);
            }
        }
        return null;
    }

    public boolean setToyChance(String name, double chance){
        Toy toy = this.findToyByName(name);
        if (toy != null) {
            toy.setChance(chance);
            return true;
        } return false;
    }

}
