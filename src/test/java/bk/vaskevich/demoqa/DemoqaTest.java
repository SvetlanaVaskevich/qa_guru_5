package bk.vaskevich.demoqa;

import bk.vaskevich.pages.RegistrationPage;
import org.junit.jupiter.api.Test;

import static bk.vaskevich.demoqa.TestData.*;

public class DemoqaTest extends TestBase{

    RegistrationPage registrationPage = new RegistrationPage();

    @Test
    public void fillFormTest() {
        //enter data
        registrationPage.openPage()
                .typeFirstName(firstName)
                .typeLastName(lastName)
                .typeEmail(email)
                .selectGender(gender)
                .typeMobile(phoneNumber)
                .setBirthDay(day,month,year)
                .selectSubjects(subject)
                .selectHobbies(hobbies)
                .uploadFile(filePath)
                .typeCurrentAddress(currentAddress)
                .selectState(state)
                .selectCity(city)
                .enterSubmit();
        //check results
        registrationPage
                .checkResult("Student Name", firstName + " " + lastName)
                .checkResult("Student Email", email)
                .checkResult("Gender",gender)
                .checkResult("Mobile",phoneNumber)
                .checkResult("Date of Birth",day + " " + month + "," + year)
                .checkResult("Subjects",subject)
                .checkResult("Hobbies",hobbies)
                .checkResult("Picture","1.png")
                .checkResult("Address",currentAddress)
                .checkResult("State and City",state + " " + city);
    }
}
