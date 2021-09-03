package commons;

import com.github.javafaker.Faker;
import com.github.javafaker.IdNumber;

public class DataHelper {
	private Faker faker;

	public static DataHelper getData() {
		return new DataHelper();
	}

	public DataHelper() {
		faker = new Faker();
	}
	
	public String getFirstName() {
		return faker.name().firstName();
	}
	public String getEditFirstName() {
		return faker.name().firstName();
	}
	
	public String getLastName() {
		return faker.name().lastName();
	}
	public String getEditLastName() {
		return faker.name().lastName();
	}
	
	public String getFullName() {
		return getFirstName() + " " + getLastName();
	}
	public String getEditFullName() {
		return getEditFirstName() + " " + getEditLastName();
	}
	public String getEmailAddress() {
		return faker.internet().emailAddress();
	}
	public String getPassword() {
		return faker.internet().password();
	}
	
	public String getUserName() {
		return faker.name().username();
	}
	
	public IdNumber getID() {
		return faker.idNumber();
	}
	
}
