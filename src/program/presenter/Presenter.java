package program.presenter;

import program.model.Model;
import program.view.Console;
import program.view.View;

public class Presenter {
    private Model model;
    private Console console;

    public Presenter() {
        this.model = new Model();
        this.console = new Console(this);
    }

    public void start(){
        this.console.start();
    }

    public Model getModel() {
        return this.model;
    }

    public View getConsole() {
        return this.console;
    }

    public void addToy(String name, int count, double chance){
        this.model.addToyToShop(name, count, chance);
    }

    public boolean setChanceToy(String name, double chance){
        if(this.model.setChance(name, chance)) {
            return true;
        } return false;
    }

    public boolean drawToy(){
        if (this.model.draw()){
            return true;
        } return false;
    }

    public void giveToy(){
        this.model.gift();
    }

    public void saveStore(){
        this.model.save();
    }
}
