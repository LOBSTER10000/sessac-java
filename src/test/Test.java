package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class Test{
	
	
	public static void main(String[] args) {
		 ArrayList<Score> a = new ArrayList<>();
	     a.add(new Score(100,90));
	     a.add(new Score(100,100));
	     a.add(new Score(90, 89));
	
	     Collections.sort(a);
	     
	     a.stream().forEach((e)->System.out.println(e.getMath()));
	     
	     a.forEach((e)->System.out.println("math : " + e.getMath() + " eng : " +e.getEng()));
	}
}