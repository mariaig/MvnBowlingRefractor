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

    private final String playerGame; 
    
    public Player(String playerGame) throws InvalidNumberOfRolls {
        this.playerGame=playerGame;
        allowed();
    }
    
    public void allowed() throws InvalidNumberOfRolls{
        allowedFrames=new Frame[10];
        Game thisGame=new Game();
        Roll[] pins= thisGame.getGame(playerGame);
        int count=0;
        int i=0;
        while(i<thisGame.getNumberOfRolls().getIntNumberOfRolls())
        {
            if(count==Frame.getNrOfFRAMES()-1){
                //i'm at the last frame so I have to decide if there are special rolls or
                //just an open
                if(pins[i].isStrike()){
                    //than it means that i will sure have a bonus roll
                    allowedFrames[count]=new Strike(pins[i+1],pins[i+2]);
                    break;
                }else if(pins[i].isSpare(pins[i+1])){
                    //bonus roll
                    allowedFrames[count]=new Spare(pins[i],pins[i+2]);
                    break;
                }else{
                    allowedFrames[count]=new Open(pins[i],pins[i+1]);
                    break;
                }   
            }
            
            if(pins[i].isStrike()){
                //if it's a a strike, put a stike on the frames vector
                allowedFrames[count++]=new Strike();
                i++;
            }else if(pins[i].isSpare(pins[i+1])){
                //is a spare
                allowedFrames[count++]=new Spare(pins[i]);  
                i+=2;
            }else{
                allowedFrames[count++]=new Open(pins[i],pins[i+1]);
                i+=2;
            }
            
        }
       
    }
    
//   public void printF(){
//       for(int i=0;i<Frame.getNrOfFRAMES();i++){
//           System.out.println(allowedFrames[i]);
//       }
//   }
    public Score getPlayerScore() throws InvalidNumberOfRolls{
        if(Strike.getNrOfStrikes()==12){
            //perfect score
            return new Score(300);
        }
        int count=0;
        //printF();
        Score totalScore=new Score(0);
        while(count<Frame.getNrOfFRAMES()){
//            System.out.println("C: "+count+" TS: "+totalScore);
            if(count==Frame.getNrOfFRAMES()-1){
                //I'm at the last frame
                if(allowedFrames[count].isStrike()){
                    totalScore.sum(allowedFrames[count].getPartialScore(),allowedFrames[count].getScoreRoll2(),allowedFrames[count].getScoreRoll3());
                    break;
                }else if(allowedFrames[count].isSpare()){
                     totalScore.sum(allowedFrames[count].getPartialScore(),allowedFrames[count].getScoreRoll3());
                     break;
                }else{
                    //it's an open at the last frame
                    totalScore.sum(allowedFrames[count].getPartialScore());
                    break;
                }
            }
            if(allowedFrames[count].isStrike()){
//                System.out.println("HERE STRIKE "+count);
                if(count==Frame.getNrOfFRAMES()-2){
                    //I am at the 9-th frame an I have a strike=> sum with frame 10 roll1 and roll2
                     totalScore.sum(allowedFrames[count].getPartialScore(),allowedFrames[count+1].getScoreRool1(),allowedFrames[count+1].getScoreRoll2());
                     count++;
                     continue;
                }
                if(allowedFrames[count+1].isStrike()){
                    if(allowedFrames[count+2].isStrike()){
                        //three strikes one after another
                        totalScore.sum(allowedFrames[count].getPartialScore(),allowedFrames[count+1].getPartialScore(),allowedFrames[count+2].getPartialScore());
                    }else{
                        //two strikes + a spare or an open(just the first roll needed)
                        totalScore.sum(allowedFrames[count].getPartialScore(),allowedFrames[count+1].getPartialScore(),allowedFrames[count+2].getScoreRool1());
                    }
                }else{
                    //one strike + a spare or an open
                    totalScore.sum(allowedFrames[count].getPartialScore(),allowedFrames[count+1].getPartialScore()); 
                }
            }else if(allowedFrames[count].isSpare()){
                totalScore.sum(allowedFrames[count].getPartialScore(),allowedFrames[count+1].getScoreRool1());  
            }else{
                //is an open
                totalScore.sum(allowedFrames[count].getPartialScore());
            }
            count++;
        }
        return totalScore;
        
    }
    
}
