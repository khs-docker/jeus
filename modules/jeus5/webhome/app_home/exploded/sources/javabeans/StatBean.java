package javabeans;

import java.util.*;

public class StatBean
{
	private double[] numbers;
	public StatBean()
	{
		numbers = new double [2];
		numbers[0] = 0;
		numbers[1] = 1;
	}
		
	public double getAverage()
	{
		double sum = 0;
		for (int i=0; i < numbers.length; i++)
		{
			sum += numbers[i];
		}
		return sum/numbers.length;
	}
	
	public double getNumbers(int index)
	{
		return numbers[index];
	}
	
	public void setNumbers(double[] new_numbers)
	{
		numbers = new_numbers;
	}
	
	public void setNumbers(int index, double value)
	{
		numbers[index] = value;
	}
	
	public void setNumbersList(String values)
	{
		Vector n = new Vector();
		StringTokenizer tok = new StringTokenizer(values, ",");

		while (tok.hasMoreTokens())
			n.addElement(tok.nextToken());
		
		numbers = new double[n.size()];
		for (int i=0; i < numbers.length; i++)
			numbers[i] = Double.parseDouble((String) n.elementAt(i));
	}
		
	public String getNumbersList()
	{
		String list = new String();
		for (int i=0; i < numbers.length; i++)
		{
			if ( i != numbers.length)
				list += numbers[i] + ",";
			else
				list += numbers[i];
		}
		
		return list;
	}
	
	public int getNumbersSize()
	{
		return numbers.length;
	}
}

