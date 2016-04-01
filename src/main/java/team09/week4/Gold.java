package team09.week4;

public class Gold extends Rank{
	//private variables
	private int _default;
	private float _exceedRate;
	private int _lines;
	
	//constructor
	public Gold(){
		
	}
	
	//public methods
	@Override
	public float Calc(){
		return -1;
	}
	
	public void setLine(int line){
		this._lines = line;
	}
}
