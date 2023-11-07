import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class LoginPage {

    private SelenideElement userNameField = $("[name = 'username']");
    private SelenideElement passwordField = $(byCssSelector("[name='password']"));
    private SelenideElement loginButton = $(byAttribute("type", "submit"));

    private SelenideElement errorMessage = $(byXpath("//p [@class='oxd-text oxd-text--p oxd-alert-content-text']"));

    private SelenideElement useNameRegMessage = $(byXpath("(//span[contains(@class, 'oxd-input-field-error-message')])[1]"));

    private SelenideElement password = $(byXpath("(//span[contains(@class, 'oxd-input-field-error-message')])[2]"));

    private SelenideElement forgotYourPassword = $(byXpath("//p[@class = 'oxd-text oxd-text--p orangehrm-login-forgot-header']"));

    private SelenideElement logo = $(byAttribute("alt", "company-branding"));

    private SelenideElement credentionSection = $ (byClassName("orangehrm-demo-credentials"));

    private SelenideElement linkedinLink = $(byCssSelector("[href*='linkedin']"));

    private SelenideElement facebookLink = $(byCssSelector("[href*='facebook']"));

    private SelenideElement twitLink = $(byCssSelector("[href*='twitter']"));

    private SelenideElement youtubeLink = $(byCssSelector("[href*='youtube']"));




    @Step("Enter to user name field")
    public void enterUserName(String usernameValue) {
        userNameField.shouldBe(visible, Duration.ofSeconds(10));
        userNameField.setValue(usernameValue);
    }

    @Step("Enter value to password field")
    public void enterPassword(String passwordValue) {
        passwordField.shouldBe(visible, Duration.ofSeconds(10));
        passwordField.setValue(passwordValue);

    }

    @Step("push login button")
    public void clickOnLoginButton() {
        loginButton.shouldBe(enabled);
        loginButton.click();

    }

    public void checkTextErrorMessage(String errorTextValue) {
        errorMessage.shouldBe(visible, Duration.ofSeconds(10));
        errorMessage.shouldHave(text(errorTextValue));

    }

    public void checkTextErrorMessageUserName(String expectedText) {
        useNameRegMessage.shouldBe(visible, Duration.ofSeconds(10));
        useNameRegMessage.shouldHave(text(expectedText));
    }

    public void checkTextErrorMessagePassword(String expectedText1) {
        password.shouldBe(visible, Duration.ofSeconds(10));
        password.shouldHave(text(expectedText1));
    }

    public void clickOnForgotYourPassword() {
        //ForgotYourPassword.shouldBe(enabled);
        forgotYourPassword.click();
    }

    public void logoIsDisplayed (){
        logo.shouldBe(visible);
    }
    public void logoImageIsCorrect (){
        logo.shouldHave(attributeMatching("src",
                ".*branding.png.*"));
    }

    public void credentionSectionIsDisplayed   (){
        credentionSection.shouldBe(visible);
    }

    public  void linkedIsDisplayed () {
        linkedinLink.shouldBe(visible);
    }
    public void clickOnLinkedInLink (){
        linkedinLink.shouldBe(enabled);
        linkedinLink.click();
    }
    public void facebookIsDisplayed   (){
        facebookLink.shouldBe(visible);
    }
    public void clickOnFacebookLink  (){
        facebookLink.shouldBe(enabled);
        facebookLink.click();
    }

    public void twitIsDisplayed   (){
        twitLink.shouldBe(visible);
    }
    public void clickOnTwitLink (){
        twitLink.shouldBe(enabled);
        twitLink.click();
    }

    public void youtubeIsDisplayed   (){
        youtubeLink.shouldBe(visible);
    }
    public void clickOnYoutubeLink (){
        youtubeLink.shouldBe(enabled);
        youtubeLink.click();
    }

    public void successLogin(String usernameValue, String passwordValue){
        userNameField.shouldBe(visible, Duration.ofSeconds(10));
        userNameField.setValue(usernameValue);
        passwordField.shouldBe(visible);
        passwordField.setValue(passwordValue);
        loginButton.shouldBe(enabled);
        loginButton.click();
    }

}