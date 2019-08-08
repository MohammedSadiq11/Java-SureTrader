/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mithun
 */
public class ProdLink {
    private int product_id; 
    private String product_name;
    private String category;
    private String business_type;
    private float price ;
    private String date;
    private int quantity;
    
    public ProdLink(int product_id,String product_name,String category,float price,int quantity ,String business_type,String date)
    {
        this.product_id=product_id;
        this.product_name=product_name;
        this.category=category;
        this.price=price;
        this.business_type=business_type;
        this.quantity=quantity;
        this.date=date;
        
    }

    ProdLink(int aInt, String string, String string0, String string1, String string2, String string3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public int getId()
    {
        return product_id;
    }
    public String getPname()
    {
        return product_name;
        
    }
    public String getcat()
    {
        return category;
        
    }
    public float getprice()
    {
        return price;
        
    }
    public String getbusiness()
    {
        return business_type;
        
    }
    public int getquantity()
    {
        return quantity;
        
    }
    public String getdate()
    {
        return date;
        
    }
    
    
}
