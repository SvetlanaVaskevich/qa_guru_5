package bk.vaskevich.demoqa;

import com.github.javafaker.Faker;

public class TestData {

    static Faker faker = new Faker();

    public static String firstName = faker.name().firstName();
    public static String lastName = faker.name().lastName();
    public static String email = faker.internet().emailAddress();
    public static String gender = "Female";
    public static String phoneNumber = faker.phoneNumber().subscriberNumber(10);
    public static String day = "23";
    public static String month = "December";
    public static String year = "1987";
    public static String filePath = "image/1.png";
    public static String subject = "History";
    public static String hobbies = "Music";
    public static String currentAddress = faker.address().fullAddress();
    public static String state = "Haryana";
    public static String city = "Karnal";
}
