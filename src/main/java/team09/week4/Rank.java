package team09.week4;

public class Rank {
	//protected variable
	protected int _default;
	protected float _exceedRate;
	protected int _lines;
	protected float _defaultFee;
	
	//constructor
	public Rank(){
		this._lines = 1;
	}
	
	//public method
	public float Calc(float used){
		float fees = 0;
		fees = this._defaultFee + (this._lines - 1) * 21.50f + this.exceedFee(used);
		
		return fees;	
	}
	
	public void setLine(int line){
		this._lines = line;
	}

	public float exceedFee(float used){
		float eFee = 0.f;
		float exceedUse = this._default - used;
		
		if(exceedUse > 0)
			return 0;
		else{
			exceedUse *= -1.f;
			eFee = exceedUse * this._exceedRate;
		}
		
		return eFee;
	}

}
