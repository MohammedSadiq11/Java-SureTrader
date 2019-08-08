
import java.sql.ResultSet;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mithun
 */
public class BillingLink {
    


    static TableModel resultSetToTableModel(ResultSet rs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private int purchase_id;
    private int customer_id; 
    private String customer_name;
    private int seller_id; 
    private String seller_name;
    private int product_id;
    private String product_name;
    private int price;
    private String date;
    
    
    public BillingLink(int purchase_id, int customer_id,String customer_name,int seller_id,String seller_name, int product_id,String product_name,int price, String date)
    {
        this.purchase_id=purchase_id;
        this.customer_id=customer_id;
        this.seller_id=seller_id;
        this.customer_name=customer_name;
        this.seller_name=seller_name;
        this.product_id=product_id;
        this.product_name=product_name;
        this.price=price;
        this.date=date;
              
    }

    BillingLink(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getPurchId()
    {
        return purchase_id;
    }
    public int getCId()
    {
        return customer_id;
    }
     public int getSId()
    {
        return seller_id;
    }
    public String getCname()
    {
        return customer_name;
        
    }
    public String getSname()
    {
        return seller_name;
        
    }
    public int getPID()
    {
        return product_id;
    }
     public String getPname()
    {
        return product_name;
    }
      public int getprice()
    {
        return price;
    }
      public String getdate()
    {
        return date;
    }

}
