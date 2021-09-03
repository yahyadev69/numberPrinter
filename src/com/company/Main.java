package com.company;

public class Main {

    public static void main(String[] args) {

        // ask user for a number
        String[] number = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        // print the number in the screen
        ScreenNumberMapper.printNumbers(ScreenNumberMapper.convertToScreenNumber(number));
    }
}
