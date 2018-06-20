/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge.view;

import challenge.controller.QuitoPicoYPlacaController;
import challenge.models.User;

/**
 *
 * @author diego
 */
public interface PicoYPlacaView {
    
    public void showPlateError(String message);
    
    public void showOnRoadMessage(String message);
    
    public void showEmptyValueError(String message);
    
    public void showDateFormatError(String message);
    
    public void addController(QuitoPicoYPlacaController quitoPicoYPlacaController);
    
    public User getUserInfo();
   
}
