package test;

import java.io.PrintStream;

public class Exceptions {
	public int e1;
	public int e2;
	
	public Exceptions(int e1, int e2) {
		this.e1 = e1;
		this.e2 = e2;
	}
	
	
	class LocalExceptions extends Exception{
		public LocalExceptions(String msg) {
			super(msg);
		}
	}
	
	public int sum(int e1, int e2) throws LocalExceptions{
		if(e1 + e2 == 3) {
			throw new LocalExceptions("합계가 3입니다");
		}
		else {
			return e1 + e2;
		}
	}
	
	public static void main(String[] args) {
		Exceptions instance = new Exceptions(1,2);
		
		try {
			instance.sum(1,2);
		} catch(LocalExceptions e) {
			System.out.println(e.getMessage());
		}

	}

}
