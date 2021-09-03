package main.com.company;

import java.util.*;

public class ScreenNumberMapper {

    public static Map<Integer, ScreenNumber> getBasicNumbers() {
        Map<Integer, ScreenNumber> basicNumbers = new HashMap ();
        basicNumbers.put(0, Constants.ZERO);
        basicNumbers.put(1, Constants.ONE);
        basicNumbers.put(2, Constants.TWO);
        basicNumbers.put(3, Constants.THREE);
        basicNumbers.put(4, Constants.FOUR);
        basicNumbers.put(5, Constants.FIVE);
        basicNumbers.put(6, Constants.SIX);
        basicNumbers.put(7, Constants.SEVEN);
        basicNumbers.put(8, Constants.EIGHT);
        basicNumbers.put(9, Constants.NINE);
        return basicNumbers;
    }

    /**
     * prints a list of ScreenNumber
     * @param numbers: numbers to print
     */
    public void printNumbers(List<ScreenNumber> numbers) {
        StringBuilder numbersFirsLines = new StringBuilder();
        StringBuilder numbersSecondLines = new StringBuilder();
        StringBuilder numbersThirdLines = new StringBuilder();

        numbers.forEach(screenNumber -> {
            numbersFirsLines.append(screenNumber.getFirstLine()).append(" ");
            numbersSecondLines.append(screenNumber.getSecondLine()).append(" ");
            numbersThirdLines.append(screenNumber.getThirdLine()).append(" ");
        });

        System.out.println(numbersFirsLines.toString());
        System.out.println(numbersSecondLines.toString());
        System.out.println(numbersThirdLines.toString());
    }

    /**
     * converts a number from its String array's format to a list of ScreenNumber
     * @param numbers array of string number (0...9)
     * @return ths ScreenNumber format of the number
     */
    public List<ScreenNumber> convertToScreenNumber( List<String> numbers) {
        Map<Integer, ScreenNumber> basicNumbers = getBasicNumbers();
        List<ScreenNumber> screenNumbers = new ArrayList<>();
        numbers.forEach( strNumber -> screenNumbers.add(basicNumbers.get(Integer.parseInt(strNumber))));
        return screenNumbers;
    }

    /**
     * Kip asking user for a positive integer until he gives it
     * @return user's entry number in List<String> format
     */
    public List<String> getUserEntry () {

        List<String> userEntry = new ArrayList<>();

        Scanner reader = new Scanner(System.in);  // Reading from System.in
        String replay;

        do {
            System.out.println("Enter a positive integer: ");
            replay = reader.nextLine(); // Scans the next token of the input as an int.
        } while(!replay.matches("[0-9]+"));

        //once finished
        reader.close();

        for (int i = 0; i < replay.trim().length() ; i++) {
            userEntry.add(replay.substring(i,i+1));
        }
        return userEntry;
    }

}
