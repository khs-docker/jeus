package sessions;

import javax.servlet.http.*;
import java.util.Vector;
import java.util.Enumeration;

// session server를 두고 clustering을 지원하려면
// session attribute 객체가 java.io.Serializable을 implement해야
// session server로 저장하거나 가져오는 것이 가능하다
public class Cart implements java.io.Serializable {
    Vector v = new Vector();
    String submit = null;
    String item = null;
    
    private void addItem(String name) 
    {
		v.addElement(name);
    }

    private void removeItem(String name) 
    {
		v.removeElement(name);
    }

    public void setItem(String name) 
    {
		item = name;
    }
    
    public void setSubmit(String s) 
    {
		submit = s;
    }

    public String[] getItems() 
    {
		String[] s = new String[v.size()];
		v.copyInto(s);
		return s;
    }
    
    public void processRequest(HttpServletRequest request) 
    {
		// null value for submit - user hit enter instead of clicking on 
		// "add" or "remove"
		if (submit == null) 
		    addItem(item);
	
		if (submit.equals("add"))
		    addItem(item);
		else if (submit.equals("remove")) 
		    removeItem(item);
		
		// reset at the end of the request
		reset();
    }

    // reset
    private void reset() 
    {
		submit = null;
		item = null;
    }
}
