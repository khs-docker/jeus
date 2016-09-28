
package jsp2.simpletag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

public class SimpleTag extends SimpleTagSupport {
    public void doTag() throws JspException, IOException {
	getJspContext().getOut().write( "Welcome to JEUS !!" );
    }
}
