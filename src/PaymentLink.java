
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
public class PaymentLink {
    
    static TableModel resultSetToTableModel(ResultSet rs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private int purchase_id; 
    private String date;
    private int amount; 
    private String bank_name;
    private int account_no;
   
    
    
    public PaymentLink(int purchase_id,String date,int amount,String bank_name, int account_no)
    {
        this.purchase_id=purchase_id;
        this.date=date;
        this.amount=amount;
        this.bank_name=bank_name;
        this.account_no=account_no;
  
              
    }

    PaymentLink(int aInt, String string, String string0, String string1, String string2, String string3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public int getpurid()
    {
        return purchase_id;
    }
     public String getdate()
    {
        return date;
    }
    public int amount()
    {
        return amount;
        
    }
    public String bank_name()
    {
        return bank_name;
        
    }
    public int getaccount()
    {
        return account_no;
    }
    
    
}
