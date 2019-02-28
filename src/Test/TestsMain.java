package Test;

import java.util.ArrayList;

public class TestsMain {

	public static void main(String[] args) {
		ArrayList<String> test = new ArrayList<String>();
		test.add("1");
		test.add("*");
		test.add("e");
		test.add("4");
		test.add("*");
		test.add("*");
		test.add("3");
		test.add("+");
		
		System.out.println(test.contains("*")+" , "+test.indexOf("*")+" , "+test.remove("*")+test);
	}

}
