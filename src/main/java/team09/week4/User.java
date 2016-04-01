package team09.week4;

public class User {
	private float usedRate;
	private int lines;
	private Rank rank;

	public User() {
	}

	public User(float usedRate, int lines, String rank) {
		this.usedRate = usedRate;
		this.lines = lines;

		if (rank.compareTo("Gold") == 0) {
			this.rank = new Gold();
		} else if (rank.compareTo("Silver") == 0) {
			this.rank = new Silver();
		}
	}

	public float getUsedRate() {
		return this.usedRate;
	}

	public int getLine() {
		return this.lines;
	}

	public Rank getRank() {
		return this.rank;
	}
}
