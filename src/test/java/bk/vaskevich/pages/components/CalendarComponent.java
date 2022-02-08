package bk.vaskevich.pages.components;

import static com.codeborne.selenide.Selenide.$;
import static java.lang.String.format;

public class CalendarComponent {

    public void setDate(String day,String month,String year){
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").click();
        $(".react-datepicker__month-select").selectOption(month);
        $(".react-datepicker__year-select").selectOption(year);
        //$(".react-datepicker__day.react-datepicker__day--023").click();
        $(".left-pannel").scrollTo();
        String dayLocator = format(".react-datepicker__day--0%s:not(.react-datepicker__day--outside-month)",day);
        $(dayLocator).click();

    }
}
