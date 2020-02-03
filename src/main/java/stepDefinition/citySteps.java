package stepDefinition;

import PageObjectModel.cityPage;
import PageObjectModel.leftNav;
import cucumber.api.java.en.Given;

public class citySteps {
    leftNav lv = new leftNav();
     cityPage cp = new cityPage();
    @Given("^Click on City$")
    public void click_on_City() throws Throwable {
        lv.clickOnbuttonCity();
    }

    @Given("^Choose any value from the dropdown$")
    public void choose_any_value_from_the_dropdown() throws Throwable {
             cp.handlingDropdown();
    }
}
