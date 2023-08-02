package Week6;


public class App {

	public static void main(String[] args) {
		
		
		Deck deck = new Deck(); 
		Player player1 = new Player("Jack", 0);
		Player player2 = new Player("Jill", 0); 
		deck.shuffle();
		
		for(int i = 0; i < 52; i++) {
			if(i % 2 == 0) {
				player1.draw(deck); 
			} else {
				player2.draw(deck); 
			}
		}
	
		for( int i = 1; i <= 26; i++) {
			System.out.println(player1.name + " Plays: ");
			int cardValue1 = player1.flip().getValue(); 
			System.out.println(player2.name + " Plays: ");
			int cardValue2 = player2.flip().getValue();
			
			if (cardValue1 > cardValue2) {
				player1.incrementScore();
				System.out.println(player1.name + " has " + player1.score + " points.");
			} else if (cardValue2 > cardValue1) {
				player2.incrementScore(); 
				System.out.println(player2.name + " has " + player2.score + " points.");
			} else {System.out.println("It is a draw");
			} System.out.println("..................");
		}
		
		System.out.println("*******************");
		System.out.println(player1.name + " has " + player1.score + " points!");
		System.out.println(player2.name + " has " + player2.score + " points!");
		
		if(player1.score > player2.score) {
			System.out.println(player1.name + " is the Winner!");
		} else if (player1.score < player2.score) {
			System.out.println(player2.name + " is the Winner!");
		} else {
			System.out.println("It is a draw!");
		} System.out.println("*******************");

		
	}
}
