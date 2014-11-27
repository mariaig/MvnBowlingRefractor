/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bowling;

import bowling.Game;

/**
 *
 * @author Maria
 */
public class Score {
    private NumberOfPins score;
    
    public Score(int score){
        //used only for perfect score
        this.score=new NumberOfPins(score);
    }
    public Score(NumberOfPins score){
        this.score=score;
    }
    public NumberOfPins getScore(){
        return this.score;
    }
    public NumberOfPins getNumberOfPins(){
        return this.score;
    }

    @Override
    public String toString() {
        return "---> "+score.getNumberOfPins()+"---";
    }
    public void sum(Score score1){
        //used for add opens
        this.score=this.score.sum(score1.getNumberOfPins());
    }
    public void sum(Score score1,Score score2){
        //one strike+open/spare
        sum(score1);
        this.score=this.score.sum(score2.getNumberOfPins());
    }
    
    public  void sum(Score score1,Score score2,Score score3){
        //usually used for 2 strikes + one roll or 3 strikes
        sum(score1,score2);
        this.score=this.score.sum(score3.getNumberOfPins());
    }
    
    public int toInt(){
        return this.score.getNumberOfPins();
    }
}
