package com.javacore.command;

import com.javacore.Main;

public class AuthorCommand extends ACommand{
    public AuthorCommand(String name) {super(name);}

    @Override
    public void execute() {
        System.out.println("My author is " + Main.AUTHOR);
    }
}
