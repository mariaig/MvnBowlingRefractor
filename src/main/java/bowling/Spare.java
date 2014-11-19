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
public class Spare extends Frame {

    public Spare(Roll roll1) {
        super(roll1, new Roll(new NumberOfPins(10-roll1.getRoll().getNumberOfPins())));
    }
    
     public Spare(Roll roll1, Roll roll2,Roll roll3) {
        super(roll1,new Roll(new NumberOfPins(10-roll1.getRoll().getNumberOfPins())),roll3);
    }
 
    @Override
    public Score getPartialScore(){
        return new Score(new NumberOfPins(10));
    }
}
