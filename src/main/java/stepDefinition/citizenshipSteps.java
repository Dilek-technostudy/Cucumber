package stepDefinition;

import PageObjectModel.leftNav;
import cucumber.api.java.en.Given;

public class citizenshipSteps {
    leftNav lv = new leftNav();

    @Given("^Click on citizenship$")
    public void click_on_citizenship() throws Throwable {
        lv.clickbuttonCitizenship();
    }
}