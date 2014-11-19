package com.mycompany.app;

import bowling.Frame;
import bowling.NumberOfPins;
import bowling.Open;
import bowling.Roll;
import bowling.Score;
import bowling.Spare;
import bowling.Strike;
import com.sun.org.apache.xalan.internal.xsltc.runtime.BasisLibrary;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Frame f=new Strike();
        Score s=f.getPartialScore();
        Frame f2=new Spare(new Roll(new NumberOfPins(2)));
        Score s2=f2.getPartialScore();
        Frame f3=new Open(new Roll(new NumberOfPins(3)),new Roll(new NumberOfPins(4)));
        Score s3=f3.getPartialScore();
        System.out.println(s);
        System.out.println(s2);
        System.out.println(s3);
    }
}
