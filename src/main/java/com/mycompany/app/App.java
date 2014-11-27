package com.mycompany.app;

import bowling.Frame;
import bowling.InvalidNumberOfRolls;
import bowling.NumberOfPins;
import bowling.Open;
import bowling.Player;
import bowling.Roll;
import bowling.Score;
import bowling.Spare;
import bowling.Strike;
import com.sun.org.apache.xalan.internal.xsltc.runtime.BasisLibrary;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
            Player pl1=new Player("game13.txt");
            Score sc=pl1.getPlayerScore();
            System.out.println(sc);
        } catch (InvalidNumberOfRolls ex) {
        }
        
        
    }
}
