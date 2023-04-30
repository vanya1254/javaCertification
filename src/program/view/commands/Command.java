package program.view.commands;

import program.view.Console;

public abstract class Command {

    private Console console;

    public Command(Console console) {
        this.console = console;
    }

    public abstract void description();
    public abstract void execute();
}
