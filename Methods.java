import java.lang.reflect.*;
import java.io.*;

class Methods
{
	public static void Methods(String s)
	{
		
		try
		{
			PrintStream out = new PrintStream(new FileOutputStream("Methods.txt"));
			System.setOut(out);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		try
		{
			Class c = Class.forName(s);
			Method meth[] = c.getMethods();

			for(int i = 0; i<meth.length ; i++)
			{
				System.out.print(meth[i].getReturnType().getName() + " " + meth[i].getName() + "(");
				Class type[] = meth[i].getParameterTypes();
				for(int k =0 ; k<type.length ; k++)
				{
					System.out.print(" " +type[k]);
				}
				System.out.print(" )");
				System.out.println("");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
	