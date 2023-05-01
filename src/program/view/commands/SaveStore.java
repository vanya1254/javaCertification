package program.view.commands;

import program.view.Console;

public class SaveStore extends Command {
    private Console console;

    public SaveStore(Console console) {
        this.console = console;
    }

    @Override
    public void description() {
        System.out.print("save store\n");
    }

    @Override
    public void execute() {
        this.console.saveStore();
    }
}
