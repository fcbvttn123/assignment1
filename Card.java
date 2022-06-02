/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardtrickice1;

/** define card value and suits
 * 
 *
 * @author Tran Thanh Ngan Vu 
 * @number 991663076
 * @time 6:15PM 2022-06-02
 */
public class Card 
{
    private int value;
    private String suits; //encapsulation

    public Card(String packofcards) {

    }

    //constant
    public static final String [] SUITS = { "diamonds","clubs","spades","hearts"};

    public String getSuitRandom() {
        int s = (int) Math.floor(Math.random()*(3-0+1)+0);
        return SUITS[s];
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    public String toString() {
        return value + " " + suits;
    }


    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }

    public int getValueRandom() {
        return ((int)Math.floor(Math.random()*(13-1+1)+1));
    }

    /**
     * @return the suits
     */
    public String getSuits() {
        return suits;
    }

    /**
     * @param suits the suits to set
     */
    public void setSuits(String suits) {
        this.suits = suits;
    }
   //number
    
    //method for suits
    
}