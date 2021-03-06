#region Using directives

using System;
using System.Collections.Generic;
using System.Text;

#endregion

namespace DataEchoConsoleClient
{
	class DataEchoClient
	{
		static void Main(string[] args)
		{
			if (args.Length < 1)
			{
				Console.WriteLine("Usage : ");
				Console.WriteLine("       DataEchoClient DataEchoService URL");
				Console.WriteLine("       ex) DataEchoClient http://localhost:8088/DataEchoService/DataEchoService");
				return;
			}
			DataEchoService ds = new DataEchoService(args[0]);

			/* bool type */
			
			bool bl = (bool)ds.echoBoolean(true);
			string str = (string)ds.echoString("Hi Peter");
			Double dbl = (Double)ds.echoDouble(3.2232388);
			float flt = (float)ds.echoFloat((float)3.3222);
			int in1 = (int)ds.echoInteger(-2332);
			Byte by = (Byte)ds.echoByte(121);
			Decimal dec = (Decimal)ds.echoBigDecimal(3288899);
			DateTime dt = (DateTime)ds.echoCalendar(System.DateTime.UtcNow);
			
			Console.WriteLine("Boolean : " + bl);
			Console.WriteLine("String : " + str);
			Console.WriteLine("Double : " + dbl);
			Console.WriteLine("Float : " + flt);
			Console.WriteLine("Integer : " + in1);
			Console.WriteLine("Byte : " + by);
			Console.WriteLine("dec : " + dec);
			Console.WriteLine("DateTime : " + dt);

		}
	}
}
