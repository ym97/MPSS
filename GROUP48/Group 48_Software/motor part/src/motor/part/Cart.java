package motor.part;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MUNNA-17
 */
public class Cart {
    Connection conn;
    ResultSet reslt;
    Statement st1 , st2;
    private int Customer_ID ;
    private Product_Class[] Selected_Products;
    private double Total_Order;
    private int No_of_Products;

    public Cart(int Customer_ID, Product_Class[] Selected_Products, double Total_Order, int No_of_Products) {
        try {
            this.Customer_ID = Customer_ID;
            this.Selected_Products = Selected_Products;
            //maybe free gifts like :P
            this.Total_Order = Total_Order;
            this.No_of_Products = No_of_Products;
            this.Selected_Products = new Product_Class[10];
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root", "");
            st1=conn.createStatement();
            st1.executeQuery("USE Motor_Registry");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Cart.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Cart.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    

    public int getCustomer_ID() {
        return Customer_ID;
    }

    public Product_Class[] getSelected_Products() {
        return Selected_Products;
    }

    public double getTotal_Order() {
        return Total_Order;
    }

    public int getNo_of_Products() {
        return No_of_Products;
    }

    public void setCustomer_ID(int Customer_ID) {
        this.Customer_ID = Customer_ID;
    }

    public void setSelected_Products(Product_Class[] Selected_Products) {
        this.Selected_Products = Selected_Products;
    }

    public void setTotal_Order(double Total_Order) {
        this.Total_Order = Total_Order;
    }

    public void setNo_of_Products(int No_of_Products) {
        this.No_of_Products = No_of_Products;
    }
    
    public boolean Add_to_Cart (int ProductI){
        try {
            st2 = conn.createStatement();
            reslt = st2.executeQuery("SELECT * FROM Inventory WHERE  ID = "+ProductI+" ;");
            if(reslt.next()){
                this.Selected_Products[this.No_of_Products] = new Product_Class(reslt.getString(8),Integer.parseInt(reslt.getString(1)),Integer.parseInt(reslt.getString(3)),Double.parseDouble(reslt.getString(4)) , reslt.getString(2), reslt.getString(7));
                        this.No_of_Products++;
            }
            else return false;
        } catch (SQLException ex) {
            Logger.getLogger(Cart.class.getName()).log(Level.SEVERE, null, ex);
        }
    return false;
    }
    public boolean Edit_Cart (int p , int q){
        for(int i=0 ; i<No_of_Products ; i++){
            if(Selected_Products[i].getType_ID() == p)
            {
                Selected_Products[i].setQuantity(q);
                return true;
            }
        }
        return false;
    }
    public boolean Remove_From_cart(int Product_idI){
        for(int i=0 ; i<No_of_Products ; i++){
            if(Selected_Products[i].getType_ID() == Product_idI)
            {
                Selected_Products[i] = Selected_Products[No_of_Products -1] ;
                Selected_Products[No_of_Products -1]  = null;
                return true;
            }
        }
        
        return false;
    }
}
