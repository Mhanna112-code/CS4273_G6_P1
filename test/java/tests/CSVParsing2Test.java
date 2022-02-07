import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import main.java.CSVParsing.java
class CSVParsingTest2 {
    @Test
        void test(){
            CSVParsing CSVParsing = new CSVParsing();
            String line = CSVParsing.readDataLineByLine("C:\\Users\\hannmar\\h\\main\\java\\Data2.csv");
            assertEquals(line, "name rollno department result cgpa aman 23 cse pass 8.9 rahul 45 ee fail 4.6 ");
            fail("Test Failed");
        }
}
