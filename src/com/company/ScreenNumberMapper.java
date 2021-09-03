package com.company;

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
     * prints a nist of ScreenNumber
     * @param numbers: numbers to print
     */
    public static void printNumbers(List<ScreenNumber> numbers) {
        StringBuilder numbersFirsLines = new StringBuilder();
        StringBuilder numbersSecondLines = new StringBuilder();
        StringBuilder numbersThirdLines = new StringBuilder();

        numbers.forEach(screenNumber -> {
            numbersFirsLines.append(screenNumber.getLine1()).append(" ");
            numbersSecondLines.append(screenNumber.getLine2()).append(" ");
            numbersThirdLines.append(screenNumber.getLine3()).append(" ");
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
    public static List<ScreenNumber> convertToScreenNumber( String [] numbers) {
        Map<Integer, ScreenNumber> basicNumbers = getBasicNumbers();
        List<ScreenNumber> screenNumbers = new ArrayList<>();
        Arrays.stream(numbers).forEach( strNumber -> screenNumbers.add(basicNumbers.get(Integer.parseInt(strNumber))));
        return screenNumbers;
    }


}
