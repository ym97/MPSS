package motor.part;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MUNNA-17
 */
public class Product_Class {
   private String NameString;
   private int Type_ID;

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }
   private  int Quantity;
   private double Price;
   private String TypeString;
   private String Vendor_Details;

    public Product_Class(String NameString, int Type_ID, int Quantity, double Price , String Type , String VendorString) {
        this.NameString = NameString;
        this.Type_ID = Type_ID;
        this.Quantity = Quantity;
        this.Price = Price;
        this.Vendor_Details = VendorString;
        this.TypeString = Type;
    }
public static double Calc_Threshold(double th , int sol , Date st , Date td){
    long diff = td.getTime() - st.getTime(); //this is going to give you the difference in sec
int Days = (int) (diff / (24 * 60 * 60 * 1000));
if(Days==0){
    return sol;
}
else {
    return (th + sol)/2 ;
}
//Date result = new Date(diff);
//Format frmt = new SimpleDateFormat("yy MM dd HH:mm:ss");
//return frmt.format(result).toString();
       
}
    public String getNameString() {
        return NameString;
    }

    public int getType_ID() {
        return Type_ID;
    }

    public int getQuantity() {
        return Quantity;
    }

    public double getPrice() {
        return Price;
    }

    public String getTypeString() {
        return TypeString;
    }

    public String getVendor_Details() {
        return Vendor_Details;
    }
   
}
