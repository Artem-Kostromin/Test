package com.javacore;
import com.javacore.accessory.InputAnalyzer;
import com.javacore.command.ACommand;
import com.javacore.command.CommandRegistry;

import java.util.Scanner;
//import com.sun.xml.internal.bind.annotation.OverrideAnnotationOf;

public class Main {
    public static final String AUTHOR = "Kostromin Artem";
    public static final String APP_NAME = "Steve";
    public static final String VERSION = "0.0.0";

    public static void main(String[] args) {
        System.out.println("Hello, my name is " + APP_NAME + "!");
        CommandRegistry.INSTANCE.listCommands();
        System.out.println("How can i help you?");
        Scanner in = new Scanner(System.in);
        String refactorIn = "";
        while (in.hasNext()) {
            refactorIn = InputAnalyzer.inputAnalyzer(in.nextLine());
            String commandName = refactorIn;
            ACommand command = CommandRegistry.INSTANCE.getCommand(commandName);
            command.execute();
            if (refactorIn.equals("bye")) break;
        }


        /*String commandName = "version";
        ACommand command = CommandRegistry.INSTANCE.getCommand(commandName);
        command.execute();
        commandName = "author";
        command = CommandRegistry.INSTANCE.getCommand(commandName);
        command.execute();

        commandName = "some new command";
        command = CommandRegistry.INSTANCE.getCommand(commandName);
        command.execute();


        // Внутренние ананимные классы, в которых можно что-то переопределять
        ACommand command_anon = new ACommand("anonymous") {
            @Override
            public  void execute(){
                System.out.println("Executing anonymous class");
            }
        };
        command_anon.execute();

        CommandRegistry.INSTANCE.listCommands();*/
    }
}