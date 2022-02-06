import main.java.CSVParsing.java
class CSVParsingTest {

	
	@Test
	void test() {
		CSVParsing CSVParsing = new CSVParsing();
		String derp = CSVParsing.readDataLineByLine("C:\\Users\\hannmar\\h\\main\\java\\Data1.csv");
		assertEquals(derp,"name rollno department result cgpa amar 42 cse pass 8.6 rohini 21 ece fail 3.2 ");
		fail("Not yet implemented");
	}

}
