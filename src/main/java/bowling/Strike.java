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
public class Strike extends Frame {

    public Strike() {
        //one frame=one strike
        super(new Roll(new NumberOfPins(10)));
    }
    public Strike(Roll roll3){
        //at last frame 2 strikes and bonus roll
        super(new Roll(new NumberOfPins(10)),new Roll(new NumberOfPins(10)),roll3);
    }
    public Strike(Roll roll2,Roll roll3){
        //at last frame one strike and two rolls
        super(new Roll(new NumberOfPins(10)),roll2,roll3);
    }

    @Override
    public Score getPartialScore(){
        return new Score(new NumberOfPins(10));
    }
    
    public void calculate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   
}
