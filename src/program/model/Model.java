package program.model;

import program.model.shop.Raffle;
import program.model.shop.Shop;
import program.model.toys.Toy;

public class Model {
    private Raffle raffle;
    private FileManager fM;
    private Shop shop;

    public Model() {
        this.fM = new FileManager();
        this.shop = fM.readJson();
        this.raffle = new Raffle(this.shop);
    }

    public void addToyToShop(String name, int count, double chance){
        this.shop.addToy(name, count, chance);
    }

    public boolean setChance(String name, double chance) {
        if (this.shop.setToyChance(name, chance)){
            return true;
        } return false;
    }

    public boolean draw(){
        if (this.raffle.drawToy()){
            return true;
        } return false;
    }

    public void gift(){
        Toy gift = this.raffle.giveToy();
        this.fM.writeJson(gift);
    }

    public void save(){
        this.fM.writeJson(this.shop);
    }
}
