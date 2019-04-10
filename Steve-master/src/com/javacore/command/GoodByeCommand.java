package com.javacore.command;

public class GoodByeCommand extends ACommand {
    public GoodByeCommand(String name){super(name);}

    @Override
    public void execute() {
        System.out.println("Good bye, my friend!");
    }
}
