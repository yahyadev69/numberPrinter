package main.com.company;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // creates new screen mapper object
        ScreenNumberMapper snm = new ScreenNumberMapper();

        // ask user for a number witch will be returned as list of string (ex List("9", "1", "0"))
        List<String> userEntry = snm.getUserEntry();

        // converts the entry number to a list of ScreenNumber objects
        List<ScreenNumber> screenNumbers = snm.convertToScreenNumber(userEntry);

        // print the number in the screen
        snm.printNumbers(screenNumbers);
    }
}
