package program.view.commands;

import program.view.Console;

public class DrawToy extends Command {
    public DrawToy(Console console) {
        super(console);
    }

    @Override
    public void description() {
        System.out.print("draw toy\n");
    }

    @Override
    public void execute() {

    }
}
