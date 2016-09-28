package checkbox;

public class CheckTest 
{

    String b[] = null;
    
    public String[] getFruits() 
    {
		return b;
    }

    public void setFruits(String [] b) 
    {
		this.b = b;
    }
    
    public String getFruit(int index)
    {
    	return b[index];
    }
    
    public void setFruit(String fruit, int index)
    {
    	b[index] = fruit;
    }
    
    public int getFruitsNumber()
    {
    	return b.length;
    }
}
