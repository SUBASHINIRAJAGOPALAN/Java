package com.demo;

public class PolymorphismOverride {
	public static void main(String args[]) {
	SingleLevelParent p1= new SingleLevelChild();// creating an object with parent class as an object -- object way
	p1.name1();
	}	
}

class SingleLevelParent{// parent class
	public void name1(){
		System.out.println("Parent Method");
	}
}
class SingleLevelChild extends SingleLevelParent{// child inherits from parent so parent's methods are overridden
	@Override//annotation - provides the info to system -- here it says the name() is there in parent class
	public void name1(){
		System.out.println("Child Method");	
	}
}



	// without annotation if the function to be override has some error it is highlighted if not used it considers it as a new method
	