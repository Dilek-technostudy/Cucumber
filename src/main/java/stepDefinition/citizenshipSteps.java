package stepDefinition;

import PageObjectModel.citizenshipPage;
import PageObjectModel.leftNav;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class citizenshipSteps {
    leftNav lv = new leftNav();
    citizenshipPage cp = new citizenshipPage();

    @Given("^Click on citizenship$")
    public void click_on_citizenship() throws Throwable {
        lv.clickbuttonCitizenship();
    }

    @Given("^Type the citizenship name  \"(.*?)\"$")
    public void type_the_citizenship_name(String name) throws Throwable {
        cp.typeInTheInputCitizenName(name);
    }

    @Given("^Type the shortName \"(.*?)\"$")
    public void type_the_shortName(String shortName) throws Throwable {
        cp.typeIntheInputCitizenShortName(shortName);
    }



}
