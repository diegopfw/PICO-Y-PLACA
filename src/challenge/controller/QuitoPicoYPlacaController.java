/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge.controller;

import challenge.models.Restriction;
import challenge.models.User;
import challenge.utils.Constants;
import challenge.view.PicoYPlacaView;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class QuitoPicoYPlacaController extends PicoYPlacaController {

    public QuitoPicoYPlacaController(User userInfo, PicoYPlacaView picoYPlacaView){
      super(userInfo, picoYPlacaView);
      initValues();
    }
    
    public final void initValues(){
        generateRestrictions();
        getPicoYPlacaView().addController(this);
    }
    
    public void generateRestrictions(){
        ArrayList<Restriction> restrictions = new ArrayList<>();
        
        restrictions.add(new Restriction(Constants.Day.MONDAY.getLevelCode(), Constants.MONDAY_NUMBERS));
        restrictions.add(new Restriction(Constants.Day.TUESDAY.getLevelCode(), Constants.TUESDAY_NUMBERS));
        restrictions.add(new Restriction(Constants.Day.WEDNESDAY.getLevelCode(), Constants.WEDNESDAY_NUMBERS));
        restrictions.add(new Restriction(Constants.Day.THURSDAY.getLevelCode(), Constants.THURSDAY_NUMBERS));
        restrictions.add(new Restriction(Constants.Day.FRIDAY.getLevelCode(), Constants.FRIDAY_NUMBERS));
        
        setRestrictions(restrictions);  
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setUserInfo(getPicoYPlacaView().getUserInfo());
        
        if(validateFields()){
            if(reviewNumberUserPlate())
                getPicoYPlacaView().showOnRoadMessage(Constants.CAN_BE_ON_THE_ROAD);
            else
                getPicoYPlacaView().showOnRoadMessage(Constants.CAN_NOT_BE_ON_THE_ROAD);
        }
       
    }
    
}
   