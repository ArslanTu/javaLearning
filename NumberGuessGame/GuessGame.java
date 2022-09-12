public class GuessGame {
	private Player p1, p2, p3;
	private int targetNum;

	public void startGame() {
		System.out.println("Now we start the game!");
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();
		targetNum = (int) (Math.random() * 10);
		System.out.println("The target number is: " + targetNum);
		while (true) {
			System.out.println("A new round now start!");
			int p1Num = p1.guess();
			int p2Num = p2.guess();
			int p3Num = p3.guess();
			System.out.println("Playe1 guess it's " + p1Num + ".");
			System.out.println("Playe2 guess it's " + p2Num + ".");
			System.out.println("Playe3 guess it's " + p3Num + ".");
			boolean p1IsRight = p1Num==targetNum;
			boolean p2IsRight = p2Num==targetNum;
			boolean p3IsRight = p3Num==targetNum;
			if(p1IsRight||p2IsRight||p3IsRight) {
				System.out.println("The winner has born!");
				if(p1IsRight) System.out.println("Player1 win the chair!");
				else if(p2IsRight) System.out.println("Player2 win the chair!");
				else System.out.println("Player3 win the chair!");
				break;
			}else {
				System.out.println("What a pity, we have to continue.");
			}
		}
	}
}