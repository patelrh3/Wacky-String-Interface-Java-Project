public class RamString implements WackyStringInterface
{
	private String wackyString; // creates an empty string
	public RamString(String string) // default constructor
	{
		setWackyString(string);
	}
	public void setWackyString(String string) // setter for wackyString
	{
		wackyString = string;
	}
	public String getWackyString()  // getter for wackyString
	{
		return wackyString;
	}
	public String getEvenCharacters()  // gets even characters in the string
	{
		String evenCharString = ""; // creates an empty string
		for (int i = 0; i < wackyString.length(); i++) // for loop to access the whole string
		{
			if (i%2 == 1) // checks if the index is odd, if it is odd, the even character is accessed
			{
				evenCharString += (wackyString.charAt(i)); // adds the even character to the string evenCharString
			}
		}
		return wackyString;
	}
	public String getOddCharacters() // gets odd characters in the string
	{
		String oddCharString = ""; // creates an empty string
		for (int i = 0; i < wackyString.length(); i++) // for loop to access the whole string
		{
			if (i%2 == 0) // checks if the index is even, if it is even, the odd character is accessed
			{
				oddCharString += (wackyString.charAt(i)); // adds the odd character to the string oddCharString
			}
		}
		return oddCharString;
	}
	public int countNonDigits() // counts the non digits in the string
	{
		int count = 0; // creates a counter
		for (int i = 0; i < wackyString.length(); i++) // for loop to access the whole string
		{
			if (!(wackyString.charAt(i) == '0' || wackyString.charAt(i) == '1'         // checks what characters in the
					|| wackyString.charAt(i) == '2' || wackyString.charAt(i) == '3'	   // string are not digits
					|| wackyString.charAt(i) == '4' || wackyString.charAt(i) == '5'    //
					|| wackyString.charAt(i) == '6' || wackyString.charAt(i) == '7'    //
					|| wackyString.charAt(i) == '8' || wackyString.charAt(i) == '9'))
			{
				count += 1; // increments the count by 1
			}
		}
		return count;
	}
	public void ramifyString() // creates a method called ramifyString
	{
		for (int i = 0; i < wackyString.length(); i++)		// loops through every index
		{

			if (wackyString.charAt(i) == '0')		// if the character in wackyString equals '0'
			{
				if (wackyString.charAt(i+1) == '0')	// if the next consecutive character in wackyString equals '0'
				{
					wackyString = wackyString.replaceAll("00", "VCU");	// then replace it with 'Rams'
				}
				else
				{
					wackyString = wackyString.replace("0", "Rams");	// else replace it with 'VCU'
				}
			}
		}
		System.out.println(wackyString);
	}
	public void convertDigitsToRomanNumeralsInSubstring(int startPosition, int endPosition)
			throws MyIndexOutOfBoundsException, IllegalArgumentException 
	{
		if (startPosition < 1 || endPosition > wackyString.length()) // checks to see if the input is correctly formatted
		{
			throw new MyIndexOutOfBoundsException(); // if it isn't formatted correctly, it throws IndexOutOfBounds Error
		}
		if (startPosition > endPosition) // checks to see if the input is correctly formatted
		{
			throw new IllegalArgumentException(); // if it isn't formatted correctly, it throws IllegalArgumentException
		}
		
		for (int i = startPosition - 1; i < endPosition; i++) // for loop to access the string from the start and end positions
		{
				if(wackyString.charAt(i) == '1') // checks to see if the character at the index is 1
				{
	 				wackyString = wackyString.replace("1", "I"); // replaces the digit with it's roman numeral
				}
				if (wackyString.charAt(i) == '2') // checks to see if the character at the index is 2
				{
					wackyString = wackyString.replace("2", "II"); // replaces the digit with it's roman numeral
					endPosition += 1;
				}
				else if (wackyString.charAt(i) == '3') // checks to see if the character at the index is 3
				{
					wackyString = wackyString.replace("3", "III"); // replaces the digit with it's roman numeral
					endPosition += 2;
				}
				else if (wackyString.charAt(i) == '4') // checks to see if the character at the index is 4
				{
					wackyString = wackyString.replace("4", "IV"); // replaces the digit with it's roman numeral
					endPosition += 1;
				}
				else if (wackyString.charAt(i) == '5') // checks to see if the character at the index is 5
				{
					wackyString = wackyString.replace("5", "V"); // replaces the digit with it's roman numeral
				}
				else if (wackyString.charAt(i) == '6') // checks to see if the character at the index is 6
				{
					wackyString = wackyString.replace("6", "VI"); // replaces the digit with it's roman numeral
					endPosition += 1;
				}
				else if (wackyString.charAt(i) == '7') // checks to see if the character at the index is 7
				{
					wackyString = wackyString.replace("7", "VII"); // replaces the digit with it's roman numeral
					endPosition += 2;
				}
				else if (wackyString.charAt(i) == '8') // checks to see if the character at the index is 8
				{
					wackyString = wackyString.replace("8", "VIII"); // replaces the digit with it's roman numeral
					endPosition += 3;
				}
				else if (wackyString.charAt(i) == '9') // checks to see if the character at the index is 9
				{
					wackyString = wackyString.replace("9", "IX"); // replaces the digit with it's roman numeral
					endPosition += 1;
				}

			}
		System.out.println(wackyString);

		}

}
