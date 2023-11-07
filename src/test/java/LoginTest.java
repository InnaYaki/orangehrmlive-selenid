
import jdk.jfr.Description;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static com.codeborne.selenide.Selenide.sleep;


public class LoginTest extends BaseTest {


    @Category(Smoke.class)

    @Test @Description( "success Login with val data")
    public void successLogin(){

        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();
        dashboardPage.dashboardPageIsOpen();
    }

@Test @ Description ("invalid Password")
public void invalidPassword (){

    loginPage.enterUserName("Admin");
    loginPage.enterPassword("admin123");
    loginPage.clickOnLoginButton();
    loginPage.checkTextErrorMessage("Invalid credentials");
}
@Test @ Description ("empty Fields")
public void emptyFields(){

    loginPage.clickOnLoginButton();
    loginPage.checkTextErrorMessageUserName("Required");
    loginPage.checkTextErrorMessagePassword("Required");
}

@Test
public void clickOnForgotYPasswordUrl(){
       sleep (2000);
       loginPage.clickOnForgotYourPassword();
       resetPasswordPage.visibleResetPassword();
       resetPasswordPage.urlIsCorrect("requestPasswordResetCode");

}

    @Test
    public void elementsAreVisible(){
        loginPage.logoIsDisplayed();
        loginPage.credentionSectionIsDisplayed();
        loginPage.linkedIsDisplayed ();
        loginPage.twitIsDisplayed();
        loginPage.youtubeIsDisplayed();
        loginPage.facebookIsDisplayed();
        loginPage.logoImageIsCorrect();
    }

    @Test
    public void linkedPageIsOpen (){
     loginPage.clickOnLinkedInLink();
     likedInPage.linkedInPageIsOpen();

    }
    @Test
    public void facebookPageIsOpen (){
        loginPage.clickOnFacebookLink();
        facebookPage.facebookInPageIsOpen();
    }
    @Test
    public void twitterPageIsOpen (){
        loginPage.clickOnTwitLink();
      twitterPage.twitterInPageIsOpen();
    }

    @Test
    public void youtubePageIsOpen (){
        loginPage.clickOnYoutubeLink();
        youtubePage.youtubeInPageIsOpen();
    }




}
