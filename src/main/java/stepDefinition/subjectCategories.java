package stepDefinition;

import PageObjectModel.leftNav;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class subjectCategories {

    leftNav ln = new leftNav();

    @And("^Click on subject categories$")
    public void click_on_subject_categories() throws Throwable {

        ln.clickSubjectCategories();

    }

    @Then("^Subject Categories page should be displayed$")
    public void subject_Categories_page_should_be_displayed() throws Throwable {

        Thread.sleep(2000);
        String currentURL = ln.getURL();
        System.out.println(currentURL);
        Assert.assertTrue(currentURL.contains("subject-categories"));
    }
}