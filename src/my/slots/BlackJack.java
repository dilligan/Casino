/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package my.slots;
import java.lang.Math;

/**
 *
 * @author s-milligand
 */
public class BlackJack {
    public int money;
    public BlackJack(){
        money=0;
    }
    public BlackJack(int aMoney){
        money=aMoney;
    }
    public int getMoney(){
        return money;
    }
    public void addMoney(int cash){
        money=money+cash;
    }
    public Card getCard(){
        Card it= null;
        int r= (int) (Math.random() * 53);
        switch(r){
        case 0:
                it=new Card("spades", 1);
                break;
        case 1:
                it=new Card("spades", 2);
                break;
        case 2:
            it=new Card("spades", 3);
                break;
        case 3:
            it=new Card("spades", 4);
                break;
        case 4:
            it=new Card("spades", 5);
                break;
        case 5:
            it=new Card("spades", 6);
                break;
        case 6:
            it=new Card("spades", 7);
                break;
        case 7:
            it=new Card("spades", 8);
                break;
        case 8:
            it=new Card("spades", 9);
                break;
        case 9:
            it=new Card("spades", 10);
                break;
        case 10:
            it=new Card("spades", 11);
                break;
        case 11:
            it=new Card("spades", 12);
                break;
        case 12:
            it=new Card("spades", 13);
                break;
        case 13:
            it=new Card("hearts", 1);
                break;
        case 14:
            it=new Card("hearts", 2);
                break;
        case 15:
            it=new Card("hearts", 3);
                break;
        case 16:
            it=new Card("hearts", 4);
                break;
        case 17:
            it=new Card("hearts", 5);
                break;
        case 18:
            it=new Card("hearts", 6);
                break;
        case 19:
            it=new Card("hearts", 7);
                break;
        case 20:
            it=new Card("hearts", 8);
                break;
        case 21:
            it=new Card("hearts", 9);
                break;
        case 22:
            it=new Card("hearts", 10);
                break;
        case 23:
            it=new Card("hearts", 11);
                break;
        case 24:   
            it=new Card("hearts", 12);
                break;
        case 25:
            it=new Card("hearts", 13);
                break;
        case 26:
            it=new Card("clubs", 1);
                break;
        case 27:
            it=new Card("clubs", 2);
                break;
        case 28:
            it=new Card("clubs", 3);
                break;
        case 29:
            it=new Card("clubs", 4);
                break;
        case 30:
            it=new Card("clubs", 5);
                break;
        case 31:
            it=new Card("clubs", 6);
                break;
        case 32:               
            it=new Card("clubs", 7);
                break;
        case 33:
            it=new Card("clubs", 8);
                break;
        case 34:   
            it=new Card("clubs", 9);
                break; 
        case 35:
            it=new Card("clubs", 10);
                break;
        case 36:
            it=new Card("clubs", 11);
                break;
        case 37:
            it=new Card("clubs", 12);
                break;
        case 38:
            it=new Card("clubs", 13);
                break;
        case 39:
            it=new Card("diamonds", 1);
                break;
        case 40:
            it=new Card("diamonds", 2);
                break;
        case 41:
            it=new Card("diamonds", 3);
                break;
        case 42:
            it=new Card("diamonds", 4);
                break;
        case 43:
            it=new Card("diamonds", 5);
                break;
        case 44:
            it= new Card("diamonds", 6);
            break;
        case 45:
            it= new Card("diamonds", 7);
            break;
        case 46:
            it= new Card("diamonds", 8);
            break;            
        case 47:
            it= new Card("diamonds", 9);
            break;
        case 48:
            it= new Card("diamonds", 10);
            break;
        case 49:
            it= new Card("diamonds", 11);
            break;
        case 50:
            it= new Card("diamonds", 12);
            break;
        case 51:
            it= new Card("diamonds", 13);
            break;
        default:
            it= new Card("hearts", 1);
            break;
        }
        return it;
    }   
}
