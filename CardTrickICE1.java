/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardtrickice1;
import java.util.Scanner;
/** step1 : generate 7 random cards and store in array - how
 * step 2: take any card input from user suit,number
 * step 3: user card is in  the array 'card is found'
 *
 * @author Tran Thanh Ngan Vu 
 * @number 991663076
 * @Time 6:15PM 2022-06-02
 */

public class CardTrickICE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        Card[] magicHand = new Card[7]; //Array of object
        int arrayofvalue[] = new int[7];
        String arrayofsuit[] = new String[7];
        for( int i=0;i<magicHand.length;i++)
        {
            Card c1 = new Card("nnn");
            c1.setValue(c1.getValueRandom());//use a method to generate random *13
            c1.setSuits(c1.getSuitRandom());//random method suit
            System.out.println(c1.getValue() + " " + c1.getSuits());
            arrayofvalue[i] = c1.getValue();
            arrayofsuit[i] = c1.getSuits();
            magicHand[i] = new Card(c1.toString());
        }
        System.out.println("Your array: ");
        for (Card r: magicHand) {
            
        }
        //step 2:take input 
        System.out.print("Enter your value: ");
        int yourValue = input.nextInt();
        System.out.print("Enter your suit: ");
        String yourSuit = input.next();
        System.out.println("Your card: " + yourValue + " " + yourSuit );

        
        //step 3: match with array 

        for (int i = 0; i < arrayofvalue.length; i++) {
            if (yourValue == arrayofvalue[i]) {
                System.out.println("True value");
            }
        }

        for (int i = 0; i < arrayofsuit.length; i++) {
            if (yourSuit == arrayofsuit[i]) {
                System.out.println("True suit");
                System.out.println("Your card matching");
            }
        }



        

        
    }
}