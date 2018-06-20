/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challenge;

import challenge.controller.PicoYPlacaController;
import challenge.controller.QuitoPicoYPlacaController;
import challenge.models.User;
import challenge.view.PicoYPlacaForm;
import challenge.view.PicoYPlacaView;

/**
 *
 * @author diego
 */
public class Challenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        User user = new User();
        PicoYPlacaForm p = new PicoYPlacaForm(user);
        QuitoPicoYPlacaController q = new QuitoPicoYPlacaController(user, p);
      
       p.setVisible(true);
       
    
    }
    
   
    
}


