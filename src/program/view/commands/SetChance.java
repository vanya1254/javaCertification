package program.view.commands;

import program.view.Console;

public class SetChance extends Command {
    private Console console;

    public SetChance(Console console) {
        this.console = console;
    }

    @Override
    public void description() {
        System.out.print("set chance toy\n");
    }

    @Override
    public void execute() {
        this.console.setChanceToy();
    }
}
