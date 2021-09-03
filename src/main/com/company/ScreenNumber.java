package main.com.company;

import java.util.Objects;

/**
 * representation of a number in the screen
 */
public class ScreenNumber {
    String firstLine = "._.";
    String secondLine = "|.|";
    String thirdLine = "|_|";


    public ScreenNumber(String line1, String line2, String line3) {
        this.firstLine = line1;
        this.secondLine = line2;
        this.thirdLine = line3;
    }

    public String getFirstLine() {
        return firstLine;
    }

    public void setFirstLine(String firstLine) {
        this.firstLine = firstLine;
    }

    public String getSecondLine() {
        return secondLine;
    }

    public void setSecondLine(String secondLine) {
        this.secondLine = secondLine;
    }

    public String getThirdLine() {
        return thirdLine;
    }

    public void setThirdLine(String thirdLine) {
        this.thirdLine = thirdLine;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ScreenNumber that = (ScreenNumber) o;
        return firstLine.equals(that.firstLine) && secondLine.equals(that.secondLine) && thirdLine.equals(that.thirdLine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstLine, secondLine, thirdLine);
    }

}
