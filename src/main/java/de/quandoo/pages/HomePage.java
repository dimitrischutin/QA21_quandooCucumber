package de.quandoo.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import de.quandoo.util.PropertiesLoader;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

/**
 * HomePage
 * Class implements the HomePage methods and fields.
 */
public class HomePage {
    /* Properties */

    public static String basicURL = PropertiesLoader.loadProperty("url");

    /* Elements */

    private static By accCookies = By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");
    private static By loginIcon = By.xpath("//a[@data-qa='header-login-btn']");
    private static By signUpIcon = By.xpath("//a[@data-qa='header-register-btn']");
    private static By homePageLogo = By.cssSelector(".hBJuXh");
    private static By userIcon = By.xpath("//button[@data-qa='header-navigation-button']");
    private static By logoutItemMenu = By.xpath("//div[@data-qa='header-navigation-logout']");

    /** Methods **/

    public void acceptAllCookies() {
        pause(2000);
        if ($(accCookies).exists()){
            $(accCookies).click();
        }
    }

    public SelenideElement homePageLogo(){
        return $(homePageLogo);
    }

    public LoginPage clickLoginIcon() {
        $(loginIcon).click();
        return Selenide.page(LoginPage.class);
    }

    public CreateAccountPage clickSignUpIcon() {
        $(signUpIcon).click();
        return Selenide.page(CreateAccountPage.class);
    }

    public void hoverUserIcon() {
        $(userIcon).hover();
    }

    public SelenideElement logoutItemMenu() {
        return $(logoutItemMenu);
    }

    public void pause(int millis) {
        try {
            Thread.sleep(millis);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void clickLogoutItemMenu() {
        $(logoutItemMenu).click();
    }

    public SelenideElement UserIcon() {
        return $(userIcon);
    }
}
