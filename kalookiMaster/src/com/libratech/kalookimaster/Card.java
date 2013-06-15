package com.libratech.kalookimaster;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
public class Card
{
    private String suit, faceValue, pointValue;
    
    public Card(String c_suit, String c_faceValue, String c_pointValue) //Card constructor
    {
        suit = c_suit;
        faceValue = c_faceValue;
        pointValue = c_pointValue;
    }

    public String getSuit()
    {
        return suit;
    }
    
    public String getValue()
    {
        return faceValue;
    }
    
    public String getPointValue()
    {
        return pointValue;
    }
    
    public void printCard()
    {
        System.out.println(faceValue + ", " + suit);
    }
    
//    public String toStr(Card card)
//    {//returns the path for the image for Card card
//        String cardIcon = "/com/kalookimaster/pcapp/images/cards/";
//        if(card.getSuit().equals("heart"))
//        {
//            cardIcon += "hearts/"+card.getValue()+" of Heart.png";
//                    //clubs/10 of Club.png
//        }
//        else
//        {
//            if (card.getSuit().equals("diamond"))
//            {
//                cardIcon += "diamonds/"+card.getValue()+" of Diamond.png";
//            }
//            else
//            {
//                if(card.getSuit().equals("club"))
//                {
//                    cardIcon += "clubs/"+card.getValue()+" of Club.png";
//                }
//                else
//                {
//                    cardIcon += "spades/"+card.getValue()+" of Spade.png";
//                }
//            }
//        }
//        return cardIcon;
//    }
}
