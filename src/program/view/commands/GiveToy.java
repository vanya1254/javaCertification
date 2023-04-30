package program.view.commands;

import program.view.Console;

public class GiveToy extends Command {

    public GiveToy(Console console) {
        super(console);
    }

    @Override
    public void description() {
        System.out.print("give toy\n");
    }

    @Override
    public void execute() {

    }
}
