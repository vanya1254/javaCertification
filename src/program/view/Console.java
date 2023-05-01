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
    private final static String EXCEPTION_INT = "\nPlease enter an integer\n";
    private final static String EXCEPTION_DOUBLE = "\nPlease enter a double number(ex. 1.2)\n";
    private final static String EXCEPTION_INT_VALUE = "\nShould be: 0 < YOUR\n";
    private final static String EXCEPTION_DOUBLE_VALUE = "\nShould be: 1 < YOUR < 2\n";

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


    public String scanString(String message){
        System.out.print(message);
        String str = sc.nextLine();
        return str;
    }

    public int scanInt(String message){
        while (true) {
            try {
                System.out.print(message);
                String value = sc.nextLine();
                int intValue = Integer.valueOf(value);

                if (intValue > 0) return intValue;
                else System.out.println(EXCEPTION_INT_VALUE);
            } catch (Exception e) {
                System.out.println(EXCEPTION_INT);
            }
        }
    }

    public double scanDouble(String message){
        while (true) {
            try {
                System.out.print(message);
                String value = sc.nextLine();
                double doubleValue = Double.valueOf(value);

                if (doubleValue > 1 && doubleValue < 2) return doubleValue;
                else System.out.println(EXCEPTION_DOUBLE_VALUE);
            } catch (Exception e) {
                System.out.println(EXCEPTION_DOUBLE);
            }
        }
    }

    public String getName(){
        String name = this.scanString(INPUT_NAME);
        return name;
    }

    public int getCount(){
        int count = this.scanInt(INPUT_COUNT);
        return count;
    }

    public double getChance(){
        double chance = this.scanDouble(INPUT_CHANCE);
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
