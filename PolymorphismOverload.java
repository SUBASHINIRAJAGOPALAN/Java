package com.demo;
//overloading same method name different parameters 
public class PolymorphismOverload {
	public static void main(String args[]) {
		Name2 n= new Name2();
		n.mul();	
		System.out.println(n.mul(2));
		System.out.println(n.mul(5, 5));
	}
}

	class Name2{
		int a =10;
		int b =90;
		public void mul() {
			System.out.println("multiplication");
		}
	
		public int mul(int a ) {
			return a;
	}
		public int mul( int a, int b) {
			return a*b;
		}
}
