import main.java.CSVParsing.java
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class CSVParsingTest {

	
	@Test
	void test() {
		CSVParsing CSVParsing = new CSVParsing();
		String derp = CSVParsing.readDataLineByLine("C:\\Users\\hannmar\\h\\main\\java\\Data1.csv");
		assertEquals(derp,"name rollno department result cgpa amar 42 cse pass 8.6 rohini 21 ece fail 3.2 ");
		fail("Not yet implemented");
	}

}
