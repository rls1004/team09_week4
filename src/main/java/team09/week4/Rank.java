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
		return this._defaultFee + (this._lines - 1) * 21.50f + this.exceedFee(used);		
	}
	
	public void setLine(int line){
		this._lines = line;
	}

	public float exceedFee(float used){
		float exceedUse = this._default - used;
		
		if(exceedUse > 0)
			return 0;
		else{
			exceedUse *= -1.f;
		}
		
		return exceedUse * this._exceedRate;
	}

}
