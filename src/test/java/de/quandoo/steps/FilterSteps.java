package de.quandoo.steps;

import com.codeborne.selenide.Condition;
import de.quandoo.pages.HomePage;
import de.quandoo.pages.RestBerlinPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Selenide.page;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FilterSteps {
    HomePage homePage;
    RestBerlinPage restBerlinPage;

    @When("I input Berlin")
    public void inputBerlin(){
        homePage = page(HomePage.class);
        homePage.inputBerlin("Berlin");
    }

    @And("I click  Find button")
    public void clickFindButton(){
         restBerlinPage = homePage.clickFindButton();
    }

    @Then("I see RestBerlin page")
    public void iSeeRestBerlinPage(){
        restBerlinPage.restBerlinPageTitle().shouldHave(Condition.exactText("Restaurants in Berlin"));
    }

    @When("I click  Top rated filter")
    public void iClickTopRatedButton(){
        restBerlinPage.clickTopRatedButton();
    }

    @Then("rating of the first restaurant is more than 4")
    public void firstRestaurantRatingIsMoreThen4(){
        assertTrue(restBerlinPage.getFirstRestaurantRating() >= 4);
    }


    @When("I click African in Cuisine filter")
    public void iClickAfricanInCuisineFilter(){
        restBerlinPage.selectAfricanCuisineFilter();
    }

    @Then("the first restaurant has African cuisine label")
    public void firstRestaurantHasAfricanCuisineLabel(){
        assertEquals(restBerlinPage.getAfricanRestaurantCount(), restBerlinPage.getRestaurantListSize());
    }
}
