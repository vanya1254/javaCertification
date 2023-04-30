package program.presenter;

import program.model.Model;
import program.view.Console;
import program.view.View;

public class Presenter {
    private Model model;
    private View view;

    public Presenter() {
        this.model = new Model();
        this.view = new Console();
    }

    public Model getModel() {
        return this.model;
    }

    public View getView() {
        return this.view;
    }

    public void addToy(){
        this.model.addToyToShop(this.view.);
    }
}
