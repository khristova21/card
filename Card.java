/**
 * 
 * @author Krisi Hristova 
 *
 */
public class Card
{
	//fields
	public static final int KING = 11, QUEEN = 12, JACK = 13, ACE= 1;
	private int value;	 //1 to 10
	private char suit; //spades, hearts, diamonds, clubs
	
	//constructors
	
	public Card(char suitInput, int valueInput)
	{
		suit = suitInput;
		value = valueInput;
	}

	//methods
	public int getValue()
	{
		return value;
	}
	public char getSuit()
	{
		return suit;
	}
	public String toString()
	{
		return "
	}
}
