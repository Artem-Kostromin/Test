package com.javacore.command;

public abstract class ACommand {
    protected  String name;
    //protected  String

    public ACommand(String name){this.name = name;}

    public void execute(){
        System.out.println("Command " + "'" + name + "'" + " not supported!");
    }

}
