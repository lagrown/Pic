package edu.acc.j2ee.Pic;


import javax.servlet.ServletConfig;

public class UserAuthenticator{
	private ServletConfig sc;
	
	public UserAuthenticator(ServletConfig sc){
		this.sc = sc;
	}
	
	public boolean authenticate (UserBean user){
		if(user == null || user.getName() == null || user.getPassword() == null)
			return false;
		if (user.getName().equals(sc.getInitParameter("validUserName")) &&
			user.getPassword().equals(sc.getInitParameter("validPassword"))) {
			
			return true;
		}else return false;
	}
	
	
}