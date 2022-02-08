package bk.vaskevich.pages;

import bk.vaskevich.pages.components.CalendarComponent;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class RegistrationPage {

    private final String FORM_TITLE = "Student Registration Form";

    private SelenideElement
            formTitle = $(".practice-form-wrapper"),
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName"),
            emailInput = $("#userEmail"),
            mobileInput = $("#userNumber"),
            subjectsInput = $("#subjectsInput"),
            uploadFile = $("#uploadPicture"),
            currentAddressInput = $("#currentAddress"),
            state = $("#state"),
            city = $("#city"),
            stateCityWrapper = $("#stateCity-wrapper"),
            submitButton = $("#submit"),
            tableResults = $(".table-responsive");

    public CalendarComponent calendarComponent = new CalendarComponent();

    public RegistrationPage openPage(){
        open("/automation-practice-form");
        formTitle.shouldHave(Condition.text(FORM_TITLE));
        return this;
    }

    public RegistrationPage typeFirstName(String value){
        firstNameInput.setValue(value);
        return this;
    }

    public RegistrationPage typeLastName(String value){
        lastNameInput.setValue(value);
        return this;
    }

    public RegistrationPage typeEmail(String value){
        emailInput.setValue(value);
        return this;
    }

    public RegistrationPage selectGender(String value){
        $(byText(value)).click();
        return this;
    }

    public RegistrationPage typeMobile(String value){
        mobileInput.setValue(value);
        return this;
    }

    public RegistrationPage setBirthDay(String day,String month,String year){
        this.calendarComponent.setDate(day,month,year);
        return this;
    }

    public RegistrationPage typeCurrentAddress(String value){
        currentAddressInput.setValue(value);
        return this;
    }

    public RegistrationPage selectSubjects(String value){
        subjectsInput.setValue(value);
        return this;
    }

    public RegistrationPage selectHobbies(String value){
        $(byText(value)).click();
        return this;
    }

    public RegistrationPage uploadFile(){
        uploadFile.uploadFromClasspath("image/1.png");
        return this;
    }

    public RegistrationPage selectState(String value){
        state.scrollTo().click();
        stateCityWrapper.$(byText(value)).click();
        return this;
    }

    public RegistrationPage selectCity(String value){
        city.click();
        stateCityWrapper.$(byText(value)).click();
        return this;
    }

    public RegistrationPage enterSubmit(){
        submitButton.click();
        return this;
    }

    public RegistrationPage checkResult(String key, String value){
        tableResults.$(byText(key)).parent().shouldHave(Condition.text(value));
        return this;
    }
}
