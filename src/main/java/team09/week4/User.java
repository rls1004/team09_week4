package team09.week4;

public class User {
	private String name;
	private String number;
	private float dataRate;
	private long useDate;
	private int guid;
	private Rank rank;
	
	public User()
	{
	}
	public User(String name, String number,float dataRate, long useDate,int guid, Rank rank )
	{
		this.name=name;
		this.number=number;
		this.dataRate=dataRate;
		this.useDate=useDate;
		this.guid=guid;
		this.rank=rank;
		
		
	}
	public String getName() {
		return name;
	}
	
	public String getNumber() {
		return number;
	}
	
	public float getDataRate() {
		return dataRate;
	}
	
	public long getUseDate() {
		return useDate;
	}
	
	public int getGuid() {
		return guid;
	}
	
	public Rank getRank() {
		return rank;
	}
	
	
}
