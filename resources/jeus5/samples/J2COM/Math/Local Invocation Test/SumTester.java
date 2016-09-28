package sample;

import jeus.com.j2com.*;

public class SumTester
{
	public static void main(String[] args) 
	{
		try {	
			IArithmetic sumInterface = new IArithmetic("Math.Arithmetic");
			int sum=sumInterface.sum(3,4);
			System.out.println("3 + 4 = " +sum );
		} catch (COMException e) { 
			e.printStackTrace();
		}
	}
}
