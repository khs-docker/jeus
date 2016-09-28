/** created by j2comGen version 1.0.5
*   from TypeLib at C:\Program Files\Microsoft Office\Office\MSPPT9.OLB
*/
package ms;

import jeus.com.j2com.*;
import jeus.com.j2com.constant.*;
import jeus.com.j2com.io.*;
import java.io.*;

public class Shape extends DispatchPtr
{
	public Shape(String progid) throws COMException { super(progid);}
	public Shape(IUnknown other) throws COMException { super(other);}

	public Shape(GUID ClsID) throws COMException { super(ClsID);}

	public DispatchPtr getApplication() throws COMException
	{
		return (DispatchPtr) get("Application");
	}

	public int getCreator() throws COMException
	{
		return ((Integer) get("Creator")).intValue();
	}

	public DispatchPtr getParent() throws COMException
	{
		return (DispatchPtr) get("Parent");
	}

	public void Apply() throws COMException
	{
		invoke("Apply");
	}

	public void Delete() throws COMException
	{
		invoke("Delete");
	}

	public void Flip(int FlipCmd) throws COMException
	{
		invokeN("Flip", new Object[] {new Integer(FlipCmd)});
	}

	public void IncrementLeft(float Increment) throws COMException
	{
		invokeN("IncrementLeft", new Object[] {new Float(Increment)});
	}

	public void IncrementRotation(float Increment) throws COMException
	{
		invokeN("IncrementRotation", new Object[] {new Float(Increment)});
	}

	public void IncrementTop(float Increment) throws COMException
	{
		invokeN("IncrementTop", new Object[] {new Float(Increment)});
	}

	public void PickUp() throws COMException
	{
		invoke("PickUp");
	}

	public void RerouteConnections() throws COMException
	{
		invoke("RerouteConnections");
	}

	public void ScaleHeight(float Factor, int RelativeToOriginalSize, int fScale) throws COMException
	{
		invokeN("ScaleHeight", new Object[] {new Float(Factor), new Integer(RelativeToOriginalSize), new Integer(fScale)});
	}

	public void ScaleWidth(float Factor, int RelativeToOriginalSize, int fScale) throws COMException
	{
		invokeN("ScaleWidth", new Object[] {new Float(Factor), new Integer(RelativeToOriginalSize), new Integer(fScale)});
	}

	public void SetShapesDefaultProperties() throws COMException
	{
		invoke("SetShapesDefaultProperties");
	}

	public ShapeRange Ungroup() throws COMException
	{
		return (new ShapeRange((DispatchPtr)invoke("Ungroup")));
	}

	public void ZOrder(int ZOrderCmd) throws COMException
	{
		invokeN("ZOrder", new Object[] {new Integer(ZOrderCmd)});
	}

	public Adjustments getAdjustments() throws COMException
	{
		return ( new Adjustments((DispatchPtr)  get("Adjustments")));
	}

	public int getAutoShapeType() throws COMException
	{
		return ((Integer) get("AutoShapeType")).intValue();
	}

	public void setAutoShapeType(int pint) throws COMException
	{
		put("AutoShapeType", new Integer(pint));
	}

	public int getBlackWhiteMode() throws COMException
	{
		return ((Integer) get("BlackWhiteMode")).intValue();
	}

	public void setBlackWhiteMode(int pint) throws COMException
	{
		put("BlackWhiteMode", new Integer(pint));
	}

	public CalloutFormat getCallout() throws COMException
	{
		return ( new CalloutFormat((DispatchPtr)  get("Callout")));
	}

	public int getConnectionSiteCount() throws COMException
	{
		return ((Integer) get("ConnectionSiteCount")).intValue();
	}

	public int getConnector() throws COMException
	{
		return ((Integer) get("Connector")).intValue();
	}

	public ConnectorFormat getConnectorFormat() throws COMException
	{
		return ( new ConnectorFormat((DispatchPtr)  get("ConnectorFormat")));
	}

	public FillFormat getFill() throws COMException
	{
		return ( new FillFormat((DispatchPtr)  get("Fill")));
	}

	public GroupShapes getGroupItems() throws COMException
	{
		return ( new GroupShapes((DispatchPtr)  get("GroupItems")));
	}

	public float getHeight() throws COMException
	{
		return ((Float) get("Height")).floatValue();
	}

	public void setHeight(float pfloat) throws COMException
	{
		put("Height", new Float(pfloat));
	}

	public int getHorizontalFlip() throws COMException
	{
		return ((Integer) get("HorizontalFlip")).intValue();
	}

	public float getLeft() throws COMException
	{
		return ((Float) get("Left")).floatValue();
	}

	public void setLeft(float pfloat) throws COMException
	{
		put("Left", new Float(pfloat));
	}

	public LineFormat getLine() throws COMException
	{
		return ( new LineFormat((DispatchPtr)  get("Line")));
	}

	public int getLockAspectRatio() throws COMException
	{
		return ((Integer) get("LockAspectRatio")).intValue();
	}

	public void setLockAspectRatio(int pint) throws COMException
	{
		put("LockAspectRatio", new Integer(pint));
	}

	public String getName() throws COMException
	{
		return (String) get("Name");
	}

	public void setName(String pString) throws COMException
	{
		put("Name", pString);
	}

	public ShapeNodes getNodes() throws COMException
	{
		return ( new ShapeNodes((DispatchPtr)  get("Nodes")));
	}

	public float getRotation() throws COMException
	{
		return ((Float) get("Rotation")).floatValue();
	}

	public void setRotation(float pfloat) throws COMException
	{
		put("Rotation", new Float(pfloat));
	}

	public PictureFormat getPictureFormat() throws COMException
	{
		return ( new PictureFormat((DispatchPtr)  get("PictureFormat")));
	}

	public ShadowFormat getShadow() throws COMException
	{
		return ( new ShadowFormat((DispatchPtr)  get("Shadow")));
	}

	public TextEffectFormat getTextEffect() throws COMException
	{
		return ( new TextEffectFormat((DispatchPtr)  get("TextEffect")));
	}

	public TextFrame getTextFrame() throws COMException
	{
		return ( new TextFrame((DispatchPtr)  get("TextFrame")));
	}

	public ThreeDFormat getThreeD() throws COMException
	{
		return ( new ThreeDFormat((DispatchPtr)  get("ThreeD")));
	}

	public float getTop() throws COMException
	{
		return ((Float) get("Top")).floatValue();
	}

	public void setTop(float pfloat) throws COMException
	{
		put("Top", new Float(pfloat));
	}

	public int getType() throws COMException
	{
		return ((Integer) get("Type")).intValue();
	}

	public int getVerticalFlip() throws COMException
	{
		return ((Integer) get("VerticalFlip")).intValue();
	}

	public Object getVertices() throws COMException
	{
		return (Object) get("Vertices");
	}

	public int getVisible() throws COMException
	{
		return ((Integer) get("Visible")).intValue();
	}

	public void setVisible(int pint) throws COMException
	{
		put("Visible", new Integer(pint));
	}

	public float getWidth() throws COMException
	{
		return ((Float) get("Width")).floatValue();
	}

	public void setWidth(float pfloat) throws COMException
	{
		put("Width", new Float(pfloat));
	}

	public int getZOrderPosition() throws COMException
	{
		return ((Integer) get("ZOrderPosition")).intValue();
	}

	public OLEFormat getOLEFormat() throws COMException
	{
		return ( new OLEFormat((DispatchPtr)  get("OLEFormat")));
	}

	public LinkFormat getLinkFormat() throws COMException
	{
		return ( new LinkFormat((DispatchPtr)  get("LinkFormat")));
	}

	public PlaceholderFormat getPlaceholderFormat() throws COMException
	{
		return ( new PlaceholderFormat((DispatchPtr)  get("PlaceholderFormat")));
	}

	public AnimationSettings getAnimationSettings() throws COMException
	{
		return ( new AnimationSettings((DispatchPtr)  get("AnimationSettings")));
	}

	public ActionSettings getActionSettings() throws COMException
	{
		return ( new ActionSettings((DispatchPtr)  get("ActionSettings")));
	}

	public Tags getTags() throws COMException
	{
		return ( new Tags((DispatchPtr)  get("Tags")));
	}

	public void Cut() throws COMException
	{
		invoke("Cut");
	}

	public void Copy() throws COMException
	{
		invoke("Copy");
	}

	public void Select(int Replace) throws COMException
	{
		invokeN("Select", new Object[] {new Integer(Replace)});
	}

	public ShapeRange Duplicate() throws COMException
	{
		return (new ShapeRange((DispatchPtr)invoke("Duplicate")));
	}

	public int getMediaType() throws COMException
	{
		return ((Integer) get("MediaType")).intValue();
	}

	public int getHasTextFrame() throws COMException
	{
		return ((Integer) get("HasTextFrame")).intValue();
	}

	public SoundFormat getSoundFormat() throws COMException
	{
		return ( new SoundFormat((DispatchPtr)  get("SoundFormat")));
	}

	public DispatchPtr getScript() throws COMException
	{
		return ((DispatchPtr) get("Script"));
	}

	public String getAlternativeText() throws COMException
	{
		return (String) get("AlternativeText");
	}

	public void setAlternativeText(String pString) throws COMException
	{
		put("AlternativeText", pString);
	}

	public int getHasTable() throws COMException
	{
		return ((Integer) get("HasTable")).intValue();
	}

	public Table getTable() throws COMException
	{
		return ( new Table((DispatchPtr)  get("Table")));
	}

	public void Export(String PathName, int Filter, int ScaleWidth, int ScaleHeight, int ExportMode) throws COMException
	{
		invokeN("Export", new Object[] {PathName, new Integer(Filter), new Integer(ScaleWidth), new Integer(ScaleHeight), new Integer(ExportMode)});
	}


}
