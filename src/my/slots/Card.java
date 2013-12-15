/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package my.slots;

/**
 *
 * @author s-milligand
 */
public class Card {
    public String suit;
    public int number;
    public Card(){
        
    }
    public Card(String aSuit, int aNum){
        suit=aSuit;
        number=aNum;
    }
    public String getSuit(){
        return suit;
    }
    public int getNumber(){
        return number;
    }
}
