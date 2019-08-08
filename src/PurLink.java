/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mithun
 */
public class PurLink {
   
    private String seller_name;
     private String product_name;
    private int seller_id;
    private int product_id;
    private int product_price;
    private String date;

    PurLink(int aInt, String string, int aInt0, String string0, int aInt1, String string1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    
    public int getsid()
    {
        return seller_id;
        
    }
    public String getSname()
    {
        return seller_name;
        
    }
     public int getprodId()
    {
        return product_id;
        
    }
    public String getPname()
    {
        return product_name;
        
    }
    public int getprodprice()
    {
        return product_price;
        
    }
    public String getdate()
    {
        return date;
        
    }
  
     
}
