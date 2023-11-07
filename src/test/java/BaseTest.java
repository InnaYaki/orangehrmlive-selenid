import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.After;
import org.junit.Before;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;



    public  class BaseTest {

        public final String BASE_URL ="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
@Before

        public void setUp (){
    //Configuration.browser = "firefox";
    //Configuration.headless = true;
     //Configuration.fastSetValue = true;
      //Configuration.timeout = 7000;
    //Configuration.browserSize = "400x400";
       SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    open (BASE_URL);
}



@After
    public void  tearDown (){
  closeWebDriver();
    }

        LoginPage loginPage = new LoginPage();
        DashboardPage dashboardPage = new DashboardPage();
        ResetPasswordPage resetPasswordPage = new ResetPasswordPage();

        LikedInPage likedInPage = new LikedInPage ();
        FacebookPage facebookPage = new FacebookPage();
        TwitterPage twitterPage = new TwitterPage();
        YoutubePage youtubePage = new YoutubePage();

        SideBar sideBar = new SideBar();



}
