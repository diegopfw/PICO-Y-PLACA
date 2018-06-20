/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge.controller;

import challenge.models.Restriction;
import challenge.models.User;
import challenge.utils.Constants;
import challenge.utils.Utils;
import challenge.view.PicoYPlacaView;
import java.util.ArrayList;

/**
 *
 * @author diego
 */
public abstract class PicoYPlacaController implements java.awt.event.ActionListener{
    
    private User userInfo;
    private final PicoYPlacaView picoYPlacaView;

    private ArrayList<Restriction> restrictions;
 
    public PicoYPlacaController(User userInfo, PicoYPlacaView picoYPlacaView){
        this.userInfo = userInfo;
        this.picoYPlacaView = picoYPlacaView;
        
    }
    
    public Boolean reviewNumberUserPlate(){
        if(getDayFromDigit(getLastPlateNumber()).equals(Utils.getWeekDayNumberFromDate(userInfo.getUserDate()))){
            if(!Utils.isBetween(userInfo.getUserHour(), Constants.MORNING_INIT_HOUR, Constants.MORNING_END_HOUR)
                    && !Utils.isBetween(userInfo.getUserHour(), Constants.NIGHT_INIT_HOUR, Constants.NIGHT_END_HOUR))
                return Boolean.TRUE;
            else 
                return Boolean.FALSE;
        } else{
            return Boolean.TRUE;
        }
    }
    
    public Integer getLastPlateNumber(){
        Integer lastPlateNumber = Integer.parseInt(userInfo.getUserPlateNumber().substring(userInfo.getUserPlateNumber().length() - 1));
        return lastPlateNumber;
    }
    
    public Integer getDayFromDigit(Integer value){
        for(Restriction restriction : restrictions){
            if(Utils.isInArray(restriction.getNumber(),value))
                return restriction.getDate();
        }
        
        return null;
    }
    
    public Boolean validateFields(){
        
        if(Utils.isEmpty(userInfo.getUserPlateNumber()) || Utils.isEmpty(userInfo.getUserDate()) || Utils.isEmpty(userInfo.getUserHour())){
            this.picoYPlacaView.showEmptyValueError(Constants.VALUE_IS_EMPTY);
            return Boolean.FALSE;
        } else if(!Utils.isNumber(userInfo.getUserPlateNumber().substring(userInfo.getUserPlateNumber().length() - 1))){
            this.picoYPlacaView.showPlateError(Constants.PLATE_NUMBER_FORMAT_ERROR);
            return Boolean.FALSE;
        } else if(!Utils.isValidDate(userInfo.getUserDate())){
            this.picoYPlacaView.showPlateError(Constants.DATE_FORMAT_ERROR);
            return Boolean.FALSE;
        }
        
        return Boolean.TRUE;
    } 
    
    public ArrayList<Restriction> getRestrictions() {
        return restrictions;
    }

    public void setRestrictions(ArrayList<Restriction> restrictions) {
        this.restrictions = restrictions;
    }
    
    public User getUserInfo() {
        return userInfo;
    }
    
    public void setUserInfo(User userInfo){
        this.userInfo = userInfo;
    }
    
    public PicoYPlacaView getPicoYPlacaView(){
        return this.picoYPlacaView;
    }
}
