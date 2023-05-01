package program.view.commands;

import program.view.Console;

public class GiveToy extends Command {
    private Console console;

    public GiveToy(Console console) {
        this.console = console;
    }

    @Override
    public void description() {
        System.out.print("give toy\n");
    }

    @Override
    public void execute() {
        this.console.giveToy();
    }
}
