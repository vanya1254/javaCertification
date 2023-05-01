package program.view.commands;

import program.view.Console;

public class DrawToy extends Command {
    private Console console;

    public DrawToy(Console console) {
        this.console = console;
    }

    @Override
    public void description() {
        System.out.print("draw toy\n");
    }

    @Override
    public void execute() {
        this.console.drawToy();
    }
}
