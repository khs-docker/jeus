package jsftags;

import java.util.ArrayList;
import javax.faces.model.SelectItem;

public class ProductBean
{

    public ProductBean()
    {
        product = new ArrayList();
        productList = new ArrayList();
		currentProduct = new SelectItem("JEUS", "WAS", "TmaxSoft WAS");
        productList.add(currentProduct);
        productList.add(new SelectItem("Tmax", "TP Monitor", "TmaxSoft TP mon"));
        productList.add(new SelectItem("Anylink", "MCI", "TmaxSoft MCI"));
    }

    public SelectItem getCurrentProduct()
    {
        return currentProduct;
    }

    public void setCurrenteProduct(SelectItem selectitem)
    {
        currentProduct = selectitem;
    }

    public Object[] getProduct()
    {
        return product.toArray();
    }

    public void setProduct(Object aobj[])
    {
        int i = 0;
        if(null == aobj || (i = aobj.length) == 0)
            return;
        product.clear();
        product = new ArrayList(i);
        for(int j = 0; j < i; j++)
            product.add(aobj[j]);

    }

    public ArrayList getProductList()
    {
        return productList;
    }

    public void setProductList(ArrayList arraylist)
    {
        productList = arraylist;
    }

    ArrayList product;
    ArrayList productList;
    SelectItem currentProduct;
}
