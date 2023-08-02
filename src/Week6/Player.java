package Week6;

import java.util.ArrayList;
import java.util.List;

public class Player {
	String name; 
	int score;
	List<Card> hand = new ArrayList<Card>(); 
	
	
	
	Player(String name, int score) {
		this.name = name; 
		this.score = score; 
		
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getScore() {
		return score;
	}



	public void setScore(int score) {
		this.score = score;
	}



	public List<Card> getHand() {
		return hand;
	}



	public void setHand(List<Card> hand) {
		this.hand = hand;
	} 
	
	public void describe() {
		
//		for (Card card : this.hand) {
//			card.describe(); 
//		}
		System.out.println(this.name + " has " + this.score + " points.");
	}
	
	public Card flip() {
		Card card = this.hand.remove(0); 
		card.describe();
		return card; 
	
	}
	
	public Card draw(Deck deck) {
		Card card = deck.draw();
		this.hand.add(card); 
		return card; 
		
	}
	
	public void incrementScore() {
		  this.score += 1; 
	}
	
}
