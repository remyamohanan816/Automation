package utilities;

import com.github.javafaker.Faker;

public class Faker_Utility {
	Faker fake = new Faker();
	
	public String firstName()
	{
		return fake.name().firstName();
	}
	
	public String password()
	{
		return fake.internet().password();
	}
	public String email() 
	{
        return fake.internet().emailAddress();
    }
	public String phoneNumber() 
	{
        return fake.phoneNumber().cellPhone();
    }
	public String fullAddress()
	{
        return fake.address().fullAddress();
    }

}
