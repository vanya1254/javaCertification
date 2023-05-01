package program.view.commands;

import program.view.Console;

import static java.lang.System.exit;

public class Exit extends Command {
    private Console console;

    public Exit(Console console) {
        this.console = console;
    }

    @Override
    public void description() {
        System.out.print("exit\n");
    }

    @Override
    public void execute() {
        exit(0);
    }
}
