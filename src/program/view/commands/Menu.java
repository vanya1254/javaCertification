package program.view.commands;

import program.view.Console;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Command> commands;
    private Console console = new Console();

    public Menu() {
        this.commands = new ArrayList<>();
        this.commands.add(new AddToy(console));
        this.commands.add(new DrawToy(console));
        this.commands.add(new GiveToy(console));
        this.commands.add(new SaveStore(console));
        this.commands.add(new Exit(console));
    }

    public List<Command> getCommands() {
        return this.commands;
    }

    public void description() {
        System.out.println("Menu:\n");
        for (int i = 0; i < this.commands.size(); i++) {
            System.out.printf("%d) ", i + 1);
            this.commands.get(i).description();
        }
    }

    public void execute(int command) {
        this.commands.get(command).execute();
    }
}
