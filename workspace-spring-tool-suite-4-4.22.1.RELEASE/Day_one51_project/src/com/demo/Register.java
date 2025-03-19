package com.demo;

import java.util.Scanner;
import java.util.Date;


public class Register {
	public static void main(String args[]) {
		Scanner in = new Scanner (System.in);
		System.out.println(" enter the username");
		String username= in.nextLine();
		
		System.out.println("enter your password");
		String password= in.nextLine();
		
		System.out.println("enter your email id");
		String email = in.next();
		
		System.out.println("enter your address");
		String address= in.nextLine();
		
		Date createdDate = new Date();
		
		Date updateAt= new Date();
		
		boolean isActive = true;
		
		EncapsulationClass person1= new EncapsulationClass();
		person1.setUsername(username);
		person1.setPassword(password);
		person1.setEmail(email);
		person1.setAddress(address);
		person1.setCreatedDate(createdDate);
		person1.setUpdateAt(updateAt);
		person1.setIsActive(isActive);
			
	    System.out.println(person1.getUsername());
	    System.out.println(person1.getPassword());
	    System.out.println(person1.getEmail());
	    System.out.println(person1.getAddress());
	    System.out.println(person1.getCreatedDate());
	    System.out.println(person1.getUpdateAt());
	    System.out.println(person1.getIsActive());
				
	}
}
