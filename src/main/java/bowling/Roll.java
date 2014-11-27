/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bowling;

/**
 *
 * @author Maria
 */
public final class Roll {

    private final NumberOfPins nrOfPins;
    
    Roll(){
        nrOfPins=null;
    }
    public Roll(NumberOfPins x) {
        nrOfPins = x;
    }

    public NumberOfPins getRoll() {
        return nrOfPins;
    }

    public boolean isStrike(){
        return this.nrOfPins.getNumberOfPins()==10;
    }
    public boolean isSpare(Roll roll2){
        return this.nrOfPins.getNumberOfPins()+roll2.getRoll().getNumberOfPins()==10;
    }
}
