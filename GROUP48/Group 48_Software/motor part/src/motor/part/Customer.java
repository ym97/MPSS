/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package motor.part;

/**
 *
 * @author MUNNA-17
 */
public class Customer {
    private   String Customer_Name;
    private final int Customer_ID;
    private  String Address ;
    private  String telephone_No;
    public Cart MyCart;
    private String Password ;
    private String Username ;
    private String SS_NO ;

    public String getSS_NO() {
        return SS_NO;
    }
    public String getCustomer_Name() {
        return Customer_Name;
    }

    public int getCustomer_ID() {
        return Customer_ID;
    }

    public void setCustomer_Name(String Customer_Name) {
        this.Customer_Name = Customer_Name;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setTelephone_No(String telephone_No) {
        this.telephone_No = telephone_No;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getPassword() {
        return Password;
    }

    public String getUsername() {
        return Username;
    }

    public String getAddress() {
        return Address;
    }

    public String getTelephone_No() {
        return telephone_No;
    }

    public Customer(String Customer_Name, int Customer_ID, String Address, String telephone_No, String Password, String Username , String social_secutiryString) {
        this.Customer_Name = Customer_Name;
        this.Customer_ID = Customer_ID;
        this.Address = Address;
        this.telephone_No = telephone_No;
        this.Password = Password;
        this.Username = Username;
        this.SS_NO = social_secutiryString;
        this.MyCart = new  Cart(Customer_ID , null , 0.0 , 0);
    }

    
    
    
    
}
