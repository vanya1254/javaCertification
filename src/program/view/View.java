package program.view;

import program.presenter.Presenter;

public abstract class View {

    public void setPresenter() {
        Presenter presenter = new Presenter();
    }

    public abstract void start();
}
