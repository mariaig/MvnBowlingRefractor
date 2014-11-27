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
public final class NumberOfRolls {
    private final int numberOfRolls;
    private static final NumberOfRolls maxRolls=new NumberOfRolls(22);

    public NumberOfRolls(int nr) {
        this.numberOfRolls=nr;
    }
    public int getIntNumberOfRolls(){
        return numberOfRolls;
    }
    
    public static NumberOfRolls getMaxNumberOfRolls(){
        return maxRolls;
    }
}
