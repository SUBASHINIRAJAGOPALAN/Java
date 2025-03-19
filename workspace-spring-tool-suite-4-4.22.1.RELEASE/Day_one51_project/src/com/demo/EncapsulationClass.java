package com.demo;
import java.util.Date;

public class EncapsulationClass {
	private  String username;// global private member
	private  String password;
	private  String email;
	private  String address;
	private  Date createdDate;
	private  Date updateAt;
	private  boolean isActive;
	
	public String getUsername(){
		return username;
	}
	public void setUsername( String username)// username - block variable so both username are different 
	{
		this.username=username;// to diffentiate to system using this to public member
		
	}
	public String getPassword(){
		return password;
	}
	public void setPassword( String password)// username - block variable so both username are different 
	{
		this.password=password;// to diffentiate to system using this to public member
		
	}
	public String getEmail(){
		return email;
	}
	public void setEmail( String email)// username - block variable so both username are different 
	{
		this.email=email;// to diffentiate to system using this to public member
		
	}
	public String getAddress(){
		return address;
	}
	public void setAddress(String address)// username - block variable so both username are different 
	{
		this.address=address;// to diffentiate to system using this to public member
		
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate=createdDate;
		
	}
	public Date getUpdateAt() {
		return updateAt;
		}
	public void setUpdateAt(Date updateAt)
	{
		this.updateAt=updateAt;
	}
	public boolean getIsActive()
	{
		return isActive;
	}
	public void setIsActive(boolean isActive) {
		this.isActive=isActive;
	}
}
