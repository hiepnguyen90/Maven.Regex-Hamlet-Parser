import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class HamletParserTest {
    private String hamletText;
    private HamletParser hamletParser;

    @Before
    public void setUp() {
        this.hamletParser = new HamletParser();
        this.hamletText = hamletParser.getHamletData();
    }

    @Test
    public void testChangeHamletToLeon() {
        hamletParser.changeHamletToLeon();
        Pattern pattern = Pattern.compile("Hamlet", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(hamletParser.getHamletData());



        Assert.assertFalse(matcher.find());
    }

    @Test
    public void testChangeHoratioToTariq() {
        hamletParser.changeHoratioToTariq();
        Pattern pattern = Pattern.compile("Horatio", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(hamletParser.getHamletData());



        Assert.assertFalse(matcher.find());
    }

    @Test
    public void testFindHoratio() {
        int actual = hamletParser.findHoratio();
        int expected = 158;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testFindHamlet() {
        int actual = hamletParser.findHamlet();
        int expected = 472;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testFindLeon(){

    }

    @Test
    public void testFindTarik(){}
}