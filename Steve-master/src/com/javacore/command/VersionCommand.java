package com.javacore.command;

import com.javacore.Main;

public class VersionCommand extends ACommand {
    public VersionCommand(String name){super(name);}

    @Override
    public void execute() {
        System.out.println("My version is " + Main.VERSION);
    }
}
