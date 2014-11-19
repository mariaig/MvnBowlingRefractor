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
public final class Player {
    private Frame[] allowedFrames;
    private int currFrame=0;
    private Roll lastFrameRoll1;
    private Roll lastFrameRoll2;
    private Roll lastFrameBonus;
    private int nrOfStrikes=0;
    
    public Player() {
        allowed();
    }
    
    public void allowed(){
        allowedFrames=new Frame[10];
    }
    
    public void rolls(NumberOfPins nr){
    //read rolls one by one from file
        if(currFrame==9){
            //player is at the last frame so we have to be carefull
            if(nr.getNumberOfPins()==10){
                //if is a strike
                if(lastFrameRoll1.getRoll()==null){
                    //is at the first roll 
                    lastFrameRoll1=new Roll(nr);
                }else{
                    
                }
            }
            return;
        }
        if(nr.getNumberOfPins()==10){
            allowedFrames[currFrame++]=new Strike();
        }
    }
    
}
