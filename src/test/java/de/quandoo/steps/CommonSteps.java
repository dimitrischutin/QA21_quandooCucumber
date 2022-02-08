package de.quandoo.steps;

import com.codeborne.selenide.Condition;
import de.quandoo.pages.HomePage;
import de.quandoo.pages.RestBerlinPage;
import io.cucumber.java.en.Given;

import static com.codeborne.selenide.Selenide.open;
import static de.quandoo.pages.HomePage.basicURL;

public class CommonSteps {

    HomePage homePage;
    RestBerlinPage restBerlinPage;

    @Given("I am on the {} page")
    public void iAmOnHomePage(String page) {
        if (page.equals("Homepage")) {
            homePage = open(basicURL, HomePage.class);
            homePage.acceptAllCookies();

        }
        if (page.equals("Berlin")){
            restBerlinPage = open("https://www.quandoo.de/en/berlin", RestBerlinPage.class);
            restBerlinPage.acceptAllCookies();
            restBerlinPage.restBerlinPageTitle().shouldHave(Condition.exactText("Restaurants in Berlin"));
        }



    }
}
