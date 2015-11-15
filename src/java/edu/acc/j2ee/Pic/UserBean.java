package edu.acc.j2ee.Pic;

public class UserBean implements java.io.Serializable{
	private String name;
	private String password;
     
	
	public UserBean(){}
	
	public UserBean (String name, String password){
		this.name = name;
		this.password = password;
	}
	
	public String getName() {return name;}
	public String getPassword() {return password;}
	
	
	public void setName(String name) {this.name=name;}
	public void setPassword (String password) {this.password=password;}
	
	
	@Override public String toString(){
		return String.format("[user: %s]", name);
		
	}

  

   
}
