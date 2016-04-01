package team09.week4;

public class Calc {
	//private variables
	private User _user;
	
	//constructor
	public Calc(User user){
		this._user = user;
	}
	
	//public methods
	float calcCharge(){
		this._user.getRank().setLine(this._user.getLine());
		return this._user.getRank().calc(this._user.getUsedRate());
	}
}
