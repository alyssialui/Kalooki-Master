package com.libratech.kalookimaster;

public class Player {
	
	private String name;
    private int numCalls, numCards = 0, score;
    private Card[] playerHand = new Card[25];

    //constructor
    public Player(String p_name, Card[] p_hand)
    {
        name = p_name;
        //picture = p_pic;
        //IPaddress = p_IP;
        numCalls = 0;
        numCards = 0;
        score = 0;
        playerHand = p_hand;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumCalls() {
		return numCalls;
	}

	public void setNumCalls(int numCalls) {
		this.numCalls = numCalls;
	}

	public int getNumCards() {
		return numCards;
	}

	public void setNumCards(int numCards) {
		this.numCards = numCards;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Card[] getPlayerHand() {
		return playerHand;
	}

	public void setPlayerHand(Card[] playerHand) {
		this.playerHand = playerHand;
	}

    
    
}
