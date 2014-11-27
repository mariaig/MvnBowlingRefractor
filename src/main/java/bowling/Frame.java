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
public abstract class Frame {
    private static final int NumberOfFRAMES=10;
    protected final Roll[] rolls;

    public Frame(Roll roll1){
        rolls=new Roll[1];
        rolls[0]=roll1;
    }
    public Frame(Roll roll1,Roll roll2){
        rolls=new Roll[2];
        rolls[0]=roll1;
        rolls[1]=roll2;
    }
    public Frame(Roll roll1,Roll roll2,Roll bonus){
        rolls=new Roll[3];
        rolls[0]=roll1;
        rolls[1]=roll2;
        rolls[2]=bonus;
    }
   

    
    public Roll[] getFrame(){
        return rolls;
    }
    
    public Score getPartialScore(){ 
        if(this instanceof Strike){
            Strike f=(Strike)this;
            return f.getPartialScore();
        }else if(this instanceof Spare){
            Spare f=(Spare)this;
            return f.getPartialScore();
        }
        Open f=(Open)this;        
        return f.getPartialScore();
    }
    
    public Score getScoreRool1(){
         return new Score(new NumberOfPins(rolls[0].getRoll().getNumberOfPins()));
    }
    public Score getScoreRoll2(){
         return new Score(new NumberOfPins(rolls[1].getRoll().getNumberOfPins()));
    }   
     public Score getScoreRoll3(){
         return new Score(new NumberOfPins(rolls[2].getRoll().getNumberOfPins()));
    }  
    
    public static int getNrOfFRAMES(){
         return Frame.NumberOfFRAMES;
    }
    public boolean isStrike(){
        return this instanceof Strike;
    }
    public boolean isSpare(){
        return this instanceof Spare;
    }
    
    @Override
    public String toString(){
        if(rolls.length==1){
            return "--- "+rolls[0].getRoll().getNumberOfPins();
        }if(rolls.length==2){
            return "--- "+rolls[0].getRoll().getNumberOfPins()+" "+rolls[1].getRoll().getNumberOfPins();
        }
        return "--- "+rolls[0].getRoll().getNumberOfPins()+" "+rolls[1].getRoll().getNumberOfPins()+" "+rolls[2].getRoll().getNumberOfPins();
    }
    
}
