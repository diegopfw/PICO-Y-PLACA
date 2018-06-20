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
public class Restriction {
    
    private final Integer date;
    private final int number[];
    
     public Restriction(Integer date, int number[]){
        this.date = date;
        this.number = number;
    }

    public Integer getDate() {
        return date;
    }

    public int[] getNumber() {
        return number;
    }
    
}
