package com.javaprograms.javaInheritance;

public class TestInheritance {

	public static void main(String[] args) {
		
		Bass bass = new Bass();
		bass.setName("Gibson");
		bass.setNumbStrings(4);
		bass.setSerialNum(12875);
		
		
		System.out.println(bass.getName() + ", " + bass.getNumbStrings() + ", " + bass.getSerialNum());
	}

}
