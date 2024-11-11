package data;

import com.github.javafaker.Faker;

import core.Hooks;

public class useraccount extends Hooks{
	
	static Faker X = new Faker();
	 
	public static String firstName = X.name().firstName();
	public static String lastName = X.name().lastName();
	public static String password = "Qwerty123";
	
	public static String emailTest ="johndoe1@gmail.com";
	public static String email = "mainemail@test.com";
	public static String email02 = "emailtwo@gmail.com";
	public static String email03 = "email3@gmail.com";
	public static String email04 = "email4@gmail.com";
	public static String email05 = "email5@gmail.com";
	
	public static String dummyEmail = "qwertest5@test.com";
	public static String dummyPassword = "Qwerty!!1234";
	
	
	
	

}
