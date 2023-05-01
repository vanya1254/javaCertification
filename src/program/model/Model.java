package program.model;

import program.model.shop.Raffle;
import program.model.shop.Shop;

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

    public void draw(){
        this.raffle.drawToy();
    }

    public void gift(){
        this.raffle.giveToy();
    }

    public void save(){
        this.fM.writeJson(this.shop);
    }
}
