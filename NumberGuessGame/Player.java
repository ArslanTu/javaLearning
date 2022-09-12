public class Player {
	private int guessNum;
	public int guess() {
		guessNum = (int)Math.random()*10;
		return guessNum;
	}
}