package data;

import com.github.javafaker.Faker;

public class checkoutform {
	static Faker X = new Faker();
	 
	public static String firstName = X.name().firstName();
	public static String lastName = X.name().lastName();

	public static String guestEmail = "testdoe1234@gmail.com";
	
	public static String company = "Test Company";
	public static String address = "Address 1";
	public static String city = "Test City";
	public static String zipCode = "3120";
	public static String phone = "091234567890";
	public static String provincePH = "Cavite";
	public static String CountryPH = "Philippines";

}
