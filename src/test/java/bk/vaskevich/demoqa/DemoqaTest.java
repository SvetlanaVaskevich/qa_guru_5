package bk.vaskevich.demoqa;

import bk.vaskevich.pages.RegistrationPage;
import org.junit.jupiter.api.Test;

public class DemoqaTest extends TestBase{

    RegistrationPage registrationPage = new RegistrationPage();
    TestData testData = new TestData();

    @Test
    public void FillFormTest() {
        //enter data
        registrationPage.openPage()
                .typeFirstName(testData.firstName)
                .typeLastName(testData.lastName)
                .typeEmail(testData.email)
                .selectGender(testData.gender)
                .typeMobile(testData.phoneNumber)
                .setBirthDay("20","December","1995")
                .selectSubjects(testData.subject)
                .selectHobbies(testData.hobbies)
                .uploadFile()
                .typeCurrentAddress(testData.currentAddress)
                .selectState(testData.state)
                .selectCity(testData.city)
                .enterSubmit();
        //check results
        registrationPage
                .checkResult("Student Name",testData.firstName + " " + testData.lastName)
                .checkResult("Student Email",testData.email)
                .checkResult("Gender",testData.gender)
                .checkResult("Mobile",testData.phoneNumber)
                .checkResult("Date of Birth","20 December,1995")
                .checkResult("Subjects",testData.subject)
                .checkResult("Hobbies",testData.hobbies)
                .checkResult("Picture","1.png")
                .checkResult("Address",testData.currentAddress)
                .checkResult("State and City",testData.state + " " + testData.city);
    }
}
