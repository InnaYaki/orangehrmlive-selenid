import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static org.junit.Assert.assertTrue;

public class ResetPasswordPage {

    private SelenideElement resetPassword = $ (byXpath("//div [@class='orangehrm-card-container']"));

    public void visibleResetPassword () {
        resetPassword.shouldBe(visible, Duration.ofSeconds(10));


    }

    public void urlIsCorrect (String expectedText){
      assertTrue  (WebDriverRunner.getWebDriver().getCurrentUrl().contains("requestPasswordResetCode"));

    }



}


