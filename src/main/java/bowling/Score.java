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
    public NumberOfPins score;
    
    public Score(NumberOfPins score){
        this.score=score;
    }
    public NumberOfPins getScore(){
        return this.score;
    }

    @Override
    public String toString() {
        return "---> "+score.getNumberOfPins()+"---";
    }
    
    
    public void keepScore(Game game){}
}
