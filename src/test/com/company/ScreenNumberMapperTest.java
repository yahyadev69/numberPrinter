package test.com.company;

import main.com.company.ScreenNumber;
import main.com.company.ScreenNumberMapper;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;


class ScreenNumberMapperTest {
    @org.junit.jupiter.api.Test
    void convertToScreenNumber() {

        ScreenNumber sn_9 = new ScreenNumber("._.", "|_|", "..|");
        ScreenNumber sn_1 = new ScreenNumber("...", "..|", "..|");
        ScreenNumber sn_0 = new ScreenNumber("._.", "|.|", "|_|");

        List<String> numbers = new ArrayList<>();
        numbers.add("9");
        numbers.add("1");
        numbers.add("0");

        List<ScreenNumber> expected  = new ArrayList<>();
        expected.add(sn_9);
        expected.add(sn_1);
        expected.add(sn_0);
        List<ScreenNumber> actual = new ScreenNumberMapper().convertToScreenNumber(numbers);

        Assert.assertEquals(expected, actual);
    }
}