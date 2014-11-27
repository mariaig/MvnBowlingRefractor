package bowling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Maria
 */
public class Game {
    private NumberOfRolls number;
    public Game(){
        
    }
    public Roll[] getGame(String pathToFile) throws InvalidNumberOfRolls{
        NumberOfRolls maxRolls=NumberOfRolls.getMaxNumberOfRolls();
        Roll[] rolls = new Roll[maxRolls.getIntNumberOfRolls()];
        
        int nrOfRolls = 0;
        int i = 0;

        Scanner scan;
        try {
            scan = new Scanner(new FileReader(pathToFile));
            while (scan.hasNext()) {
                rolls[i++] = new Roll(new NumberOfPins(scan.nextInt()));
                nrOfRolls++;
            //System.out.println(rolls[i-1]);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        }

      
        
        //12= all rolls->spark
        //21= spark||spare at the last frame
        if (nrOfRolls < 12 || nrOfRolls > 21) {
            throw new InvalidNumberOfRolls();
        }
        this.number=new NumberOfRolls(nrOfRolls);
        return rolls;        
    }
    public NumberOfRolls getNumberOfRolls(){
        return this.number;
    }
}
