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
public class Open extends Frame {

    public Open(Roll roll1, Roll roll2) {
        super(roll1, roll2);
    }
    @Override
     public Score getPartialScore(){
         return new Score(new NumberOfPins(super.rolls[0].getRoll().getNumberOfPins()+super.rolls[1].getRoll().getNumberOfPins()));
    
    }

}
