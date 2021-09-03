package com.company;

import java.util.Objects;

/**
 * representation of a number in the screen
 */
public class ScreenNumber {
    String line1 = "._.";
    String line2 = "|.|";
    String line3 = "|_|";


    public ScreenNumber(String line1, String line2, String line3) {
        this.line1 = line1;
        this.line2 = line2;
        this.line3 = line3;
    }

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public String getLine2() {
        return line2;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public String getLine3() {
        return line3;
    }

    public void setLine3(String line3) {
        this.line3 = line3;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ScreenNumber that = (ScreenNumber) o;
        return line1.equals(that.line1) && line2.equals(that.line2) && line3.equals(that.line3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(line1, line2, line3);
    }

}
