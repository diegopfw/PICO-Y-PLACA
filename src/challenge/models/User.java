/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge.models;

/**
 *
 * @author diego
 */
public class User {
    
    private String userPlateNumber;
    private String userDate;
    private String userHour;

    public User(){ 
    }
    
    public User(String userPlateNumber, String userDate, String userHour){
        this.userPlateNumber = userPlateNumber;
        this.userDate = userDate;
        this.userHour = userHour;
    }

    public String getUserPlateNumber() {
        return userPlateNumber;
    }

    public String getUserDate() {
        return userDate;
    }
    
    public String getUserHour() {
        return userHour;
    }
    
}
