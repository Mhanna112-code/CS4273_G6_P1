import static org.junit.Assert.assertEuqals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import main.java.CSVParsing.java

class CSVParsingTest{

    @Test
    public void testCase4(){

        CSVParsing SCVParsing = new SCVParsing();
        final string expected = "name rollno department result cgpa suvan 68 me pass 8.2 ";
        final string actual = SCVParsing.readDataLineByLine("C:\\Users\\hannmar\\h\\main\\java\\Data4.csv");

        assertEquals(expected, actual);
        fail("The output from CSVParsing or Data4.csv does not match expected output");
    }

}
