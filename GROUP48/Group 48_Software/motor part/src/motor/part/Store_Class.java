package motor.part;


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
public class Store_Class {
    private String  Name_of_Store;
    private String Address;
    private String Admin_Username;
    private String Admin_Password;
    private Date Starting_Date;
    private Product_Type[] product_Types;

    public Store_Class(String Name_of_Store, String Address, String Admin_Username, String Admin_Password, Date Starting_Date) {
        this.Name_of_Store = Name_of_Store;
        this.Address = Address;
        this.Admin_Username = Admin_Username;
        this.Admin_Password = Admin_Password;
        this.Starting_Date = Starting_Date;
        
    }

    public String getName_of_Store() {
        return Name_of_Store;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setAdmin_Username(String Admin_Username) {
        this.Admin_Username = Admin_Username;
    }

    public void setAdmin_Password(String Admin_Password) {
        this.Admin_Password = Admin_Password;
    }

    public String getAdmin_Username() {
        return Admin_Username;
    }

    public String getAdmin_Password() {
        return Admin_Password;
    }

    public Date getStarting_Date() {
        return Starting_Date;
    }
    
}
