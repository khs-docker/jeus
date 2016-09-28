package num;

import java.util.*;

public class NumberGuessBean 
{
	int answer;
	boolean success;
	String hint;
	int numGuesses;

	public NumberGuessBean() 
	{
		reset();
	}

  	public void reset() 
  	{
    	answer = Math.abs(new Random().nextInt() % 100) + 1;
    	success = false;
    	numGuesses = 0;
  	}

	public void setGuess(String guess) 
	{
		numGuesses++;

		int number;
		
		try {
			number = Integer.parseInt(guess);
    	}
		catch (NumberFormatException e) {
			number = -1;
		}

		if (number == answer) 
		{
			success = true;
		}
    	else if (number == -1) 
    	{
      		hint = "to write a number next time";
    	}
    	else if (number < answer) 
    	{
      		hint = "higher";
    	}
    	else if (number > answer) 
    	{
      		hint = "lower";
    	}
  	}
  
  	public int getAnswer()
  	{
	  	return answer;
  	}

  	public boolean getSuccess() 
  	{
    	return success;
  	}

  	public String getHint() 
  	{
    	return hint;
  	}

  	public int getNumGuesses() 
  	{
    	return numGuesses;
  	}
}
