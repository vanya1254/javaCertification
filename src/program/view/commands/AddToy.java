package program.view.commands;

import program.view.Console;

public class AddToy extends Command {

    private Console console;

    public AddToy(Console console) {
        this.console = console;
    }

    @Override
    public void description() {
        System.out.print("add toy\n");
    }

    @Override
    public void execute() {
        this.console.addToy();
    }
}
