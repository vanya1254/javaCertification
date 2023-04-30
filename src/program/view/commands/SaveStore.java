package program.view.commands;

import program.view.Console;

public class SaveStore extends Command {
    public SaveStore(Console console) {
        super(console);
    }

    @Override
    public void description() {
        System.out.print("save store\n");
    }

    @Override
    public void execute() {

    }
}
