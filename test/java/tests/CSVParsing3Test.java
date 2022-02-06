import main.java.CSVParsing.java

class CSVParsingTest3 {

	
	@Test
	void test() {
		CSVParsing CSVParsing = new CSVParsing();
		String derp = CSVParsing.readDataLineByLine("C:\\Users\\hannmar\\h\\main\\java\\Data3.csv");
		assertEquals(derp, "name rollno department result cgpa pratik 65 cse pass 7.2 raunak 23 me pass 9.1 ");
	}

}
