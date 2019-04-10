package com.javacore.accessory;

import java.util.ArrayList;

public class InputAnalyzer {
    public static String inputAnalyzer(String input){
        String[] keyWords = {"weather", "time", "version", "bye", "author"};
        //keyWords."weather", "time", "version", "bye"};

        ArrayList arListOFInput = new ArrayList();

        String[] inputArr = input.split(" ");
        for (String i:inputArr){
            arListOFInput.add(i);
        }

        String output = "Noup";

        for(String j:keyWords){
            if (arListOFInput.contains(j)){
                output = j;
                break;
            }
        }
        return output;
    }
}
