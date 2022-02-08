package bk.vaskevich.demoqa;

import com.github.javafaker.Faker;

public class TestData {

    Faker faker = new Faker();

    public String firstName = faker.name().firstName();
    public String lastName = faker.name().lastName();
    public String email = faker.internet().emailAddress();
    public String gender = "Female";
    public String phoneNumber = faker.phoneNumber().phoneNumber();
    public String subject = "History";
    public String hobbies = "Music";
    public String currentAddress = faker.address().fullAddress();
    public String state = "Haryana";
    public String city = "Karnal";
}
