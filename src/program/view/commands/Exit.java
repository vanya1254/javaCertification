package program.view.commands;

import program.view.Console;

import static java.lang.System.exit;

public class Exit extends Command {
    public Exit(Console console) {
        super(console);
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
