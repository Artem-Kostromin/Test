package com.javacore.command;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public enum CommandRegistry {
    INSTANCE;

    static Map<String, ACommand> commands;

    static {
        commands = new HashMap<>();
        commands.put("version", new VersionCommand("version"));
        commands.put("author", new AuthorCommand("author"));
    }

    public ACommand getCommand(String name){
        return commands.get(name);
    }

    public void listCommands(){
        Iterator it = commands.entrySet().iterator();
        System.out.println("This is what I can talk about:");
        while (it.hasNext()){
            Map.Entry entry = (Map.Entry) it.next();
            System.out.println("*" + entry.getKey());
        }
    }
}
