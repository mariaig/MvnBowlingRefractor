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
    NumberOfRolls numberOfRolls;
    protected final Roll[] rolls;

    public Frame(Roll roll1){
        numberOfRolls=new NumberOfRolls(1);
        rolls=new Roll[1];
        rolls[0]=roll1;
    }
    public Frame(Roll roll1,Roll roll2){
        numberOfRolls=new NumberOfRolls(2);
        rolls=new Roll[2];
        rolls[0]=roll1;
        rolls[1]=roll2;
    }
    public Frame(Roll roll1,Roll roll2,Roll bonus){
        numberOfRolls=new NumberOfRolls(3);
        rolls=new Roll[3];
        rolls[0]=roll1;
        rolls[1]=roll2;
        rolls[2]=bonus;
    }
   
    public NumberOfRolls getNumberOfRolls(){
        return numberOfRolls;
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
    
    
}
