package stepDefinition;

import PageObjectModel.leftNav;
import cucumber.api.java.en.Given;

public class natioanlitySteps {
    leftNav lv = new leftNav();

    @Given("^Click on Nationality$")
    public void click_on_Nationality() throws Throwable {
        lv.clickOnbuttonNatioanlity();
    }

    }

