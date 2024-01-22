package test;

public class Numbers implements Comparable<Numbers>{
	public final double values;
	
	public Numbers(double values) {
		this.values = values;
	}
	
	
	@Override
	public int compareTo(Numbers o) {
		if(this.values - o.values < 0) return -1;
		else if(this.values - o.values > 0) return 1;
		else return 0;
	}
	
	
	public static void main(String[] args) {
		Numbers n = new Numbers(50);
		Numbers n2 = new Numbers(100);
		Numbers n3 = new Numbers(100);
		System.out.println(n.compareTo(n2));
		System.out.println(n2.compareTo(n3));
	}
}
