package program;

import com.google.gson.Gson;
import program.model.FileManager;
import program.model.shop.Shop;
import program.presenter.Presenter;
import program.view.Console;

public class Program {
    public static void main(String[] args) {
//        FileManager mg = new FileManager();
//        Shop shop = mg.readJson();
//
//        System.out.println(shop.getStore());

//        Console cs = new Console();
//        cs.goMenu();

        Presenter ps = new Presenter();
        ps.start();
    }
}
