package com.mycompany.app;

import bowling.InvalidNumberOfRolls;
import bowling.Player;
import bowling.Score;
import java.util.logging.Level;
import java.util.logging.Logger;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
   public void testApp1()
    {
        System.out.println("computeScoreFor 1");

        try {
            Player pl1=new Player("game1.txt");
            Score sc=pl1.getPlayerScore();
            int expResult=20;
            assertEquals(expResult, sc.toInt());
            System.out.println(sc);
        } catch (InvalidNumberOfRolls ex) {
        }

    }
    
    
    public void testApp2()  {
        System.out.println("computeScoreFor 2");

        try {
            Player pl1=new Player("game2.txt");
            Score sc=pl1.getPlayerScore();
            int expResult=0;
            assertEquals(expResult, sc.toInt());
            System.out.println(sc);
        } catch (InvalidNumberOfRolls ex) {
        }

    }
    public void testApp3(){
        System.out.println("computeScoreFor 3");

         try {
            Player pl1=new Player("game3.txt");
            Score sc=pl1.getPlayerScore();
            int expResult=300;
            assertEquals(expResult, sc.toInt());
            System.out.println(sc);
        } catch (InvalidNumberOfRolls ex) {
        }

    }

    public void testApp4(){
        System.out.println("computeScoreFor 4");

        try {
            Player pl1=new Player("game4.txt");
            Score sc=pl1.getPlayerScore();
            int expResult=16;
            assertEquals(expResult, sc.toInt());
            System.out.println(sc);
        } catch (InvalidNumberOfRolls ex) {
        }

    }

    
    public void testApp5(){
        System.out.println("computeScoreFor 5");

        try {
            Player pl1=new Player("game5.txt");
            Score sc=pl1.getPlayerScore();
            int expResult=24;
            assertEquals(expResult, sc.toInt());
            System.out.println(sc);
        } catch (InvalidNumberOfRolls ex) {
        }
    }

    public void testApp6(){
        System.out.println("computeScoreFor 6 ");

         try {
            Player pl1=new Player("game6.txt");
            Score sc=pl1.getPlayerScore();
            int expResult=69;
            assertEquals(expResult, sc.toInt());
            System.out.println(sc);
        } catch (InvalidNumberOfRolls ex) {
        }

    }

    public void testApp7()   {
        System.out.println("computeScoreFor 7");

       try {
            Player pl1=new Player("game7.txt");
            Score sc=pl1.getPlayerScore();
            int expResult=79;
            assertEquals(expResult, sc.toInt());
            System.out.println(sc);
        } catch (InvalidNumberOfRolls ex) {
        }

    }

    public void testApp8()   {
        System.out.println("computeScoreFor 8");

       try {
            Player pl1=new Player("game8.txt");
            Score sc=pl1.getPlayerScore();
            int expResult=112;
            assertEquals(expResult, sc.toInt());
            System.out.println(sc);
        } catch (InvalidNumberOfRolls ex) {
        }

    }

     public void testApp9()   {
        System.out.println("computeScoreFor 9");

      try {
            Player pl1=new Player("game9.txt");
            Score sc=pl1.getPlayerScore();
            int expResult=104;
            assertEquals(expResult, sc.toInt());
            System.out.println(sc);
        } catch (InvalidNumberOfRolls ex) {
        }

    }

    public void testApp10()   {
        System.out.println("computeScoreFor 10");

       try {
            Player pl1=new Player("game10.txt");
            Score sc=pl1.getPlayerScore();
            int expResult=215;
            assertEquals(expResult, sc.toInt());
            System.out.println(sc);
        } catch (InvalidNumberOfRolls ex) {
        }

    }

    public void testApp11()   {
        System.out.println("computeScoreFor 11");

        try {
            Player pl1=new Player("game11.txt");
            Score sc=pl1.getPlayerScore();
            int expResult=243;
            assertEquals(expResult, sc.toInt());
            System.out.println(sc);
        } catch (InvalidNumberOfRolls ex) {
        }
    }

     public void testApp12()   {
        System.out.println("computeScoreFor 12");

         try {
            Player pl1=new Player("game12.txt");
            Score sc=pl1.getPlayerScore();
            int expResult=201;
            assertEquals(expResult, sc.toInt());
            System.out.println(sc);
        } catch (InvalidNumberOfRolls ex) {
        }
    }

    public void testApp13() {
        System.out.println("computeScoreFor 13");

         try {
            Player pl1=new Player("game13.txt");
            Score sc=pl1.getPlayerScore();
            int expResult=143;
            assertEquals(expResult, sc.toInt());
            System.out.println(sc);
        } catch (InvalidNumberOfRolls ex) {
        }

    }

   public void testApp14()   {
        System.out.println("computeScoreFor 14");

       try {
            Player pl1=new Player("game14.txt");
            Score sc=pl1.getPlayerScore();
            int expResult=115;
            assertEquals(expResult, sc.toInt());
            System.out.println(sc);
        } catch (InvalidNumberOfRolls ex) {
        }

    }

     public void testApp15()   {
        System.out.println("computeScoreFor 15");

        try {
            Player pl1=new Player("game15.txt");
            Score sc=pl1.getPlayerScore();
            int expResult=159;
            assertEquals(expResult, sc.toInt());
            System.out.println(sc);
        } catch (InvalidNumberOfRolls ex) {
        }
    }

    public void testApp16()  {
        System.out.println("computeScoreFor 16");

        try {
            Player pl1=new Player("game16.txt");
            Score sc=pl1.getPlayerScore();
            int expResult=135;
            assertEquals(expResult, sc.toInt());
            System.out.println(sc);
        } catch (InvalidNumberOfRolls ex) {
        }

    }

    public void testApp17() {
        System.out.println("computeScoreFor 17");

        try {
            Player pl1=new Player("game17.txt");
            Score sc=pl1.getPlayerScore();
            int expResult=77;
            assertEquals(expResult, sc.toInt());
            System.out.println(sc);
        } catch (InvalidNumberOfRolls ex) {
        }

    }

}
