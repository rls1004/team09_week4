package team09.week4;
import java.util.Scanner;

public class Output {
	//private variables
	private User user;
	
	//constructor
	public Output(){
		this.user = new User((float) 300,3,"Gold");
	}
	
	//public methods
	public void OutputBill()
	{
		System.out.println("사용한 데이터: " + user.getUsedRate());
		System.out.println("사용 라인: " + user.getLine());
		System.out.println("등급: " + user.getRank());
	}
}