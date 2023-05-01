package program.presenter;

import program.model.Model;
import program.view.Console;
import program.view.View;
import program.view.commands.Command;

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

    public void drawToy(){
        this.model.draw();
    }

    public void giveToy(){
        this.model.gift();
    }

    public void saveStore(){
        this.model.save();
    }
}
