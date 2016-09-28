import ms.*;
import jeus.com.j2com.*;
import jeus.com.j2com.win32.*;

public class PptDemo {

    public static void main(String[] args) {
	try {
	    Ole32.CoInitialize();
	    _Application app = new _Application("PowerPoint.Application");
	    app.put("Visible", true);
	    Presentations preses = app.getPresentations();
		_Presentation pres = preses.Add(-1);
	    _Slide slide = pres.getSlides().Add(1,1);
	    Shapes shapes = slide.getShapes();
	    Shape shape = shapes.Item(new Integer(1));

		TextFrame frame = shape.getTextFrame();
	    TextRange range = frame.getTextRange();
	    range.setText("Welcome to Jeus J2COM");
		slide.getShapes().Item(new Integer(2)).getTextFrame().getTextRange().setText("J2COM Demonstration");

	    Ole32.CoUninitialize();
	}
	catch (Exception e) {
	    e.printStackTrace();
	} 
    }
}
