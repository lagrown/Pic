package edu.acc.j2ee.Pic;




public class UserValidator {
	public static boolean validate (UserBean user){
		return user.getPassword().length() == 1 &&
				user.getName().length() == 7;
	}
}