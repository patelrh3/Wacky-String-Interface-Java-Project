public class RamStringTester 
{
	static String testString = "12345abcdef0a00a000000a00";
	static RamString FirstTest = new RamString(testString);

	public static void main (String[] args)
	{
		printHeading();
		FirstTest.getEvenCharacters();
		FirstTest.getOddCharacters();
		FirstTest.countNonDigits();
		FirstTest.ramifyString();
		FirstTest.convertDigitsToRomanNumeralsInSubstring(1,19);
	}
	public static void printHeading() // creates a method called printHeading
	{
		System.out.println("Rishabh Patel"); // prints out my name
		System.out.println("CMSC 256 - 001"); // prints out the course name and number and course section
		System.out.println("Project 2 - WackyStringInterface"); // prints out the project number and name
		System.out.println();
	}
	
	// Test the setter method for an empty string input
	public void testSetWackyString()
	{
		String testString = "";
		FirstTest.setWackyString(testString);
	}
	//Test the setter method for a null input
	public void testSetWackyString1()
	{
		String testString = null;
		FirstTest.setWackyString(testString);
	}
	//Tests if the setter method works properly when a string is inputed
	public void testSetWackyString2()
	{
		String testString = "abcdefghi123456";
		FirstTest.setWackyString(testString);
	}
	//Test if the getter works properly
	public void testGetWackyString()
	{
		FirstTest.getWackyString();
	}
	// Tests if the get even characters method accepts an empty string
	public void testGetEvenCharacters()
	{
		String testString = "";
		FirstTest.getEvenCharacters(); // should return an empty string
	}
	// Tests if the get odd characters method accepts a null value
	public void testGetEvenCharacters1()
	{
		String testString = null;
		FirstTest.getEvenCharacters();
	}
	// Tests if the even characters are returned and if the method written works correctly
	public void testGetEvenCharacters2()
	{
		String testString = "12345vcurams1234";
		FirstTest.getEvenCharacters(); // should return 2, 4, v, u, a, s, 2, 4 ---> which are the even characters in the string
	}
	// Tests if the odd characters are returned and if the method written works correctly
	public void testGetOddCharacters()
	{
		String testString = "12345vcurams1234";
		FirstTest.getOddCharacters(); // should return 1, 3, 5, c, r, m, 1, 3 ---> which are the odd characters in the string
	}
	// Tests if the count non digits method accepts an empty string
	public void testCountNonDigits()
	{
		String testString = "";
		FirstTest.countNonDigits(); // should return 0
	}
	// Tests if the count non digits method accepts a null
	public void testCountNonDigits1()
	{
		String testString = null;
		FirstTest.countNonDigits(); // should return 0
	}
	// Test if the count non digits method works correctly with a proper string
	public void testCountNonDigits2()
	{
		String testString = "abcdefgh123456";
		FirstTest.countNonDigits(); //should return 8
	}
	
	public void testRamifyString()
	{
		
	}
	
	// Tests the Roman numeral method error for Illegal Argument Exception
	public void testRomanNumeral()
	{
		FirstTest.convertDigitsToRomanNumeralsInSubstring(5, 1); // Throws an Illegal Argument Exception because the start position is greater than the end position
	}
	// Tests the Roman numeral method error for Index out of bounds with 0 as starting position
	public void testRomanNumeral1()
	{
		FirstTest.convertDigitsToRomanNumeralsInSubstring(0, 15); // Throws an Index Out of Bounds Exception because 0 is out of bounds
	}
	// Tests the Roman numeral method error for Index out of bounds with an invalid end position
	public void testRomanNumeral2()
	{
		String testString = "abcdefghijk123456";
		FirstTest.convertDigitsToRomanNumeralsInSubstring(1, 100);
	}
	
}
