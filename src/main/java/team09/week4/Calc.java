package team09.week4;

public class Calc {
	//private variables
	private User user;
	
	//constructor
	public Calc(User user){
		this.user = user;
	}
	
	//public methods
	float calcCharge(){
		this.user.getRank().setLine(this.user.getLine());
		return this.user.getRank().calc(this.user.getUsedRate());
	}
}
