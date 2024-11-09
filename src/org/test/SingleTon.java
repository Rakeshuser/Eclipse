package org.test;

public class SingleTon {
	
	
	//Private Variable
	private Practice practice;
	
	//Method
	public Practice getPracticeObj() {
		
		//null
		if (practice==null) {
			//to create new Obj
			practice = new Practice();
		}
		//Existing obj return
		return practice;
	}
	

}
