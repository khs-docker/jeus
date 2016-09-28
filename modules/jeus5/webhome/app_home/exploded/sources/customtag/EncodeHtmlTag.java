package customtag;

import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.*;
import java.io.IOException;
import java.util.Hashtable;

public class EncodeHtmlTag extends BodyTagSupport
{
	static private Hashtable translations = makeTranslationTable();
	
	static private Hashtable makeTranslationTable()
	{
		Hashtable table = new Hashtable();
		table.put(new Character('<'), "&lt;");
		table.put(new Character('>'), "&gt;");
		table.put(new Character('&'), "&amp;");
		table.put(new Character('"'), "&quot;");
		table.put(new Character('\n'), "<br>");
		// 4 letters corresponding to the tab character
		table.put(new Character('\t'), "&nbsp;&nbsp;&nbsp;&nbsp;");
		return table;
	}
	
	static public String getTranslation (char c)
	{
		return (String) translations.get(new Character(c));
	}
	
	public int doAfterBody() throws JspException
	{
		BodyContent body = getBodyContent();
		String orig = body.getString();
		body.clearBody();
		int length = orig.length();
		
		StringBuffer result = new StringBuffer(Math.round(length * 1.1f));
		for (int i = 0; i < length; i++)
		{
			char c = orig.charAt(i);
			String translation = getTranslation(c);
			if (translation == null)
			{
				result.append(c);
			}
			else
			{
				result.append(translation);
			}
		}
		
		try 
		{
			getPreviousOut().print(result.toString());
		}
		catch (IOException e)
		{
			throw new JspTagException("unexpected IO error");
		}
		
		return SKIP_BODY;
	}
}

		