/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mithun
 */
public class SalesLink {
    private int purchase_id;
    private int customer_id;
    private String customer_name;
    private String seller_name;
     private String product_name;
    private int seller_id;
    private int product_id;
    private int product_price;
    private String date;
    private String product_cat;

    SalesLink(int aInt, int aInt0, String string, int aInt1, String string0, int aInt2, String string1, String string2, int aInt3, String string3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  

   

  
    public int getpurid()
    {
        return purchase_id;
        
    }
    
    public int getcid()
    {
        return customer_id;
        
    }
   
    public String getcname()
    {
        return customer_name;
        
    }
    public String getSname()
    {
        return seller_name;
        
    }
    public String getPname()
    {
        return product_name;
        
    }
    public int getsid()
    {
        return seller_id;
        
    }
    public int getprodId()
    {
        return product_id;
        
    }
    public int getprodprice()
    {
        return product_price;
        
    }
    
    
    public String getpcat()
    {
        return product_cat;
        
    }
    public String getdate()
    {
        return date;
        
    }
  
}
