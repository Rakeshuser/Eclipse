package org.test;

public class Runner {
	
	public static void main(String[] args) {
		
		SingleTon singleTon = new SingleTon();
		
		Practice practiceObj = singleTon.getPracticeObj();
		
		practiceObj.getMessage();
		
		System.out.println(System.identityHashCode(practiceObj));

		Practice practiceObj2 = singleTon.getPracticeObj();
		
		practiceObj2.getMessage();
		
		System.out.println(System.identityHashCode(practiceObj2));
	
	
		Practice practiceObj3 = singleTon.getPracticeObj();
		
		practiceObj3.getMessage();
		
		System.out.println(System.identityHashCode(practiceObj3));
	
	}

}
