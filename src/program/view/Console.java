package program.view;

import program.presenter.Presenter;
import program.view.commands.AddToy;
import program.view.commands.Command;
import program.view.commands.Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class Console extends View {
    private final static String INPUT_NAME = "Enter name of toy --> ";
    private final static String INPUT_COUNT = "Enter count of toys --> ";
    private final static String INPUT_CHANCE = "Enter chance of toy(ex. 1.0 < YOUR_CHOICE) --> ";
    private final static String INPUT_COMMAND = "Enter command --> ";


    private Scanner sc = new Scanner(System.in);
    private Presenter presenter;
    private Menu menu;

    public Console(Presenter presenter) {
        this.menu = new Menu(this);
        this.presenter = presenter;
    }

    @Override
    public void setPresenter() {
        Presenter presenter = new Presenter();
    }

    @Override
    public void start() {
        this.goMenu();
    }


    public String scanString(){
        String str = sc.nextLine();
        return str;
    }

    public int scanInt(){
        int intValue = sc.nextInt();
        sc.nextLine();
        return intValue;
    }

    public String getName(){
        System.out.print(INPUT_NAME);
        String name = sc.nextLine();
        return name;
    }

    public int getCount(){
        System.out.print(INPUT_COUNT);
        int count = sc.nextInt();
        sc.nextLine();
        return count;
    }

    public double getChance(){
        System.out.print(INPUT_CHANCE);
        double chance = sc.nextDouble();
        sc.nextLine();
        return chance;
    }

    public void goMenu(){
        while (true) {
            this.menu.description();
            System.out.print(INPUT_COMMAND);
            int command = sc.nextInt() - 1;
            sc.nextLine();
            this.menu.execute(command);
        }
    }

    public void addToy(){
        this.presenter.addToy(this.getName(), this.getCount(), this.getChance());
    }

    public void drawToy(){
        this.presenter.drawToy();
    }

    public void giveToy(){
        this.presenter.giveToy();
    }

    public void saveStore(){
        this.presenter.saveStore();
    }
}
